package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginSteps {
//	WebDriver driver=null;
//	
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//	    System.out.println("Inside Step:User is on login page");
//	    System.out.println("inside step:browser is open");
//		String projectPath=System.getProperty("user.dir");
//		System.out.println(projectPath);
//
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
//
//		driver=new ChromeDriver();
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		
//		driver.navigate().to("https://example.testproject.io/web/");
//	}
//
//	@When("user enters username and password")
//	public void user_enters_username_and_password() {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("Inside Step: user enters username and password");
//		
//		driver.findElement(By.id("name")).sendKeys("madhu");
//		driver.findElement(By.id("password")).sendKeys("12345");
//	}
//
//	@And("Clicks on login button")
//	public void clicks_on_login_button() {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("Inside Step: clicks on login button");
//		driver.findElement(By.id("login")).click();
//	}
//
//	@Then("user is navigated to homepage")
//	public void user_is_navigated_to_home_page() throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("Inside Step: user is navigated to Home page");
//		driver.findElement(By.id("logout")).isDisplayed();
//		Thread.sleep(2000);
//		driver.close();
//		driver.quit();
//		
//	}
//	
}
