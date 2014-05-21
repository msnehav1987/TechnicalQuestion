package Handle_WebPagesControls;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
		driver.findElement(By.xpath("//a[@data-tracking-id='Mobiles']")).click();
		System.out.println(driver.getTitle());
		
		
	List<WebElement> AllchkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println("Total no of checkbox present in webPage is : "+ AllchkBox.size());
		
			for(int i = 0;i<AllchkBox.size()-1;i++){
				System.out.println(AllchkBox.get(i).getAttribute("name"));
				AllchkBox.get(i).click();
				
				
		}
		driver.close();
	}

}
