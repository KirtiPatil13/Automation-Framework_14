package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistration_02 extends BasePage {

	public AccountRegistration_02(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy (id = "input-firstname")
	WebElement Fname;
	
	@FindBy(id = "input-lastname")
	WebElement Lname;
	
	@FindBy(id = "input-email")
	WebElement email;
	
	@FindBy (id = "input-telephone")
	WebElement telephone;
	
	@FindBy(id = "input-password")
	WebElement pass;
	
	@FindBy (id = "input-confirm")
	WebElement confirmPass;
	
	@FindBy(id = "checkbox")
	WebElement chekbox;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	WebElement clickonButton;
	
	public void FName(String firstname)
	{
		Fname.sendKeys(firstname);
	}
	
	public void Lname(String lastname)
	{
		Lname.sendKeys(lastname);
	}
	
	public void Email(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void TelePhone(String phone)
	{
		telephone.sendKeys(phone);
	}
	
	public void Password(String Pwd)
	{
		pass.sendKeys(Pwd);
	}
	
	public void ConfirmPassword(String confPass)
	{
		confirmPass.sendKeys(confPass);
	}
	
	public void ClickOnCheckbox()
	{
		chekbox.click();
	}
	
	public void ClickOnContinueButotn()
	{
		clickonButton.click();
	}
}
