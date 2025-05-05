package product_Test;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedCondition;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import GenericRepository.BaseConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class TestCase_02 extends BaseConfig {
		
		@Test
		public void Login_User_with_correct_email_and_password() {
			driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
			//driver.findElement(By.xpath("//h2[text()='Login to your account']")).click();
			driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("ramya");
			driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")).sendKeys("ram092@gmail.com");
			driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]")).click();
			driver.findElement(By.xpath("//input[@id=\"id_gender2\"]")).click();
			driver.findElement(By.xpath("//input[@data-qa=\"password\"]")).sendKeys("chitti");
			WebElement ele1= driver.findElement(By.xpath("//select[@id=\"days\"]"));
			Select s1=new Select(ele1);
			s1.selectByIndex(6);
			driver.findElement(By.xpath("//select[@id=\"months\"]")).sendKeys("jan");
			driver.findElement(By.xpath("//select[@id=\"years\"]")).sendKeys("2003");
			driver.findElement(By.xpath("//input[@id=\"newsletter\"]")).click();
			driver.findElement(By.xpath("//input[@id=\"optin\"]")).click();
			driver.findElement(By.xpath("//input[@name=\"first_name\"]")).sendKeys("ramya");
			driver.findElement(By.xpath("//input[@name=\"last_name\"]")).sendKeys("masuri");
			driver.findElement(By.xpath("//input[@data-qa=\"company\"]")).sendKeys("POL");
			driver.findElement(By.xpath("//input[@id=\"address1\"]")).sendKeys("Yrp");
			driver.findElement(By.xpath("//input[@id=\"address2\"]")).sendKeys("HYD");
			WebElement ele2=driver.findElement(By.xpath("//select[@id=\"country\"]"));
			Select s2=new Select(ele2);
			s1.selectByIndex(3);
			driver.findElement(By.xpath("//input[@id=\"state\"]")).sendKeys("Telangana");
			driver.findElement(By.xpath("//input[@id=\"city\"]")).sendKeys("kmr");
			driver.findElement(By.xpath("//input[@id=\"zipcode\"]")).sendKeys("67567");
			driver.findElement(By.xpath("//input[@id=\"mobile_number\"]")).sendKeys("67567766");
			driver.findElement(By.xpath("//button[@data-qa=\"create-account\"]")).click();
			String text=driver.findElement(By.xpath("//div[@class='col-sm-9 col-sm-offset-1']")).getText();
			driver.findElement(By.xpath("//a[@data-qa=\"continue-button\"]")).click();
			System.out.println(text);
			WebDriverWait wait=new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class=\"fa fa-trash-o\"]")));
			System.out.println("Element is Visible");
			driver.findElement(By.xpath("//a[@href=\"/delete_account\"]")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[text()='Account Deleted!']")));
			System.out.println("Account Deleted is visible");
			System.out.println("Execution Completed");
			driver.close();
		}
	
}
