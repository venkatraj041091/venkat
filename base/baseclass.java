package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {

	public static WebDriver driver;
	@SuppressWarnings("resource")
	public String getdatafromcell(String sheetname,int rownum,int cellnum) throws IOException {
		String re="";
		File file =new File("C:\\Users\\venky\\OneDrive\\Desktop\\selenium\\demoframe\\excelsheet\\adactin hotel.xlsx");
		FileInputStream fileinputstream =new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(fileinputstream);
		org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet(sheetname);
		Row row = ((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType cellType = cell.getCellType();
		switch (cellType) {
		case STRING:
			String stringCellValue = cell.getStringCellValue();
			re=stringCellValue;
			break;
		case NUMERIC: 
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yy");
				re=dateformat.format(dateCellValue);
			}else {
				double numericCellValue = cell.getNumericCellValue();
				BigDecimal valueof=BigDecimal.valueOf(numericCellValue);
				long longValue = valueof.longValue();
				String valueOf2 = String.valueOf(longValue);
				re=valueOf2;

			}
		default:
			break;

		}
		return re;
	}

	public String getdatafromfile(int x) throws IOException {

		File f=new File("C:\\Users\\venky\\OneDrive\\Desktop\\selenium\\demoframe\\excelsheet\\amozone project.txt");
		@SuppressWarnings("deprecation")
		List<String> readLines = FileUtils.readLines(f);
		String string = readLines.get(x);
		return string;
	}
	@SuppressWarnings("resource")
	public void updatecell(String sheetname,int rownum,int cellnum,String olddata,String newdata) throws IOException {
		File file =new File("C:\\Users\\venky\\OneDrive\\Desktop\\selenium\\demoframe\\excelsheet\\adactin hotel.xlsx");
		FileInputStream fileinputstream =new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(fileinputstream);
		org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String stringCellValue = cell.getStringCellValue();
		if(stringCellValue.equals(olddata)){
			cell.setCellValue(newdata);

		}
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		workbook.write(fileOutputStream);


	}
	@SuppressWarnings({ "resource" })
	public void writedata(String sheetname,int rownum,int cellnum,String data ) throws IOException {

		File file =new File("C:\\Users\\venky\\OneDrive\\Desktop\\selenium\\demoframe\\excelsheet\\adactin hotel.xlsx");
		FileInputStream fileinputstream =new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(fileinputstream);
		Sheet sheet = (Sheet) workbook.getSheet(sheetname);
		Row row = ((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(data);

		FileOutputStream fileOutputStream=new FileOutputStream(file);
		workbook.write(fileOutputStream);



	}

	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;
	}
	public void enterApplyUrl(String url) {
		driver.get(url);
	}
	public void maximizewindow() {

		driver.manage().window().maximize();

	}
	public void cleartext(WebElement element) {
		element.clear();

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
	public void elementSendkeysJs(WebElement element,String data) {
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("argument[0].setAttribute('value',"+data+"')",element);
	}

	public void jsclick(WebElement element) {
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		executor.executeScript(" arguments[0].click();",element);
	}

	public void elementClick1(WebElement element) {
		element.click();
	}
	public String getAppInTitle() {
		String title = driver.getTitle();
		return title;
	}
	public WebElement findElementById(String attributevalue) {
		WebElement element = driver.findElement(By.id(attributevalue));
		return element;
	}
	public WebElement findElementByname(String attributevalue) {
		WebElement element = driver.findElement(By.name(attributevalue));
		return element;
	}
	public WebElement findElementByclassName(String attributevalue) {
		WebElement element = driver.findElement(By.className(attributevalue));
		return element;
	}
	public WebElement findElementByXpath(String xpathvalue) {
		WebElement element = driver.findElement(By.xpath(xpathvalue));
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
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
	public void takescreenshot() throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File screenshotas=ts.getScreenshotAs(OutputType.FILE); 
		System.out.println(screenshotas);
		File f=new File(" C:\\Users\\venky\\OneDrive\\Desktop\\selenium\\javamaterial");
		FileUtils.copyFile(screenshotas, f);

	}

	public void windowshandle() {
		Set<String> windowHandles = driver.getWindowHandles();
		for (Iterator<String> iterator = windowHandles.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();

			driver.switchTo().window(string);
		}
	
	}
}






