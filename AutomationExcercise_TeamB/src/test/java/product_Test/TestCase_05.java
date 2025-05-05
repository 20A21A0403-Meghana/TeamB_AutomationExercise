package product_Test;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericRepository.BaseConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

		public class TestCase_05 extends BaseConfig {
		@Test
		public void Register_User_with_existing_email() {
			
			//Click on login button
			driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
			
			//driver.findElement(By.xpath("//h2[text()='Login to your account']")).click();
			driver.findElement(By.xpath("//input[@data-qa=\"signup-name\"]")).sendKeys("chitty");
			
			//enter email in email text field
			driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")).sendKeys("chitty21@gmail.com");
			
			//click on signup button
			driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]")).click();
			System.out.println("Email address is already Exist");


	}

}
