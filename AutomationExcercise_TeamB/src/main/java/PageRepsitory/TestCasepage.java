package PageRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCasepage {
	
	//Declaration
	@FindBy(xpath="(//a[@href=\"/test_cases\"])[1]")
	private WebElement testcase;
	
	//Initialization
	public TestCasepage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public WebElement getTestCase() {
		return testcase;
	}
	

}
