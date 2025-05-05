package product_Test;
import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericRepository.BaseConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_16 extends BaseConfig{


	
	@Test
	
	public void Place_Order_Login_before_Checkout() {
		// Configure the browser

		WebDriverManager.chromedriver().setup();

		// Launch the browser

		WebDriver driver = new ChromeDriver();

		// navigate to the application

		driver.get("https://automationexercise.com");

		// maximize the browser

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		// Verifying home page is displayed or not

		String exp_url = driver.getCurrentUrl();

		String act_url = "https://automationexercise.com/";

		if (exp_url.equals(act_url)) {

			System.out.println("Home Page is displayed");

		} else {

			System.out.println("Home Page is not displayed");
		}
		// Identify the login/signin button and click on it

		driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();

		// Identity mail text field and enter mail

		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("meghanaadapa07@gmail.com");
		// Identify password textfeild and enter password
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("Meghana@123");
		// Identify login button and click on it

		driver.findElement(By.xpath("//button[text()='Login']")).click();

		// Verify user is login or not

		WebElement element = driver.findElement(By.xpath("//li/a/i[@class=\"fa fa-user\"]"));

		Boolean res = element.isDisplayed();

		if (res) {

			System.out.println("Logged in as user is displayed");

		} else {

			System.out.println("Logged in as user is not displayed");
		}
		// Click on products

		driver.findElement(By.xpath("//i[@class='material-icons card_travel']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,500)");
		// Add a product to cart

		driver.findElement(By.xpath("//a[@class='btn btn-default add-to-cart']")).click();

		// Click on view cart and verify product is visible in cart

		driver.findElement(By.xpath("//a/u[text()='View Cart']")).click();

		String act_url2 = driver.getCurrentUrl();

		String exp_url2 = "https://automationexercise.com/view_cart";

		if (act_url2.endsWith(exp_url2)) {

			System.out.println("All products are added to cart");

		} else {

			System.out.println("All products are not added to cart");
		}
		// Click on proceed to pay

		driver.findElement(By.xpath("//a[text()='Proceed To Checkout']")).click();
		// Click on place order

		js.executeScript("window.scrollBy(0,500)");

		driver.findElement(By.xpath("//a[text()='Place Order']")).click();

		// Enter the card details

		driver.findElement(By.name("name_on_card")).sendKeys("MeghanaAdapa");

		driver.findElement(By.name("card_number")).sendKeys("123456778");

		driver.findElement(By.xpath("//input[@name='cvc']")).sendKeys("324");

		driver.findElement(By.name("expiry_month")).sendKeys("05");

		driver.findElement(By.name("expiry_year")).sendKeys("2026");

		// Click on pay and confirm order

		driver.findElement(By.xpath("//button[text()='Pay and Confirm Order']")).click();

		// Verify order is placed or not

		WebElement ele = driver.findElement(By.xpath("//p[text()='Congratulations! Your order has been confirmed!']"));

		Boolean text = ele.isDisplayed();

		if (text) {

			System.out.println("'Your order is placed' message is displayed");

		} else {

			System.out.println("'Your order is placed' message is not displayed");
		}
		// Click on delete account

		driver.findElement(By.xpath("//i[@class='fa fa-trash-o']")).click();

		// Verify account is deleted or not

		WebElement elem1 = driver.findElement(By.xpath("//p[text()='Your account has been permanently deleted!']"));

		Boolean text1 = elem1.isDisplayed();

		if (text1) {

			System.out.println("'Account is deleted' message is displayed");

		} else {

			System.out.println("'Account is deleted' message is not displated");
		}
		// Click on continue

		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		Reporter.log("execution completed",true);

		// Close the browser

		driver.close();
	}
}
