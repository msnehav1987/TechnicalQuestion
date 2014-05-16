package TestNGWithAnt;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestMessageUtil {
    String message = "Manisha";	
    MessageUtil messageUtil = new MessageUtil(message);
	   
    @Test
    public void testPrintMessage() {	
        System.out.println("Inside testPrintMessage()");     
        Assert.assertEquals(message,messageUtil.printMessage());
    }

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Manisha";
        Assert.assertEquals(message,messageUtil.salutationMessage());
    }
}