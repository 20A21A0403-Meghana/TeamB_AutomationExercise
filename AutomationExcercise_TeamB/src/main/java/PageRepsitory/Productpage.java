package PageRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {
	
	//Declaration
	@FindBy(xpath="//a[@href=\"/products\"]")
	private WebElement product;
	
	@FindBy(xpath="//a[@href=\"/product_details/1\"]")
	private WebElement productdetails;
	
	//Intialization
	public Productpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getProduct() {
		return product;
	}
	public WebElement getProductdetails() {
		return productdetails;
	
	}

}
