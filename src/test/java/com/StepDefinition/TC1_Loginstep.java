package com.StepDefinition;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.Baseclass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_Loginstep extends Baseclass {
	PageObjectManager pom= new PageObjectManager();

	@Given("User is on the hotel page")
	public void user_is_on_the_hotel_page() throws FileNotFoundException, IOException {
		}
	
	@When("User should enter login {string} and {string}")
	public void user_should_enter_login_and(String Username, String password) throws FileNotFoundException, IOException {
		pom.getLoginPage().LoginWithEnterKey(Username,password);
		
	}
	
	@When("User should enter login {string} and {string}  with ENTER KEY")
	public void user_should_enter_login_and_with_enter_key(String string, String string2) throws FileNotFoundException, IOException {
		pom.getLoginPage().LoginWithEnterKey(getpropertyFileValue("username"), getpropertyFileValue("password"));
	}

	@Then("User should verfied the login page with invalid credential error message contains  {string}")
	public void user_should_verfied_the_login_page_with_invalid_credential_error_message_contains(String string) throws FileNotFoundException, IOException {
		WebElement error = pom.getLoginPage().getError();
		String elementget=elementgettext(error);
		boolean b = elementget.contains(string);
		Assert.assertTrue(elementget, b);
		
		
	}






}
