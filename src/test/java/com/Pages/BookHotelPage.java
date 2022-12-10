package com.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.Baseclass;

public class BookHotelPage extends Baseclass {

	public BookHotelPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="first_name")
	private WebElement firstname;

	@FindBy(id="last_name")
	private WebElement lastname;

	@FindBy(id="address")
	private WebElement address;

	@FindBy(id="cc_num")
	private WebElement ccnum;

	@FindBy(id="cc_type")
	private WebElement cctype;

	@FindBy(id="cc_exp_month")
	private WebElement month;

	@FindBy(id="cc_exp_year")
	private WebElement year;

	@FindBy(id="cc_cvv")
	private WebElement cvv;

	@FindBy(id="first_name_span")
	private WebElement firsterroe;

	@FindBy(id="last_name_span")
	private WebElement lasterror;

	@FindBy(id="address_span")
	private WebElement addresserror;

	@FindBy(id="cc_num_tip")
	private WebElement carderror;

	@FindBy(id="cc_type_span")
	private WebElement cardtypeerror;

	@FindBy(id="cc_expiry_span")
	private WebElement dateerror;

	@FindBy(id="cc_cvv_span")
	private WebElement cvverror;
	
	@FindBy(id="book_now")
	private WebElement btn;

	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement book;
	
	public WebElement getBook() {
		return book;
	}
	public WebElement getFirsterroe() {
		return firsterroe;
	}
	public WebElement getLasterror() {
		return lasterror;
	}
	public WebElement getAddresserror() {
		return addresserror;
	}
	public WebElement getCarderror() {
		return carderror;
	}
	public WebElement getCardtypeerror() {
		return cardtypeerror;
	}
	public WebElement getDateerror() {
		return dateerror;
	}
	public WebElement getCvverror() {
		return cvverror;
	}

	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcnum() {
		return ccnum;
	}
	public WebElement getCctype() {
		return cctype;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBtn() {
		return btn;
	}

	public void bookhotel(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {

		WebElement first_name = getFirstname();
		first_name.sendKeys(string);

		WebElement last_name = getLastname();
		last_name.sendKeys(string2);

		WebElement address = getAddress();
		address.sendKeys(string3);

		WebElement cc_num = getCcnum();
		cc_num.sendKeys(string4);

		WebElement txtusername = getCctype();
		Select s=new Select(txtusername);
		s.selectByVisibleText(string5);

		WebElement txtusername1 = getMonth();
		Select s1=new Select(txtusername1);
		s1.selectByVisibleText(string6);

		WebElement txtusername2 = getYear();
		Select s2=new Select(txtusername2);
		s2.selectByVisibleText(string7);

		WebElement cc_cvv = getCvv();
		cc_cvv.sendKeys(string8);

		WebElement btnclick2 = getBtn();
		btnclick2.click();

	}

	public void bookhotel() {

		WebElement btnclick2 = getBtn();
		btnclick2.click();
	}
}
