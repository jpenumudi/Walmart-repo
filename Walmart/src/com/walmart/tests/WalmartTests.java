package com.walmart.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WalmartTests {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true"); // Stops showing starting chrome browser...... in the console
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.get("https://www.walmart.com/");
		
		// search functionality
		
		driver.findElement(By.linkText("Learn more")).click();
		System.out.println("Learn more link clicked");
		

		driver.close();
	
	}


	

}
