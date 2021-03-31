package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage_PF {

	@FindBy(id="logout")
	@CacheLookup
	WebElement btn_logout;
	
	WebDriver driver;
	public HomePage_PF(WebDriver driver) {
		this.driver = driver;	//create constructor to get the driver instance
		//PageFactory.initElements(driver, this);//initialize elements using method initelements method
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);

	}
	public void checkLogoutIsDisplayed() {
		btn_logout.isDisplayed();
	}
}
