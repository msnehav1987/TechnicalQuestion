package com.interview;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PrintalltextFromDropDownList {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.etouch.net/home/index.html");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
	    WebElement services = driver.findElement(By.xpath("//li[@id='services']"));	
	    Actions act = new Actions(driver);
	    act.moveToElement(services).perform();
		List<WebElement> dropdown = driver.findElements(By.xpath("//li[@id='services']//ul//ul/li"));
                    System.out.println(dropdown.size());
                    for(int i=0;i<dropdown.size();i++){
                    	String ListItems = dropdown.get(i).getText();
                    	System.out.println(ListItems);
                    	driver.close();
                    }
	}

}
