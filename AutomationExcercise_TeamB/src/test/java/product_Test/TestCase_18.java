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



public class TestCase_18 extends BaseConfig {
	
	@Test
	public void View_Category_Products() {

		//Configure the brower

		WebDriverManager.chromedriver().setup();

		//Launch the browser

		WebDriver driver=new ChromeDriver();

		//navigate to the application

		driver.get("https://automationexercise.com");

        //maximize the browser

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)");

		//Verify category is displayed

		WebElement category = driver.findElement(By.xpath("//h2[text()='Category']"));

		Boolean res = category.isDisplayed();

		if (res) {

			System.out.println("Category is displayed");

		} else {

			System.out.println("Category is not displayed");
		}
		//Click on women category

		driver.findElement(By.xpath("(//span[@class='badge pull-right'])[1]")).click();

		//Click on dress category

		driver.findElement(By.xpath("//a[@href='/category_products/1']")).click();

		//Verify women dress related products are displayed

		WebElement womenProduct = driver.findElement(By.xpath("//h2[@class='title text-center']"));

		Boolean res1 = womenProduct.isDisplayed();

		if (res1) {

			System.out.println("Women Dress related products are displayed");

		} else {

			System.out.println("Women Dress related products are not displayed");

		}

		

		//Click on men category

		driver.findElement(By.xpath("(//span[@class='badge pull-right'])[2]")).click();

		//Click on tshirt category

		driver.findElement(By.xpath("//a[text()='Tshirts ']")).click();

		//Verify men tshirt related products are displayed

		WebElement menProduct = driver.findElement(By.xpath("//h2[@class='title text-center']"));

		Boolean res2 = menProduct.isDisplayed();

		if (res2) {

			System.out.println("Men TShirt related products are displayed");

		} else {

			System.out.println("Men TShirt related products are not displayed");

		}
		Reporter.log("execution completed",true);

		//Close the browser

		driver.close();
	}
}
