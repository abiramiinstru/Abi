package testngannotation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class a1 {
	
	
	
	/*before test  : run only once before all the test cases started its execution
	 * after test  : run only once after all the test cases finished its execution 
	 * 
	 * 
	 * Before class : run only once after before test
	 * After class : run only once before after test
	 * 
	 * Before Method: run before each test cases
	 * After Method : run after each test cases
	 *
	 * 
	 * pattern:
	 *before test                                // website visiting
	 *		before class                         //maximize
	 *		before method   tc1  after method    //refresh(bm)  gettititle(tc1)     deleting all cookies(am)
	 *		before method   tc2  after method    //refresh(bm)  click "help"(tc2)   deleting all cookies(Am)
	 *		after class               			 //getting url
	 *after test								 // closing
	 * 
	 * */
	ChromeDriver ob;
	@BeforeTest
	public void bt()
	{
		System.out.println("before test");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\91979\\Downloads\\chromedriver_win32\\chromedriver.exe");
			ob=new ChromeDriver();
			ob.get("http://www.mycontactform.com");
	}
	@AfterTest
	public void at()
	{
	
			System.out.println("After Test");
			ob.quit();
	}
	
	@BeforeClass
	public void btc() throws InterruptedException
	{
		System.out.println("before class");
		ob.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void atc()
	{
		System.out.println("after class");
		System.out.println(ob.getCurrentUrl());
	}
	
	
	@BeforeMethod
	public void btm() throws InterruptedException
	{
		System.out.println("before method");
		ob.navigate().refresh();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void atm()
	{
		System.out.println("after methd");
		ob.manage().deleteAllCookies();
	}
	
	@Test(priority=0)
	public void tc1()
	{
		System.out.println("Test case 1");
		System.out.println(ob.getTitle());
		
	}
	
	@Test(priority=1)
	public void tc2() throws InterruptedException
	{
		System.out.println("Test case 2");
		ob.findElementByLinkText("Help").click();
		Thread.sleep(2000);
		
	}

}
