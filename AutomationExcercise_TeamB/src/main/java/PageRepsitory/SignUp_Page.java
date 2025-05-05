package PageRepsitory;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class SignUp_Page{
		
		@FindBy(xpath="//a[@href='/login']")
		private WebElement Login;
		
		@FindBy(name="name")
		private WebElement name;
		
		@FindBy(xpath="(//input[@type='email'])[2]")
		private WebElement email;
		
		@FindBy(xpath="(//button[@type='submit'])[2]")
		private WebElement singup;
		
		@FindBy(xpath="(//div[@data-qa='title'])[2]")
		private WebElement Title;
		
		@FindBy(id="password")
		private WebElement Password;
		
		@FindBy(xpath="//select[@id='days']")
		private WebElement DD;
		
		@FindBy(id="months")
		private WebElement MM;
		
		@FindBy(id="years")
		private WebElement yy;
		
		@FindBy(id="newsletter")
		private WebElement CheckBox;
		
		@FindBy(id="optin")
		private WebElement CheckBox2;
		
		@FindBy(id="first_name")
		private WebElement Frstname;
		
		@FindBy(id="last_name")
		private WebElement Lastname;
		
		@FindBy(id="company")
		private WebElement company;
		
		
		@FindBy(id="address1")
		private WebElement Adrs1;
		
		@FindBy(id="address2")
		private WebElement Adrs2;
		
		@FindBy(xpath="//select[@id='country']")
		private WebElement Country;
		
		@FindBy(id="state")
		private WebElement state;
		
		@FindBy(id="city")
		private WebElement City;
		
		@FindBy(id="zipcode")
		private WebElement Zipcod;
		
		@FindBy(id="mobile_number")
		private WebElement Mobil;
		
		@FindBy(xpath="//button[text()='Create Account']")
		private WebElement AccountCreate;
		
		@FindBy(xpath="//a[text()='Continue']")
		private WebElement Continue;
		// Initialization
		public SignUp_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		// Utilization
		
		public WebElement getLogin() {
			return Login;
		}
		public WebElement getName() {
			return name;
		}
		public WebElement getEmail() {
			return email;
		}
		public WebElement getSingup() {
			return singup;
		}
		public WebElement getTitle() {
			return Title;
		}
		public WebElement getPassword() {
			return Password;
		}
		public WebElement getDD() {
			return DD;
		}
		public WebElement getMM() {
			return MM;
		}
		public WebElement getYy() {
			return yy;
		}
		public WebElement getCheckBox() {
			return CheckBox;
		}
		public WebElement getCheckBox2() {
			return CheckBox2;
		}
		public WebElement getFrstname() {
			return Frstname;
		}
		public WebElement getLastname() {
			return Lastname;
		}
		public WebElement getCompany() {
			return company;
		}
		public WebElement getAdrs1() {
			return Adrs1;
		}
		public WebElement getAdrs2() {
			return Adrs2;
		}
		public WebElement getCountry() {
			return Country;
		}
		public WebElement getState() {
			return state;
		}
		public WebElement getCity() {
			return City;
		}
		public WebElement getZipcod() {
			return Zipcod;
		}
		public WebElement getMobil() {
			return Mobil;
		}
		public WebElement getAccountCreate() {
			return AccountCreate;
		}
		public WebElement getContinue() {
			return Continue;
		}
		
	

}
