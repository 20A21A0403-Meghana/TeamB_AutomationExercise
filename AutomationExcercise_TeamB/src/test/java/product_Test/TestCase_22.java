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

public class TestCase_22 extends BaseConfig{
	
	@Test
	
	public void Add_to_cart_from_Recommended_items() throws InterruptedException {

		//1. Launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//2. Navigate to url 'http://automationexercise.com'
		driver.get("https://automationexercise.com");
		//3. Scroll to bottom of page
		WebElement element=driver.findElement(By.xpath("//div[@class='recommended_items']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		//4. Verify 'RECOMMENDED ITEMS' are visible
		Boolean result=element.isDisplayed();
		if(result==true)
		{
			System.out.println("TestCasepage pass");
		}
		else
		{
			System.out.println("TestCasepage Fail");
		}
		//5. Click on 'Add To Cart' on Recommended product
		driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[3]")).click();
		Thread.sleep(4000);
		//6. Click on 'View Cart' button
		driver.findElement(By.xpath("//u[text()='View Cart']")).click();
		//7. Verify that product is displayed in cart page
WebElement element2=driver.findElement(By.xpath("(//img[@class='product_image'])[2]"));
Boolean result2=element2.isDisplayed();
if(result2==true)
{
	System.out.println("TestCasepage Pass");
}
else
{
	System.out.println("TestCasepage Fail");
}
driver.close();
Reporter.log("Test Execution completed",true);

	}

}
