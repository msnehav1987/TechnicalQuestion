package Handle_WebPagesControls;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButton {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///C:/Users/Neha_EAFT/Desktop/Radio.html");
		//Explicitly wait (Web driver wait)
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("123")));
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@value='Water']")).click();
		
		List<WebElement> Allradio = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(Allradio.size());
		
		for(int i =0;i<Allradio.size();i++){
			
			System.out.println(Allradio.get(i).getAttribute("value"));
			System.out.println(Allradio.get(i).getAttribute("name"));
		}
		driver.close();
		
	}
}
