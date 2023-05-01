package StepDefinitions;

import Utility.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BaseClassStepDefinitions {
	
	BaseClass baseClass = new BaseClass();
	
	@Given("I go to Amazon web page")
	public void i_go_to_amazon_web_page() {
	    baseClass.launchBrowser();
	}
	
	@Then("I Close Browser")
	public void i_close_browser() throws InterruptedException {
		baseClass.closeApplication();
	}

}
