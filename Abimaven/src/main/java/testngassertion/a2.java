package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class a2 {

//softasserts
	
	/* soft asserts
	 * 		provided by softassert builtin class
	 * 		Nonstatic in nature
	 * 		if assertion fail=>it will proceed further
	 * */
	@Test
	public void sft()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91979\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    //classname objectnmae= new classname();
			ChromeDriver ob= new ChromeDriver();
			ob.get("http://www.google.com");
			SoftAssert s = new SoftAssert();
			s.assertEquals(ob.getTitle(), "yahoo"); //error but it it will move to next for execution
			//s.assertNotEquals(ob.getTitle(), "yahoo");
		//WebElement ele = ob.findElementByLinkText("Images");
		
			//s.assertTrue(ele.isDisplayed());
			//s.assertFalse(ele.isSelected());
			ob.quit();
			s.assertAll(); //it will give what and all failed
}
}
