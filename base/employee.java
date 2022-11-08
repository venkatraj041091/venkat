package com.base;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class employee extends baseclass {
	public static void main(String[] args) throws IOException, InterruptedException {
		employee e=new employee();
		e.booking();

	}
	public void booking() throws IOException, InterruptedException  {
		getDriver();
		
		enterApplyUrl("https://adactinhotelapp.com/");
		
		maximizewindow();
		
		WebElement id = findElementById("username");
		String pass = getdatafromcell("Sheet1",1,0);
		elementSendKeys(id,pass);

		WebElement id1 = findElementById("password");
		String pass1 = getdatafromcell("Sheet1",1,1);
		elementSendKeys(id1,pass1);

		WebElement btnclick = findElementById("login");
		elementClick(btnclick);

		WebElement locatio = findElementById("location");
		String text = getdatafromcell("Sheet1",2,2);
		selectoptionbytext(locatio,text);
		
		WebElement hotel = findElementById("hotels");
		String text1 = getdatafromcell("Sheet1",2,3);
		selectoptionbytext(hotel,text1);

		WebElement room = findElementById("room_type");
		String d = getdatafromcell("Sheet1",2,4);
		selectoptionbytext(room,d);

		WebElement noroom = findElementById("room_nos");
		String c = getdatafromcell("Sheet1",2,5);
    	selectoptionbytext(noroom,c);

		WebElement checkin = findElementById("datepick_in");
		String in = getdatafromcell("Sheet1",2,7);
		elementSendKeys(checkin,in);
		
		WebElement adult = findElementById("adult_room");
		String no = getdatafromcell("Sheet1",2,8);
		selectoptionbytext(adult,no);
		
		WebElement child = findElementById("child_room");
		String w = getdatafromcell("Sheet1",2,9);
		selectoptionbytext(child,w);
		
		WebElement searchbtn = findElementById("Submit");
		elementClick1(searchbtn);
		
		WebElement searchbtn1 = findElementById("radiobutton_0");
		elementClick1(searchbtn1);
		
		WebElement searchbtn2 = findElementById("continue");
		elementClick1(searchbtn2);
		
		WebElement firstname = findElementById("first_name");
		String namedata = getdatafromcell("Sheet1",2,11);
		elementSendKeys(firstname,namedata);
		
		WebElement lastname = findElementById("last_name");
		String dataname = getdatafromcell("Sheet1",2,12);
		elementSendKeys(lastname,dataname);
		
		WebElement billing = findElementById("address");
		String adress = getdatafromcell("Sheet1",2,13);
		elementSendKeys(billing,adress);
		
		WebElement cardno = findElementById("cc_num");
		String num = getdatafromcell("Sheet1",2,14);
		elementSendKeys(cardno,num);
		
		WebElement card = findElementById("cc_type");
		String q = getdatafromcell("Sheet1",2,15);
		selectoptionbytext(card,q);

		WebElement month = findElementById("cc_exp_month");
		String p = getdatafromcell("Sheet1",2,16);
		selectoptionbytext(month,p);

		WebElement year = findElementById("cc_exp_year");
		String o = getdatafromcell("Sheet1",2,17);
		selectoptionbytext(year,o);

		WebElement cvv = findElementById("cc_cvv");
		String no1 = getdatafromcell("Sheet1",2,18);
		elementSendKeys(cvv,no1);
		
		WebElement book = findElementById("book_now");
		elementClick1(book);
		
		implicitywait();
		
		WebElement order = findElementById("order_no");
		String ordervalue = elementGetAttributevalue(order);
		System.out.println(ordervalue);
		
	    implicitywait();
	    Thread.sleep(5000);
		
		writedata("Sheet1",2,19,ordervalue);
		
		
		quitwindow();

	}
}
