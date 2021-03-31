package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DropDownselectionwithoutselectclass {

	public static void main(String[] args) {
		
		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  
        driver.get("https://www.demoqa.com/automation-practice-form");  
        JavascriptExecutor j = (JavascriptExecutor) driver;
        // set the display with style.display method
        j.executeScript ("document.getElementById('gsc-i-id1').style.display='block';");
       // customAssertion.assertTrue(homePage.textOfErrorMessageFindParts.get(0).getCssValue("background-color").equals("rgba(0, 0, 0, 0)"),
				//"Alert message is not displayed in Red.");
        
          }
}
