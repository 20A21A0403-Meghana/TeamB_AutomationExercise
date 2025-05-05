package validation;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageRepsitory.ContactUs;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Contact_validation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.automationexercise.com/");
		ContactUs con=new ContactUs(driver);
		con.getConactus().click();
		con.getGetInTouch().click();
		con.getname().sendKeys("Ramzz");
		con.getemail().sendKeys("ram22@gmail.com");
		con.getsubject().sendKeys("selenium");
		con.getmessage().sendKeys("Hi...");
		WebElement ele=driver.findElement(By.xpath("//input[@name=\"upload_file\"]"));
		File obj=new File("./Data3/2025-43-28-03-43-47.png");
		obj.getAbsolutePath();
		con.getfile().click();
//		con.getsubmit().click();
//		con.gettext().getText();
	}

}
