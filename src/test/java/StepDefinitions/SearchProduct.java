package StepDefinitions;

import Utility.BaseClass;
import Pages.Home;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SearchProduct extends BaseClass{
	
	Home flight = new Home(BaseClass.driver);
	

	@And("I search for a product")
	public void i_search_for_a_product() {
		flight.getProductSearchBox().sendKeys("rog flow");
		
	}

	@And("I click in search button")
	public void i_click_in_search_button() {
		flight.getProductSearchButton().click();
		
	}

	@Then("I click in first item")
	public void i_click_in_first_item() {
		flight.getFirstProduct().click();
		
	}

}
