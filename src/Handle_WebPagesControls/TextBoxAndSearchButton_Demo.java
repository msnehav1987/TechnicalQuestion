package Handle_WebPagesControls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBoxAndSearchButton_Demo {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.lenskart.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// using textBox and clicking on GO button
		
		String Pagetitle = driver.getTitle();
		System.out.println("Previous Page Title is : " +Pagetitle);
		driver.findElement(By.id("UI-SEARCH-AUTO")).sendKeys("Brown glasses");
		driver.findElement(By.id("searchBtn")).click();
		
		String AfterSearchTitle = driver.getTitle();
		System.out.println("After Search Page Title is :" + AfterSearchTitle);
		if(Pagetitle.equals(AfterSearchTitle)){
			System.out.println("Operation not performed");
		}
		else{
			
			System.out.println("Operation done successfully");
		}

		driver.close();
	}

}
