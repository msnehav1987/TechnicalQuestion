package Handle_WebPagesControls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.irctc.co.in/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("msneha.v");
		String v = driver.findElement(By.xpath("//input[@name='userName']")).getAttribute("value");
		System.out.println(v);
        System.out.println(v.split("  ").length);
        driver.quit();
	}

}
