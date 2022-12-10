package com.StepDefinition;

import org.openqa.selenium.WebElement;

import com.base.Baseclass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CommonStep extends Baseclass {

	PageObjectManager pom=new PageObjectManager();

	@Then("User should verfied the login page sucess message {string}")
	public void user_should_verfied_the_login_page_sucess_message(String string) {
		WebElement usname = pom.getSearchHotelPage().getUsname();
		String attributevalue = elementGetAttributevalue(usname);
		System.out.println(attributevalue);
		Assert.assertEquals("the values are verifed", string, attributevalue);
	}

	
	@Then("User should verfied login page sucess message {string}")
	public void user_should_verfied_login_page_sucess_message(String string) {
		WebElement usname = pom.getSelectHotel().getSelect();
		String attributevalue = elementgettext(usname);
		System.out.println(attributevalue);
		Assert.assertEquals("the values are verifed", string, attributevalue);
	}

	@Then("User should verfied the select hotel sucess message {string}")
	public void user_should_verfied_the_select_hotel_sucess_message(String string) {
		WebElement usname = pom.getBookHotelPage().getBook();
		String attributevalue = elementgettext(usname);
		System.out.println(attributevalue);
		Assert.assertEquals("the values are verifed", string, attributevalue);

	}




}
