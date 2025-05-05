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

public class Testcase_17 extends BaseConfig{

	
	@Test
	
	public void Remove_Products_From_Cart() {
		//Configure the browser
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		//navigate to the application
		driver.get("https://automationexercise.com");
        //maximize the browser
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
        //Verifying home page is displayed or not       
		String exp_url=driver.getCurrentUrl(); 
		String act_url="https://automationexercise.com/";    
		if(exp_url.equals(act_url)) {
        	System.out.println("Home Page is displayed");
        }
        else {
        	System.out.println("Home Page is not displayed");
        }
        
		//Click on products
		driver.findElement(By.xpath("//i[@class='material-icons card_travel']")).click();
        
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        
        //add a product to cart
        driver.findElement(By.xpath("//a[@class='btn btn-default add-to-cart']")).click();
        //Click on continue shopping
        driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
        //add a product to cart
        driver.findElement(By.xpath("//a[@data-product-id='2']")).click();
        //Click on view to cart
        driver.findElement(By.xpath("//a/u[text()='View Cart']")).click();
        
        //Verifying product is added to cart
        WebElement pro1=driver.findElement(By.xpath("//a[text()='Blue Top']"));
        boolean res1=pro1.isDisplayed();
        if(res1) {
        	System.out.println("Product is added to cart");
        }
        else {
        	System.out.println("Product is not added to cart");
        }
      //Verifying product is added to cart
        WebElement pro2=driver.findElement(By.xpath("//a[text()='Men Tshirt']"));
        boolean res2=pro2.isDisplayed();
        if(res2) {
        	System.out.println("Product is added to cart");
        }
        else {
        	System.out.println("Product is not added to cart");
        }
        
        //Remove the products
        driver.findElement(By.xpath("//a[@data-product-id='1']")).click();
        driver.findElement(By.xpath("//a[@data-product-id='2']")).click();
        
        //Verify the products are removed 
        WebElement emptyCart=driver.findElement(By.xpath("//span/p[@class='text-center']"));
        boolean res3=emptyCart.isDisplayed();
        if(res3) {
        	System.out.println("Products removed successfully");
        }
        else {
        	System.out.println("Products removed successfully");
        }
        
        Reporter.log("execution completed",true);
        //Close the browser
        driver.close();
	}

}
