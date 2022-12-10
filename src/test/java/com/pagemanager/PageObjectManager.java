package com.pagemanager;

import com.Pages.BookHotelPage;
import com.Pages.BookingConfirmationPage;
import com.Pages.CancelBookingPage;
import com.Pages.LoginPage;
import com.Pages.SearchHotelPage;
import com.Pages.SelectHotel;

public class PageObjectManager  {

	private LoginPage loginPage;
	private SearchHotelPage searchHotelPage;
	private SelectHotel selectHotel;
	private BookHotelPage bookHotelPage;
	private BookingConfirmationPage bookingConfirmationPage;
	private CancelBookingPage cancelBookingPage;
	
	public LoginPage getLoginPage() {
		return (loginPage==null)?loginPage=new LoginPage():loginPage;
	}
	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage==null)?searchHotelPage=new SearchHotelPage():searchHotelPage;
	}
	public SelectHotel getSelectHotel() {
		return (selectHotel==null)?selectHotel=new SelectHotel():selectHotel;
	}
	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage==null)?bookHotelPage=new BookHotelPage():bookHotelPage;
	}
	public BookingConfirmationPage getBookingConfirmationPage() {
		return (bookingConfirmationPage==null)?bookingConfirmationPage=new BookingConfirmationPage():bookingConfirmationPage;
	}
	public CancelBookingPage getCancelBookingPage() {
		return (cancelBookingPage==null)?cancelBookingPage=new CancelBookingPage():cancelBookingPage;
	}
	
	
	
}
