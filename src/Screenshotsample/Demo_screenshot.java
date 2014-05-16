package Screenshotsample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

//To do this, its not closing the webpage

public class Demo_screenshot {

	@Test
	public void testA() throws IOException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		EventFiringWebDriver efd = new EventFiringWebDriver(driver);
		File srcFile = efd.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("c://screenshots//facebook.png"));
		efd.close();
		driver.close();
	}
	

}
