package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	WebDriver driver;

	By text_username = By.id("name");
	By text_password = By.id("password");
	By btn_login = By.id("login");
	By btn_logout = By.id("logout");

	public loginPage(WebDriver driver) {
		this.driver = driver;
		if(!driver.getTitle().equals("TestProject Demo")) {
			throw new IllegalStateException("This is not login page.The current page is "+driver.getTitle());
		}
	}

	public void enterUsername(String username) {
		driver.findElement(text_username).sendKeys(username);

	}

	public void enterPassword(String password) {
		driver.findElement(text_password).sendKeys(password);
	}

	public void clickLogin() {
		driver.findElement(btn_login).click();
	}

	public void loginValidUser(String username,String password) {
		driver.findElement(text_username).sendKeys(username);
		driver.findElement(text_password).sendKeys(password);
		driver.findElement(btn_login).click();

	}

	public void checkLogoutisDisplayed() {
		driver.findElement(btn_logout).isDisplayed();
	}
}
