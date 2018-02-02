package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	
	public static WebDriver driver;
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://freecrm.com/index.html");
		}

	/*@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		}*/

	/*@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys("smuvva"); 	 
	    driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[2]")).sendKeys("Selenium");
	    Thread.sleep(9000);
	    driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")).click();
		}*/
	
/*	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_UserName_and_Password(String username, String Password) throws Throwable {
		driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys(username); 	 
	    driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[2]")).sendKeys(Password);
	    Thread.sleep(9000);
	    driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")).click();
		}
	*/
	
	@When("^User enters Credentials to LogIn$")
	public void user_enters_testuser__and_Test(DataTable usercredentials) throws Throwable {
		List<List<String>> data = usercredentials.raw();
		driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys(data.get(0).get(0)); 	 
	    driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[2]")).sendKeys(data.get(0).get(1));
	    Thread.sleep(9000);
	    driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")).click();
	}

	

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	}

/*	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
	}

	@Then("^Message displayed Logout Successfully$")
	public void message_displayed_Logout_Successfully() throws Throwable {
        System.out.println("LogOut Successfully");
	}*/

}