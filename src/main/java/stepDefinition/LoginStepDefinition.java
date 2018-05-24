package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;
	
	@Given("^Login as user$")
	public void login_as_user()
	{
	String driverPath = "C:\\Users\\vivek.jain\\eclipse-workspace\\BDDFramework\\drivers\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--start-maximized");
	
		driver= new ChromeDriver(options);
		
		driver.get("https://www.youtube.com/watch?v=vHzMJuc9Zuk&list=PLFGoYjJG_fqoBFPevCDZDCufDX5h-o3yO");
		
		
	}

	
	@When("^sdf$")
	public void sdf() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver= new FirefoxDriver();
		driver.get("https://www.youtube.com/watch?v=vHzMJuc9Zuk&list=PLFGoYjJG_fqoBFPevCDZDCufDX5h-o3yO");
	}
	
	@Then("^sdf1$")
	public void sdf1() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}
	
	@And("^sdf2$")
	public void sdf2() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  driver.quit();
	}
}
