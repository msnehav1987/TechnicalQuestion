package com.interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeleteCookies {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
       System.out.println("Cookies before delete :"+driver.manage().getCookies());
       driver.manage().deleteAllCookies();
       System.out.println("Cookies after deletion : "+ driver.manage().getCookies());
       
       driver.close();
	}

}
