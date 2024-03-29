package com.selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {
	
	public static void main(String[] args) {
		// set driver property
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\Selenium\\Selenium standalone server jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");// give the url on which u want to perform testing
		
		String expected="Facebook � log in or sign up";// u will get this title while bookmarking
		String actual=driver.getTitle();
		
		if(expected.equals(actual))
			System.out.println("Test Passed..!");
		else
			System.out.println("Test failed");
		
		driver.close();// to close opened tabs automatically
	}

}
