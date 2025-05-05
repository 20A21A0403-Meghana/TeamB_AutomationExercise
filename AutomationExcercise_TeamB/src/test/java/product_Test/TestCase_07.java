package product_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericRepository.BaseConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_07 extends BaseConfig{

@Test
public void Verify_Test_Cases_Page() {
	
		//Click on Testcases
		driver.findElement(By.xpath("//a[@href=\"/test_cases\"]")).click();
		Reporter.log("Testcaeses page displayed successfully",true);
		
		//close he Browser
		driver.close();
	}

}
