package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class AddNewAccount extends PageBase {

	public AddNewAccount(WebDriver driver) {
		super(driver);
	}
	

	// Add methods to interact with the Add New Account page elements here
	@FindBy(linkText = "Add new Account")
	    WebElement addNewAccountLink;
	
	@FindBy(xpath="//input[@id='name']")
	    WebElement accountNameInput;
	
	@FindBy(xpath="//select[@name='gender']")
	    WebElement genderSelect;
	
	@FindBy(xpath="//*[@id=\"phonenumber\"]")
	    WebElement phoneNumberInput;
	
	@FindBy(xpath="//*[@id=\"city\"]")
        WebElement cityinput;
	
	@FindBy(xpath = "//*[@id=\"needs-validation\"]/div[7]/div[1]/div/input")
		WebElement depositInput;
	
	@FindBy(xpath = "//*[@id=\"aadhaar\"]")
		WebElement aadhaarInput;
	
	@FindBy(xpath = "//*[@id=\"email\"]")
		WebElement email;
	
	@FindBy(xpath = "//*[@id=\"Password\"]")
		WebElement passwordInput;
	
	@FindBy(xpath = "//*[@id=\"Address\"]")
	    WebElement addressInput;
	@FindBy(xpath = "//*[@id=\"needs-validation\"]/div[5]/div[2]/div/input")
		WebElement DateOfBirthInput;
	@FindBy(xpath = "//*[@id=\"needs-validation\"]/div[6]/div[2]/div/select")
		WebElement AccountTypeSelect;
	@FindBy(xpath = "//*[@id=\"needs-validation\"]/div[7]/div[2]/div/input")
		WebElement occasion;
	@FindBy(xpath = "//*[@id=\"validatedCustomFile\"]")
		WebElement profileImageInput;
	
	@FindBy(xpath = "//*[@id=\"submit\"]")
		WebElement Registerselect;
	
	public void Addnewaccount() {
		addNewAccountLink.click();
	}
	
	public void accountName(String name) {
		accountNameInput.sendKeys(name);
	}
	
	public void gender(String gender) {
		Select select = new Select(genderSelect);
		select.selectByVisibleText(gender);
	}
	
	public void phoneNumber(String phone) {
		phoneNumberInput.sendKeys(phone);
	}
	
	public void city(String city) {
		cityinput.sendKeys(city);
	}

	public void Deposit(String deposit) {
		depositInput.sendKeys(deposit);
	}
	
	public void Adhar(String adhar) {
		aadhaarInput.sendKeys(adhar);
	}
	
	public void email(String emailAddress) {
		email.sendKeys(emailAddress);
	}
	
	public void password(String pwd) {
		passwordInput.sendKeys(pwd);
	}
	
	public void address(String addr) {
		addressInput.sendKeys(addr);
	}
	
	public void selectDate(String date) {
		DateOfBirthInput.sendKeys(date);
	}
	
	public void AccountType(String accountType) {
		Select select = new Select(AccountTypeSelect);
		select.selectByVisibleText(accountType);
	}
	
	public void Occasion(String occ) {
		occasion.sendKeys(occ);
	}
	public void Profile(String filepath)
	{
		profileImageInput.sendKeys(filepath);
	}
	
	public void Submit()
	{
		Registerselect.click();
	}
}
