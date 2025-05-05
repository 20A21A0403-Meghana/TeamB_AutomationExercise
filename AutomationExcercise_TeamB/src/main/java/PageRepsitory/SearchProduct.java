package PageRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct {
	
	
	//Declaration
	@FindBy(xpath="//a[@href=\"/products\"]")
	private WebElement product;
	
	@FindBy(xpath="//input[@id=\"search_product\"]")
	private WebElement searchproduct;
	
	@FindBy(xpath="//button[@id=\"submit_search\"]")
	private WebElement submitbutton;
	
	//Initialization
	public SearchProduct(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public WebElement getProduct() {
		return product;
	}
	public WebElement getSearchProduct() {
		return searchproduct;
	}
	public WebElement getSubmitButton() {
		return submitbutton;
	}

}
