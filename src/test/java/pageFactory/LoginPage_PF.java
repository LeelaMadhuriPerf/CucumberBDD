package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF {

	@FindBy(id="name")
	@CacheLookup
	WebElement text_username;

	@FindBy(id="password")
	@CacheLookup
	WebElement text_password;

	@FindBy(id="login")
	@CacheLookup
	WebElement btn_login;
	
	@FindBy(partialLinkText ="demo")
	List<WebElement> mylinks;
	
	@FindBy(how=How.ID,using="name")
	WebElement abc;
	
	WebDriver driver;

	public LoginPage_PF(WebDriver driver) {
		this.driver = driver;	//create constructor to get the driver instance
		//PageFactory.initElements(driver, this);//initialize elements using method initelements method
		
		//AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}

	public void enterUsername(String username) {
		text_username.sendKeys(username);
	}

	public void enterPassword(String password) {
		text_password.sendKeys(password);
	}

	public void clickLogin() {
		btn_login.click();
	}
	
}

