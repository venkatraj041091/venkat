package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class CancelBookingPage extends Baseclass {

	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//a[text()='Booked Itinerary'] ")
	private WebElement bookitl;

	@FindBy(id = "order_id_text")
	private WebElement orderid;

	@FindBy(id = "search_hotel_id")
	private WebElement hottel;

	@FindBy(xpath= "//input[contains(@value,'Cancel')]")
	private WebElement cancel;

	@FindBy(id = "search_result_error")
	private WebElement cancelerror;

	@FindBy(id = "order_no")
	private WebElement bookingorderID;

	@FindBy(id = "search_result_error")
	private WebElement bookingcancel;

	public WebElement getBookingorderID() {
		return bookingorderID;
	}

	public WebElement getBookingcancel() {
		return bookingcancel;
	}

	public WebElement getCancelerror() {
		return cancelerror;
	}

	public WebElement getBookitl() {
		return bookitl;
	}

	public WebElement getOrderid() {
		return orderid;
	}

	public WebElement getHottel() {
		return hottel;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public String getbookid() {
		WebElement orderId = getBookingorderID();
		String elementGetAttributevalue = elementGetAttributevalue(orderId);
		System.out.println(elementGetAttributevalue);
		return elementGetAttributevalue;

	}

	public void cancelorderid(String getbookid)  {

		WebElement btnclick = getBookitl();
		btnclick.click();

		WebElement txtpassword = getOrderid();
		elementSendKeys(txtpassword, getbookid);
		
		WebElement hottel2 = getHottel();
		hottel2.click();

		WebElement btnclick2 = getCancel();
		btnclick2.click();

		alertaccept();

	}

}
