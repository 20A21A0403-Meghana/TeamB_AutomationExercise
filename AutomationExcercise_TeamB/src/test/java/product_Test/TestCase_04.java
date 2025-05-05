package product_Test;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericRepository.BaseConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

	public class TestCase_04 extends BaseConfig {
    
			@Test
			public void  Logout_User() {
				
			driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
			driver.findElement(By.xpath("//h2[text()='Login to your account']")).click();
			driver.findElement(By.xpath("(//input[@type=\"email\"])[1]")).sendKeys("chitty21@gmail.com");
			driver.findElement(By.xpath("(//input[@type=\"password\"])[1]")).sendKeys("chitty");
			driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]")).click();
			driver.findElement(By.xpath("//a[@href=\"/logout\"]")).click();
		}

	}


	

	
