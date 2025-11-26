package automation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Basics_Of_TestNG {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		System.out.println("Opening the browser");
	}
	
	@AfterMethod
	
	public void closeBrowser() {
		System.out.println("Closing the Browser");
		System.out.println("************************************");
	}
	
	@Test
	public void fb1() {
		System.out.println("fb1");
		
	}
	
	@Test
	public void fb2() {
		System.out.println("fb2");
		
	}
	
	@Test
	public void fb3() {
		System.out.println("fb3");
		
	}
	
	@Test
	public void fb4() {
		System.out.println("fb4");
		
	}
	
	@Test
	public void fb5() {
		System.out.println("fb5");
		
	}

}
