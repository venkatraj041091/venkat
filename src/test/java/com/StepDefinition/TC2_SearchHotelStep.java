package com.StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.Baseclass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_SearchHotelStep extends Baseclass{
	PageObjectManager pom=new PageObjectManager();

	@When("User should enter {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_enter_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	pom.getSearchHotelPage().SearchHotels(string, string2, string3, string4, string5, string6, string7, string8);
	}
	
	@When("User should enter manatory fieds only {string},{string},{string},{string} and {string}")
	public void user_should_enter_manatory_fieds_only_and(String string, String string2, String string3, String string4, String string5) {
	pom.getSearchHotelPage().SearchHotels(string, string2, string3, string4, string5);
	}

	@Then("User should verfied the search page date with invalid date error message {string} and {string}")
	public void user_should_verfied_the_search_page_date_with_invalid_date_error_message_and(String string, String string2) {
		WebElement checkinerror = pom.getSearchHotelPage().getCheckinerror();
		String elementgettext = elementgettext(checkinerror);
		System.out.println(elementgettext);
		boolean contains = elementgettext.contains(string);
		Assert.assertTrue(elementgettext, contains);
		
		WebElement checkouterror = pom.getSearchHotelPage().getCheckouterror();
		String elementgettext2 = elementgettext(checkouterror);
		System.out.println(elementgettext2);
		boolean contains2 = elementgettext2.contains(string2);
		Assert.assertTrue(elementgettext2, contains2);
		
		
	}
	
	@When("User should enter search button without enter any field")
	public void user_should_enter_search_button_without_enter_any_field() {
		pom.getSearchHotelPage().SearchHotels();
	}
	@Then("User should verfied the search page location with error message {string}")
	public void user_should_verfied_the_search_page_location_with_error_message(String string) {
		WebElement locationerror = pom.getSearchHotelPage().getLocationerror();
		String elementget=elementgettext(locationerror);
		boolean b = elementget.contains(string);
		Assert.assertTrue(elementget, b);
		
	}











}
