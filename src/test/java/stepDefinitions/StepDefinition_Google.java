package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Google_Home;

public class StepDefinition_Google {

	Google_Home googleHomePage = new Google_Home();
	
	@Given("^I launch Chrome browser$")
	public void i_launch_Chrome_browser() {
	    
		googleHomePage.launchBrowser();
	    
	}

	@When("^I open Google Homepage$")
	public void i_open_Google_Homepage() {
	    
		googleHomePage.openGoogleURL();
	    
	}

	@Then("^I verify that the page displays search text box$")
	public void i_verify_that_the_page_displays_search_text_box() {
	    
		googleHomePage.checkSearchBoxIsDisplayed();
	    
	}

	@Then("^the page displays Google Search button$")
	public void the_page_displays_Google_Search_button() {
	    
		googleHomePage.checkGoogleSearchButtonIsDisplayed();
		
	}

	@Then("^the page displays Im Feeling Lucky button$")
	public void the_page_displays_Im_Feeling_Lucky_button() {
	   
		googleHomePage.checkImFeelingLuckyButtonIsDisplayed();
		
	}

	@Then("^the browser close$")
	public void the_browser_close() {
		
		googleHomePage.closeTheBrowser();
	}
}
