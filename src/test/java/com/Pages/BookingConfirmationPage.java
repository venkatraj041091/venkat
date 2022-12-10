package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class BookingConfirmationPage extends Baseclass {
	
	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement bookingorderID;
	
	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	private WebElement conformation;

	public WebElement getConformation() {
		return conformation;
	}

	public WebElement getbookingorderID() {
		return bookingorderID;}

	public String getbookid() {
		WebElement orderId = getbookingorderID();
		String elementGetAttributevalue = elementGetAttributevalue(orderId);
		System.out.println(elementGetAttributevalue);
		return elementGetAttributevalue;
			
	}

}
