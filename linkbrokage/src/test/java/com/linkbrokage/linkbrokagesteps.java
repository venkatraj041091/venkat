package com.linkbrokage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linkbrokagesteps {
	public static void main(String[] args) throws IOException, InterruptedException   {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com");
		driver.manage().window().maximize();
		List<WebElement> linkcount = driver.findElements(By.tagName("a"));
		int size = linkcount.size();
		System.out.println("total link of the site"+size);
		int count=0;
		for(int i=0;i<linkcount.size();i++) {
			String name=linkcount.get(i).getAttribute("href");
			URL url=new URL(name);
			Thread.sleep(50000);
			URLConnection openConnection = url.openConnection();
			HttpsURLConnection Con = (HttpsURLConnection) openConnection;
			int responseCode = Con.getResponseCode();
			if(!(responseCode==200)) {
				System.out.println("the broken link are"+ name);
			}}
driver.close();
	}


}
