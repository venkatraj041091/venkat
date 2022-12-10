package com.Pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class LoginPage extends Baseclass{
	public LoginPage() {
		PageFactory.initElements(driver,this);

	}
	@FindBy(id="username")
	private WebElement username;

	@FindBy(id="password")
	private WebElement password;

	@FindBy(id="login")
	private WebElement login;

	@FindBy(xpath="//b[text()='Invalid Login details or Your Password might have expired. ']")
	private WebElement error;


	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	

	public WebElement getError() {
		return error;
	}

	public void login(String Username, String password) {


		WebElement txtusername = getUsername();
		txtusername.sendKeys(Username);

		WebElement txtpassword = getPassword();
		txtpassword.sendKeys(password);

		WebElement btnclick = getLogin();
		btnclick.click();

	}

	public void LoginWithEnterKey(String Username, String password) {
		WebElement txtusername = getUsername();
		txtusername.sendKeys(Username);

		WebElement txtpassword = getPassword();
		txtpassword.sendKeys(password,Keys.ENTER);

	}
	
}
