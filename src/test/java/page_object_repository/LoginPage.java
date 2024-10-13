package page_object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="username")
	private WebElement lnkUsername;
	
	@FindBy(name="password")
	private WebElement lnkPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnLogin;
	
	public void setUsername(String username) {
		lnkUsername.sendKeys(username);
	}
	
	public void setPassword(String password) {
		lnkPassword.sendKeys(password);
	}
	
	public void clickOnLogin() {
		btnLogin.click();
	}
}
