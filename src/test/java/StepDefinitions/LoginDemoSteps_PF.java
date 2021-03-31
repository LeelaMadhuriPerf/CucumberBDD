package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageFactory.HomePage_PF;
import pageFactory.LoginPage_PF;

public class LoginDemoSteps_PF {

	WebDriver driver=null;
	LoginPage_PF login;
	HomePage_PF home;

	@Given("browser is open")
	public void browser_is_open() {

		System.out.println("=======I AM INSIDE HOMEPAGE_PF=========");
		System.out.println("inside step:browser is open");
		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");

		driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) {
		login=new LoginPage_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password);

	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
		login=new LoginPage_PF(driver);
		login.clickLogin();

	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() throws InterruptedException {
		home = new HomePage_PF(driver);
		home.checkLogoutIsDisplayed();
		Thread.sleep(2000);
		driver.close();
		driver.quit();

	}

}
