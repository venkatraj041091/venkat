package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class SelectHotel extends Baseclass{
	 public SelectHotel() {
		 PageFactory.initElements(driver,this);
		 
}
	 @FindBy(xpath="//td[text()='Select Hotel ']")
	 private WebElement select;
	 
	@FindBy(id="radiobutton_0")
	 private WebElement radiobutton;
	 
	 @FindBy(id="radiobutton_span")
	 private WebElement buttonerror;
	 
	@FindBy(id="continue")
	 private WebElement continuebtn;
	 
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	
	public WebElement getContinuebtn() {
		return continuebtn;
	}
	
	 public WebElement getButtonerror() {
		return buttonerror;
	}
	 
	 public WebElement getSelect() {
			return select;
		}
	
	public void selecthotel() {
		
		WebElement btnclick = getRadiobutton();
		btnclick.click();

		WebElement btnclick1 = getContinuebtn();
		btnclick1.click();

	}
	public void clickbutton() {
		
		WebElement btnclick1 = getContinuebtn();
		btnclick1.click();

	}
}
