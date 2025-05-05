package validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import PageRepsitory.SignUp_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp_Validation {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.automationexercise.com/");
		
		SignUp_Page obj=new SignUp_Page(driver);
		obj.getLogin().click();
		obj.getName().sendKeys("ramz");
		obj.getEmail().sendKeys("ram22@gmail.com");
		obj.getSingup().click();
		obj.getTitle().click();
		obj.getPassword().sendKeys("chitty");
		obj.getDD().click();
		obj.getMM().click();
		obj.getYy().click();
		obj.getCheckBox().click();
		obj.getCheckBox2().click();
		obj.getFrstname().sendKeys("ramya");
		obj.getLastname().sendKeys("masuri");
		obj.getCompany().sendKeys("TECH MAHINDRA");
		obj.getAdrs1().sendKeys("hyd");
		obj.getAdrs2().sendKeys("KPHB");
		obj.getCountry();
		obj.getState().click();
		obj.getCity().click();
		
		
	}

}
