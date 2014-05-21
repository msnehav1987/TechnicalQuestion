package Handle_WebPagesControls;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageLinkHandle {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
		driver.get("http://www.flipkart.com/");
		
	List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
    int 	LinkCount = AllLinks.size();

System.out.println("Total links are present in page is : "+ LinkCount);

for(int i = 0;i<LinkCount;i++){
	
	String TextLink = AllLinks.get(i).getText();
	
	if(TextLink.length()==0){
		
		TextLink.replaceAll("  ","");
			
	}
	else{
		
		System.out.println(TextLink);
		//System.out.println("The Attributes are : "+ AllLinks.get(i).getAttribute("href"));
	}
}
		
            
		
		
		
		driver.close();

	}

}
