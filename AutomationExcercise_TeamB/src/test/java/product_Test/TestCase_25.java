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

public class TestCase_25 extends BaseConfig {
	
	@Test
	
	public void Verify_Scroll_Up_using_Arrow_button_and_Scroll_Down_functionality() throws InterruptedException {

		//1.launch the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//2.navigate
		driver.get("https://automationexercise.com/");
		//3. Verify that home page is visible successfully
		String e_homepage=driver.getTitle();
		System.out.println(e_homepage);
		String a_homepage="Automation Exercise";
		if(e_homepage.equals(a_homepage))
		{
			System.out.println("homepage is visible sucessfully");
		}
		else
		{
			System.out.println("Homepage is not visisble");
		}
		
		//4. Scroll down page to bottom
		WebElement element1=driver.findElement(By.xpath("//h2[text()='Subscription']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,500)");
		js.executeScript("arguments[0].scrollIntoView(true)",element1);
		//5. Verify 'SUBSCRIPTION' is visible
		String result=element1.getText();
		System.out.println(result);
		if(result.equals("SUBSCRIPTION"))
		{
			System.out.println("subscription is visisble");
		}
		else
		{
			System.out.println("subscription is not visible");
		}
		//6. Click on arrow at bottom right side to move upward
		driver.findElement(By.id("susbscribe_email")).sendKeys("jyothi3735@gmail.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		//7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
		WebElement element3=driver.findElement(By.xpath("//h2[contains(text(),'Full-Fl')]"));
		js.executeScript("arguments[0].scrollIntoView(true)",element3);
		String result3=element3.getText();
		System.out.println(result3);
		if(result3.equals("Full-Fledged practice website for Automation Engineers"))
		{
			System.out.println("fully fleged element is visible");
		}
		else
		{
			System.out.println("fully fleged element is Not visible");
		}
		Reporter.log("Test Execution completed successfully",true);

	}
}
