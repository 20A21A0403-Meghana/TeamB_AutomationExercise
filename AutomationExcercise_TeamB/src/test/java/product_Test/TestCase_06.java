package product_Test;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericRepository.BaseConfig;
import PageRepsitory.ContactUs;
import PageRepsitory.SignUp_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_06 extends  BaseConfig {

	@Test
	public void Contact_Us_Form() throws InterruptedException {
		ContactUs conobj=new ContactUs(driver);
		SignUp_Page sinobj=new SignUp_Page(driver);
	
		
		//Click on Contactus
		conobj.getConactus().click();
		
		//click on GET IN TOUCH
		//conobj.getGetInTouch().click();
		
		//Enter name in name text field
		sinobj.getName().sendKeys(excelLibrary.readData("LoginDetails", 1, 0));
		
		//Enter Email address in email teext field
		sinobj.getEmail().sendKeys(excelLibrary.readData("LoginDetails", 1, 1));
		
		//Click on subject and enter subject in subject text field
		conobj.getsubject().sendKeys(excelLibrary.readData("LoginDetails", 1, 12));
		
		//Enter message in text field
		conobj.getmessage().sendKeys(excelLibrary.readData("LoginDetails", 1, 13));
		
		//select file and upload the file
		File obj=new File("C:\\Users\\hi\\AutomationExcercise_TeamB\\Screenshot\\1.png");
		String path=obj.getAbsolutePath();
		conobj.getfile().sendKeys(path);
		
		
		//Click on Submit Button
		conobj.getsubmit().click();
		Thread.sleep(1000);
		//driver.switchTo().alert().accept();
		
		String text=conobj.gettext().getText();
		System.out.println(text);
		Reporter.log("Execution completed",true);
		//Close the browser
		driver.close();
	}
}

