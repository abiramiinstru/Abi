package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(testnglistner.c1.class)   //This is for the Itestlistener c1 class ,we impoted and created connection 
//import from testNg annotations and give class name of c1
//we r connecting to get messages
public class a1 {

	/*assertion : technique where we will be comparing actual result with obtained result
	 * 
	 * hard asserts
	 * 		provided by assert builtin class
	 * 		static in nature
	 * 		if assertion fails=> stop the execution
	 * 
	 * soft asserts
	 * 		provided by softassert builtin class
	 * 		Nonstatic in nature
	 * 		if assertion fail=>it will proceed further
	 * 
	 * Asserts methods:
	 * assertEqual(actual,expected)
	 * assertnotEqual(actual,expected)
	 * assertTrue(condition)
	 * assertFalse(condition)
	 * 
	 * */
	//hard asserts
	@Test
	public void hd()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91979\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    //classname objectnmae= new classname();
			ChromeDriver ob= new ChromeDriver();
			ob.get("http://www.google.com");
			//Assert.assertEquals(ob.getTitle(), "Google");
			//Assert.assertNotEquals(ob.getTitle(), "yahoo");
			WebElement ele = ob.findElementByLinkText("Images");
			//Assert.assertTrue(ele.isDisplayed());
			Assert.assertFalse(ele.isSelected()); //if we give false condition it will proceed to next
			ob.quit();
	}
}
