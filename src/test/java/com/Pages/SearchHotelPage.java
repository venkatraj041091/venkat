package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.Baseclass;

public class SearchHotelPage extends Baseclass {
	public SearchHotelPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="username_show")
	private WebElement usname;
	
	@FindBy(id="location_span")
	private WebElement locationerror;
	
	@FindBy(id="checkin_span")
	private WebElement checkinerror;
	
	@FindBy(id="checkout_span")
	private WebElement checkouterror;

	@FindBy(id="location")
	private WebElement location;

	@FindBy(id="hotels")
	private WebElement hotel;

	@FindBy(id="room_type")
	private WebElement room;


	@FindBy(id="room_nos")
	private WebElement roomno;


	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement datein;


	@FindBy(xpath="//input[@id='datepick_out']")
	private WebElement dateout;


	@FindBy(id="adult_room")
	private WebElement aduld;


	@FindBy(id="child_room")
	private WebElement child;

	@FindBy(name="Submit")
	private WebElement submit;
	
	public WebElement getUsname() {
		return usname;
	}

	public WebElement getLocationerror() {
		return locationerror;
	}

	public WebElement getCheckinerror() {
		return checkinerror;
	}

	public WebElement getCheckouterror() {
		return checkouterror;
	}
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAduld() {
		return aduld;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void SearchHotels(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {

		WebElement location = getLocation();
		Select s=new Select(location);
		s.selectByVisibleText(string);

		WebElement hotel = getHotel();
		Select s1=new Select(hotel);
		s1.selectByVisibleText(string2);

		WebElement roomtype = getRoom();
		Select s2=new Select(roomtype);
		s2.selectByVisibleText(string3);

		WebElement noofrooms = getRoomno();
		Select s3=new Select(noofrooms);
		s3.selectByVisibleText(string4);

		WebElement checkindate = getDatein();
		elementClick(checkindate);
		elementclear(checkindate);
		checkindate.sendKeys(string5);

		WebElement checkoutdate = getDateout();
		elementClick(checkoutdate);
		elementclear(checkoutdate);
		checkoutdate.sendKeys(string6);

		WebElement adults = getAduld();
		Select s4=new Select(adults);
		s4.selectByVisibleText(string7);

		WebElement childern = getChild();
		Select s5=new Select(childern);
		s5.selectByVisibleText(string8);

		WebElement btnclick = getSubmit();
		btnclick.click();
	}

	public void SearchHotels(String string, String string2, String string3, String string4,String string5) {


		WebElement location = getLocation();
		Select s=new Select(location);
		s.selectByVisibleText(string);

		WebElement noofrooms = getRoomno();
		Select s3=new Select(noofrooms);
		s3.selectByVisibleText(string2);

		WebElement checkindate = getDatein();
		checkindate.sendKeys(string3);

		WebElement checkoutdate = getDateout();
		checkoutdate.sendKeys(string4);

		WebElement adults = getAduld();
		Select s4=new Select(adults);
		s4.selectByVisibleText(string5);


		WebElement btnclick = getSubmit();
		btnclick.click();
	}
	public void SearchHotels() {


		WebElement btnclick = getSubmit();
		btnclick.click();
	}

}
