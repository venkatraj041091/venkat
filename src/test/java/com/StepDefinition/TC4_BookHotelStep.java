package com.StepDefinition;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.Baseclass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC4_BookHotelStep extends Baseclass{

	PageObjectManager pom=new PageObjectManager();

	@Then("User should book hotel {string},{string} and {string}")
	public void user_should_book_hotel_and(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
		java.util.List<Map<String, String>> m = dataTable.asMaps();
		Map<String, String> map = m.get(1);
		String string4 = map.get("Credit Card No");
		String string5 = map.get("Credit Card Type");
		String string6 = map.get("select month");
		String string7 = map.get("select year");
		String string8 = map.get("CVV Number");
		pom.getBookHotelPage().bookhotel(string, string2, string3, string4, string5, string6, string7, string8);
	}

	
	@Then("User should verfied the booking sucess message {string} and save the order id")
	public void user_should_verfied_the_booking_sucess_message_and_save_the_order_id(String string) throws FileNotFoundException, IOException {
		WebElement conformation = pom.getBookingConfirmationPage().getConformation();
		System.out.println(conformation);
		String elementgettext = elementgettext(conformation);
		System.out.println(elementgettext);
		Assert.assertEquals("the booking verification", string, elementgettext);
		
		
		String orderId = pom.getBookingConfirmationPage().getbookid();
		System.out.println(orderId);
		
			
	}

	@Then("User should click book now button")
	public void user_should_click_book_now_button() {
		pom.getBookHotelPage().bookhotel();

	}



	@Then("User should verfied the book a hotel page with error message {string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_verfied_the_book_a_hotel_page_with_error_message_and(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
		WebElement error = pom.getBookHotelPage().getFirsterroe();
		String firsterror=elementgettext(error);
		boolean b = firsterror.contains(string);
		Assert.assertTrue(firsterror,b);

		WebElement error1 = pom.getBookHotelPage().getLasterror();
		String lasterror=elementgettext(error1);
		boolean b1 = lasterror.contains(string2);
		Assert.assertTrue(lasterror, b1);

		WebElement error2 = pom.getBookHotelPage().getAddresserror();
		String addresserror=elementgettext(error2);
		boolean b2 = addresserror.contains(string3);
		Assert.assertTrue(addresserror, b2);

		WebElement error3 = pom.getBookHotelPage().getCarderror();
		String carderror=elementgettext(error3);
		boolean b3= carderror.contains(string4);
		Assert.assertTrue(carderror,b3);

		WebElement error4 = pom.getBookHotelPage().getCardtypeerror();
		String type=elementgettext(error4);
		boolean b4= type.contains(string5);
		Assert.assertTrue(type,b4);

		WebElement error5 = pom.getBookHotelPage().getDateerror();
		String elementget=elementgettext(error5);
		boolean b5= elementget.contains(string6);
		Assert.assertTrue(elementget,b5);

		WebElement error6 = pom.getBookHotelPage().getCvverror();
		String dateerror=elementgettext(error6);
		boolean b6= dateerror.contains(string7);
		Assert.assertTrue(dateerror,b6);

	}









}
