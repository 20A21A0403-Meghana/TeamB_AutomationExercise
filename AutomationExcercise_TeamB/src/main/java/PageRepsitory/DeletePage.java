package PageRepsitory;
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class DeletePage {
		
		//Declaration
		@FindBy(xpath = "//a[text()='Continue']")
		private WebElement conDelete;
		
		//Initialization
		public DeletePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//Utilization
		public WebElement getConDelete() {
			return conDelete;
		}

		public WebElement getdeletebutton() {
			// TODO Auto-generated method stub
			return getdeletebutton();
		}

		public WebElement getdeletevisible() {
			return deletevisible;
		}
		
	}


