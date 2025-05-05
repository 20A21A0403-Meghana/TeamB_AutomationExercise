package product_Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericRepository.BaseConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
	public class TestCase_11 extends BaseConfig{
	

		@Test
		public void Verify_Subscription_in_Cart_page() {
		// Configure the Browser
			WebDriverManager.chromedriver().setup();

			// Step_1:Launch the Browser
			WebDriver driver = new ChromeDriver();

			// Step_2:Navigate the appln Via Url
			driver.get("https://www.automationexercise.com/");
			// Step_3
			System.out.println("Home Page is Visible");

			// Step_4:Click on the "cart" button
			driver.findElement(By.xpath("//a[@href=\"/view_cart\"]")).click();
			System.out.println("Cart clicked");

			// Step_5:Perform Scrolling Action for Footer
			JavascriptExecutor js = (JavascriptExecutor) driver;

			// Step6:Identify the WebElement for Subscription
			WebElement element = driver.findElement(By.xpath("//h2[text()='Subscription']"));

			js.executeScript("arguments[0].scrollIntoView(false)", element);
			System.out.println("Scrolling done for Subscription Successfully");

			// Step7:Enter Email and Click arrow
			driver.findElement(By.id("susbscribe_email")).sendKeys("lavanyapampana554@gmail.com");
			driver.findElement(By.id("subscribe")).click();

			//Step_8: Verify Success message You have been Successfully Subscribed is Visible
			WebElement web = driver.findElement(By.xpath("//a[text()='Blue Top']"));
			boolean b=web.isDisplayed();
			if(b) {
				System.out.println("Product is Visiblr");
			}
			else {
				System.out.println("Prod is not visible");
			}
			WebElement web2 = driver.findElement(By.xpath("//a[text()='Men Tshirt']"));
			boolean b1=web2.isDisplayed();
			if(b1) {
				System.out.println("Product is Visiblr");
			}
			else {
				System.out.println("Prod is not visible");
			}
			
			Reporter.log("You have been Successfully Subscribed is visible",true);

			driver.quit();

		}
	}

