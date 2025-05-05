package validation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import PageRepsitory.SearchProduct;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchProduct_validation {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.automationexercise.com/");
	 
		SearchProduct obj=new SearchProduct(driver);
		
		  obj.getProduct().click();
		 
		 obj.getSearchProduct().sendKeys("polo");
		 
		 obj.getSubmitButton().click();
		 System.out.println("******Execution Completed*******8");
		 driver.close();
		 

	}

}
