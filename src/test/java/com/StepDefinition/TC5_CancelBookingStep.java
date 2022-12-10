package com.StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.Baseclass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC5_CancelBookingStep extends Baseclass{

	PageObjectManager pom =new PageObjectManager();

	@Then("User should cancel order id in Booked Itinerary page")
	public void user_should_cancel_order_id_in_booked_itinerary_page()  {
		 
		String getbookid = pom.getBookingConfirmationPage().getbookid();
		pom.getCancelBookingPage().cancelorderid(getbookid);
	}

	@Then("User should after cancel oder id sucess message {string}")
	public void user_should_after_cancel_oder_id_sucess_message(String string) {
		pom.getCancelBookingPage();

		WebElement bookingcancel = pom.getCancelBookingPage().getBookingcancel();
		String elementgettext = elementgettext(bookingcancel);
		System.out.println(elementgettext);
		Assert.assertEquals("the booking cancel", string, elementgettext);
	}

	@Then("User should cancel the existing order id in Booked Itinerary page {string}")
	public void user_should_cancel_the_existing_order_id_in_booked_itinerary_page(String string) {
		
		pom.getCancelBookingPage().cancelorderid(string);
	}





}
