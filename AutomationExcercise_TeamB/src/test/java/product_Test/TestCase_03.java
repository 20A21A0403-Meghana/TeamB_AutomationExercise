package product_Test;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericRepository.BaseConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

	public class TestCase_03 extends BaseConfig {
		
		@Test
		public void Login_User_with_incorrect_email_and_password() {
			
			driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
			WebElement text=driver.findElement(By.xpath("//h2[text()='Login to your account']"));
			boolean res=text.isDisplayed();
			driver.findElement(By.xpath("(//input[@type=\"email\"])[1]")).sendKeys("chitty21@gmail.com");
			driver.findElement(By.xpath("(//input[@type=\"password\"])[1]")).sendKeys("chitty");
			driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]")).click();
			WebElement text1=driver.findElement(By.xpath("//p[text()='Your email or password is incorrect!']"));
			boolean res1=text1.isDisplayed();
			
			System.out.println("Email Address or Password is incorrect....!!!!!!");
			driver.close();
		}

	}


