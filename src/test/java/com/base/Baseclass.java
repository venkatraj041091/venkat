package com.base;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;

	public static String getprojectpath() { 
		String path=System.getProperty("user.dir");
		return path;
	}
	
	public byte[] screenshort() {
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		byte[] screenshotAs = screenshot.getScreenshotAs(OutputType.BYTES);
		return screenshotAs;

	}

	public static String getpropertyFileValue(String key) throws FileNotFoundException, IOException {
		Properties properties =new Properties();
		properties.load(new FileInputStream(getprojectpath()+"\\config\\config.properties"));
		String value=(String)properties.get(key);
		return value;
	}

	public static void getDriver1(String browser) {
		switch(browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new ChromeDriver();
			break;

		case "ie":
			WebDriverManager.chromedriver().setup();
			driver=new InternetExplorerDriver();
			break;

		case "edge":
			WebDriverManager.chromedriver().setup();
			driver=new EdgeDriver();
			break;

		default:
			break;
		}

	}

	
	public static void enterApplyUrl(String url) {
		driver.get(url);
	}
	public void maximizewindow() {

		driver.manage().window().maximize();

	}
	public void elementSendKeys(WebElement element,String data) {
		element.sendKeys(data);

	}
	public void elementClick(WebElement element) {
		element.click();
	}
	public String getApplyTitle(String url) {
		driver.get(url);
		return url;

	}
	public void robotclass() throws AWTException {
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void elementSendkeysJs(WebElement element,String data) {
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("argument[0].setAttribute('value',"+data+"')",element);
	}
	
	
	public void elementclear(WebElement element) {
		element.clear();

	}
	
	public String getAppInTitle() {
		String title = driver.getTitle();
		return title;
	}
	public WebElement findElementById(String attributevalue) {
		WebElement element = driver.findElement(By.id(attributevalue));
		elementvisibilty(element);
		return element;
	}
	public WebElement findElementByname(String attributevalue) {
		WebElement element = driver.findElement(By.name(attributevalue));
		elementvisibilty(element);
		return element;
	}
	public WebElement findElementByclassName(String attributevalue) {
		WebElement element = driver.findElement(By.className(attributevalue));
		elementvisibilty(element);
		return element;
	}
	public WebElement findElementByXpath(String xpathvalue) {
		WebElement element = driver.findElement(By.className(xpathvalue));
		elementvisibilty(element);
		return element;
	}
	public void closeWindow() {
		driver.close();
	}
	public void quitwindow() {
		driver.quit();
	}
	public String getAppInUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	public String elementgettext(WebElement element) {
		String text = element.getText();
		return text;
	}
	public String elementGetAttributevalue(WebElement element) {
		implicitywait();
		elementvisibilty(element);
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public String elementGetAttributevalue(WebElement element,String attributename) {
		String attribute = element.getAttribute(attributename);
		return attribute;
	}
	public void selectoptionbytext(WebElement element,String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	public void selectOptionByValue(WebElement element,String text) {
		Select select=new Select(element);
		select.selectByValue(text); 
	}
	public void selectOptionbyIndex(WebElement element,int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	public void refreshpage() {
		driver.navigate().refresh();
	}
	public void forwardpage() {
		driver.navigate().forward();
	}
	public void backpage() {
		driver.navigate().back ();
	}

	public boolean elementIsEnable(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}
	public boolean elementIsDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}
	public boolean elementIsselected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}
	public void implicitywait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	public void elementvisibilty(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void moveToElement(WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
	}
	public void doubleclick(WebElement element) {
		Actions action=new Actions(driver);
		action.doubleClick(element).perform();
	}
	public void dragAnaDropElementt(WebElement element,WebElement element2) {
		Actions action=new Actions(driver);
		action.dragAndDrop(element, element2).perform();
	}
	public void rightClickofElement(WebElement element) {
		Actions action=new Actions(driver);
		action.contextClick(element).perform();
	}
	public void alertaccept() {
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	public void alertDismisses() {
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}
	public void promptAlert(String text ) {
		Alert alert=driver.switchTo().alert();
		alert.sendKeys(text);
		alert.accept();
	}
	public void elementScrollup(WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("argument[0].scrollIntoView(false)",element);
	}
	public void elementScrollDown(WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("argument[0].scrollIntoView(true)",element);
	}
	public void elementSClick(WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("argument[0].click()",element);
	}
	public void deselectoptionbytext(WebElement element,String text) {
		Select select=new Select(element);
		select.deselectByVisibleText(text);
	}
	public void deselectbyvalue(WebElement element,String text) {
		Select select=new Select(element);
		select.deselectByValue(text);
	}
	public void deselectbyindex(WebElement element,int number) {
		Select select=new Select(element);
		select.deselectByIndex(number);
	}
	public void deselectall(WebElement element) {
		Select select=new Select(element);  
		select.deselectAll();
	}
	public void getOptionDropDown(WebElement element) {
		Select select=new Select(element);
		List<WebElement> options = select.getOptions();
		for(int i=0;i<options.size();i++) {
			WebElement element2 = options.get(i);
			String text = element2.getText();
			select.selectByVisibleText(text);

		}


	}

}
