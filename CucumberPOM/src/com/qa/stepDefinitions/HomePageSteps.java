package com.qa.stepDefinitions;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
	   
	   TestBase.initialization();
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		loginpage = new LoginPage();
		String title=loginpage.validateLoginPageTitle();

		Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);
		
	}

	@Then("^user logs into app$")
	public void user_enters_username_and_password() throws Throwable {
	    
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^validate home page title$")
	public void validate_home_page_title() throws Throwable {
		String homepagetitle=homepage.verifyHomePageTitle();
		Assert.assertEquals("CRMPRO", homepagetitle);
		
	   
	}

	

	

}
