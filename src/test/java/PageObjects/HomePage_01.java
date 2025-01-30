package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_01 extends BasePage{
	
	public HomePage_01(WebDriver driver) {
		super(driver);
	
	}

	@FindBy (xpath = "//span[.=\"My Account\"]")
	WebElement MyAccount;
	
	@FindBy (xpath = "//a[.=\"Register\"]")
	WebElement Register;
	
	
	public void myAccount()
	{
		MyAccount.click();
	}
	
	public void register()
	{
		Register.click();
	}

}
