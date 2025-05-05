package product_Test;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import ExelFileUtility.ReadExcelFile;
import GenericRepository.BaseConfig;
import PageRepsitory.DeletePage;
import PageRepsitory.SignUp_Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import PropertiesfileUtility.ReadPropertyFile;

public class TestCase_01 extends BaseConfig {

	
	@Test
	public void Register_User() {

		//Fetch The Name From Excel
		String username = excelLibrary.readData("LoginDetails", 1, 0);

		SignUp_Page sinobj = new SignUp_Page(driver);
		DeletePage dpage=new DeletePage(driver);

		//Step1: Click on Signup/Login button
		sinobj.getLogin().click();

		// Step2.1:Enter name in the Name TextFielld
		sinobj.getName().sendKeys(username);
		//sinobj.getName().sendKeys(excelLibrary.readData("LoginDetails", 1, 1));
		
		// Step2.2:Enter Email in the Email TextFielld
		sinobj.getEmail().sendKeys(excelLibrary.readData("LoginDetails", 1, 1));
		
		// Click on Signup button
		sinobj.getSingup().click();

		// Click on male checkbox
		sinobj.getTitle().click();

		// Enter password
		sinobj.getPassword().sendKeys(excelLibrary.readData("LoginDetails", 1, 2));

		// Select Date/month/year
		Select dayfield = new Select(sinobj.getDD());
		dayfield.selectByIndex(6);
		Select monthfield = new Select(sinobj.getMM());
		monthfield.selectByIndex(2);
		Select yearfield = new Select(sinobj.getYy());
		yearfield.selectByIndex(4);

		// Click on new Shelter
		sinobj.getCheckBox().click();

		sinobj.getCheckBox2().click();
		sinobj.getFrstname().sendKeys(excelLibrary.readData("LoginDetails", 1, 3));
		sinobj.getLastname().sendKeys(excelLibrary.readData("LoginDetails", 1, 4));
		sinobj.getCompany().sendKeys(excelLibrary.readData("LoginDetails", 1, 5));
		sinobj.getAdrs1().sendKeys(excelLibrary.readData("LoginDetails", 1, 6));
		sinobj.getAdrs2().sendKeys(excelLibrary.readData("LoginDetails", 1, 7));
		Select countryfield = new Select(sinobj.getCountry());
		countryfield.selectByIndex(3);
		sinobj.getState().sendKeys(excelLibrary.readData("LoginDetails", 1, 8));
		sinobj.getCity().sendKeys(excelLibrary.readData("LoginDetails", 1, 9));
		sinobj.getZipcod().sendKeys(excelLibrary.readData("LoginDetails", 1, 10));
		sinobj.getMobil().sendKeys(excelLibrary.readData("LoginDetails", 1, 11));
		sinobj.getAccountCreate().click();
//		String textmsg = sinobj.gettext().getText();
//		System.out.println(textmsg);
		sinobj.getContinue().click();
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(dpage.getdeletevisible()));
//		System.out.println("Element is Visible");
		dpage.getdeletebutton().click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[text()='Account Deleted!']")));
//		System.out.println("Account Deleted is visible");
		System.out.println("Execution Completed");
		driver.close();
	}

}