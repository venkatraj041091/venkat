package com.stepdefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class stepdefn {
	WebDriver driver;
	@Given("user is on the hotel page")
	public void user_is_on_the_hotel_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com");
		driver.manage().window().maximize();

	}

	@When("user should enter login {string},{string}")
	public void user_should_enter_login(String string, String string2) {
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys(string);

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(string2);

		WebElement btnclick = driver.findElement(By.name("login"));
		btnclick.click();

	}
	@When("hotel option should selected {string},{string},{string},{string},{string},{string},{string},{string}>")
	public void hotel_option_should_selected(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws InterruptedException {


		WebElement location = driver.findElement(By.id("location"));
		Select s=new Select(location);
		s.selectByVisibleText(string);

		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1=new Select(hotel);
		s1.selectByVisibleText(string2);

		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select s2=new Select(roomtype);
		s2.selectByVisibleText(string3);

		WebElement noofrooms = driver.findElement(By.id("room_nos"));
		Select s3=new Select(noofrooms);
		s3.selectByVisibleText(string4);
 
		//WebElement adults = driver.findElement(By.id("adult_room"));
		//Select s4=new Select(adults);
		//s4.selectByVisibleText(string5);

		//WebElement childern = driver.findElement(By.id("child_room"));
		//Select s5=new Select(childern);
		//s5.selectByVisibleText(string6);

		WebElement btnclick = driver.findElement(By.name("Submit"));
		btnclick.click();



	}
	@When("select hotel and user should enter details adress and payment {string},{string},{string},{string},{string},{string},{string},{string}")
	public void select_hotel_and_user_should_enter_details_adress_and_payment(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {

		WebElement btnclick = driver.findElement(By.name("radiobutton_0"));
		btnclick.click();

		WebElement btnclick1 = driver.findElement(By.name("continue"));
		btnclick1.click();

		WebElement first_name = driver.findElement(By.id("first_name"));
		first_name.sendKeys(string);

		WebElement last_name = driver.findElement(By.id("last_name"));
		last_name.sendKeys(string2);

		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys(string3);

		WebElement cc_num = driver.findElement(By.id("cc_num"));
		cc_num.sendKeys(string4);


		WebElement txtusername = driver.findElement(By.id("cc_type"));
		Select s=new Select(txtusername);
		s.selectByVisibleText(string5);

		WebElement txtusername1 = driver.findElement(By.id("cc_exp_month"));
		Select s1=new Select(txtusername1);
		s1.selectByVisibleText(string6);

		WebElement txtusername2 = driver.findElement(By.id("cc_exp_year"));
		Select s2=new Select(txtusername2);
		s2.selectByVisibleText(string7);

		WebElement cc_cvv = driver.findElement(By.id("cc_cvv"));
		cc_cvv.sendKeys(string8);

		WebElement btnclick2 = driver.findElement(By.name("book_now"));
		btnclick2.click();

	}
	@Then("user should get order no and successfull message \"Search Hotel\"")
	public void user_should_get_order_no() throws InterruptedException {
		
		Thread.sleep(5000);
		WebElement cc_cvv = driver.findElement(By.id("order_no"));
		String text = cc_cvv.getAttribute("value");
		System.out.println(text);
		driver.quit();
	}




}
