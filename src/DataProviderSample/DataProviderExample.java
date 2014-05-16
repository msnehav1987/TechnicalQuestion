package DataProviderSample;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	@DataProvider(name="LoginData")
	
	public Object[][] getdata(){
		String a[] [] = new String[3] [2];
		a[0] [0] = "A";
		a[0] [1] = "X";
		a[1] [0] = "B";
		a[1] [1] = "Y";
		a[2] [0] = "C";
		a[2] [1] = "Z";
		
return a;
		
				
	}
	
	@Test(dataProvider = "LoginData")
	public void testA(String un,String pwd){
		
		
		Reporter.log("Entering username : " + un,true);
		Reporter.log("Entering Password : " + pwd,true);
		Reporter.log("Clicking login button",true);
	}

}
