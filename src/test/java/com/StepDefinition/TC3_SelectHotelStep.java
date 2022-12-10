package com.StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.Baseclass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC3_SelectHotelStep extends Baseclass {
	PageObjectManager pom=new PageObjectManager();
	
	@Then("User should select hotel and click the continue button")
	public void user_should_select_hotel_and_click_the_continue_button() {
	pom.getSelectHotel().selecthotel();	
	}

	@Then("User should without select hotel and click the continue button")
	public void user_should_without_select_hotel_and_click_the_continue_button() {
		pom.getSelectHotel().clickbutton();
	  }
	@Then("User should verfied the select hotel page with error message {string}")
	public void user_should_verfied_the_select_hotel_page_with_error_message(String string) {
		WebElement buttonerror = pom.getSelectHotel().getButtonerror();
		String elementget=elementgettext(buttonerror);
		boolean b = elementget.contains(string);
		Assert.assertTrue(elementget,b);
		
	}

 


	

}
