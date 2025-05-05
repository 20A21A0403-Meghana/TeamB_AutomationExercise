package PageRepsitory;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class ContactUs {
		//Declaration
		@FindBy(xpath="//a[@href=\"/contact_us\"]")
		private WebElement Contactus;
		
		@FindBy(xpath="(//h2[@class=\"title text-center\"])[2]")
		private WebElement GetInTouch;
		
		@FindBy(xpath="//input[@data-qa=\"name\"]")
		private WebElement name;
		
		@FindBy(xpath="//input[@data-qa=\"email\"]")
		private WebElement email;
		
		@FindBy(xpath="//input[@data-qa=\"subject\"]")
		private WebElement subject;
		
		@FindBy(xpath="//textarea[@data-qa=\"message\"]")
		private WebElement message;
		
		@FindBy(xpath="//input[@type=\"file\"]")
		private WebElement file;
		
		@FindBy(xpath="//input[@type=\"submit\"]")
		private WebElement submit;
		
		@FindBy(xpath="//div[@class=\"status alert alert-success\"]")
		private WebElement text;
		
		//Initialization
		public ContactUs(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		//Utilization
		public  WebElement getConactus() {
			return Contactus;
		}
		public WebElement getGetInTouch() {
			return GetInTouch;
		}
		public WebElement getname() {
			return name;
		}
		public WebElement getemail() {
			return email;
		}
		public WebElement getsubject() {
			return subject;
		}
		public WebElement getmessage() {
			return message;
		}
		public WebElement getfile() {
			return file;
		}
		public WebElement getsubmit() {
			return submit;
		}
		public WebElement gettext() {
			return text;
		}
		}
		
		



