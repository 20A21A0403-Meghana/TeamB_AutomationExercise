package product_Test;
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

public class TestCase_20 extends BaseConfig{
	
	@Test
	
	public void Search_Products_and_Verify_Cart_After_Login() {

		// Configure the browser
		WebDriverManager.chromedriver().setup();

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// navigate to the application
		driver.get("https://automationexercise.com");

		// maximize the browser
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Click on products
		driver.findElement(By.xpath("//i[@class='material-icons card_travel']")).click();
		// Verifying products page is displayed or not
		String act_url = driver.getCurrentUrl();
		String exp_url = "https://automationexercise.com/products";
		if (act_url.equals(exp_url)) {
			System.out.println("Products page is displayed");
		} else {
			System.out.println("Products page is not displayed");
		}
		// Search for a product
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("tshirt");
		driver.findElement(By.xpath("//button[@id='submit_search']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		// Verify search related products are displayed
		String act_url1 = driver.getCurrentUrl();
		String exp_url1 = "https://automationexercise.com/products?search=tshirt";
		if (act_url1.equals(exp_url1)) {
			System.out.println("Searched related products are displayed");
		} else {
			System.out.println("Searched related products are not displayed");
		}

		// Add a product to cart and click on continue shopping
		driver.findElement(By.xpath("//a[@data-product-id='2']")).click();
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		// Add a product to cart and click on continue shopping
		driver.findElement(By.xpath("//a[@data-product-id='28']")).click();
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		// Add a product to cart and click on continue shopping
		driver.findElement(By.xpath("//a[@data-product-id='29']")).click();
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();

		js.executeScript("window.scrollBy(0,500)");
		// Add a product to cart and click on continue shopping
		driver.findElement(By.xpath("//a[@data-product-id='30']")).click();
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		// Add a product to cart and click on continue shopping
		driver.findElement(By.xpath("//a[@data-product-id='31']")).click();
		driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		// Add a product to cart and click on view cart
		driver.findElement(By.xpath("//a[@data-product-id='43']")).click();
		driver.findElement(By.xpath("//a/u[text()='View Cart']")).click();

		// Verify all products are diplayed or not
		String act_url2 = driver.getCurrentUrl();
		String exp_url2 = "https://automationexercise.com/view_cart";
		if (act_url2.endsWith(exp_url2)) {
			System.out.println("All products are added to cart");
		} else {
			System.out.println("All products are not added to cart");

		}
		// Click on login and enter the details
		driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("meghanaadapa07@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("Meghana@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		// Click on cart
		driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']")).click();
		// Verify add to cart product is visible in cart
		WebElement p1 = driver.findElement(By.xpath("//a[text()='Men Tshirt']"));
		boolean p1visibile = p1.isDisplayed();
		if (p1visibile) {
			System.out.println("product is displayed");
		} else {
			System.out.println("product is not displayed");
		}
		// Verify add to cart product is visible in cart
		WebElement p2 = driver.findElement(By.xpath("//a[text()='GRAPHIC DESIGN MEN T SHIRT - BLUE']"));
		boolean p2visibile = p2.isDisplayed();
		if (p2visibile) {
			System.out.println("product is displayed");
		} else {
			System.out.println("product is not displayed");
		}
		// Verify add to cart product is visible in cart
		WebElement p3 = driver.findElement(By.xpath("//a[text()='Pure Cotton V-Neck T-Shirt']"));
		boolean p3visibile = p3.isDisplayed();
		if (p3visibile) {
			System.out.println("product is displayed");
		} else {
			System.out.println("product is not displayed");
		}
		// Verify add to cart product is visible in cart
		WebElement p4 = driver.findElement(By.xpath("//a[text()='Green Side Placket Detail T-Shirt']"));
		boolean p4visibile = p4.isDisplayed();
		if (p4visibile) {
			System.out.println("product is displayed");
		} else {
			System.out.println("product is not displayed");
		}
		// Verify add to cart product is visible in cart
		WebElement p5 = driver.findElement(By.xpath("//a[text()='Premium Polo T-Shirts']"));
		boolean p5visibile = p5.isDisplayed();
		if (p5visibile) {
			System.out.println("product is displayed");
		} else {
			System.out.println("product is not displayed");
		}
		// Verify add to cart product is visible in cart
		WebElement p6 = driver.findElement(By.xpath("//a[text()='Pure Cotton Neon Green Tshirt']"));
		boolean p6visibile = p6.isDisplayed();
		if (p6visibile) {
			System.out.println("product is displayed");
		} else {
			System.out.println("product is not displayed");
		}
		
		Reporter.log("execution completed",true);
		// Close the browser
		driver.close();
	}
}
