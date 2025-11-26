package Automation.BluestoneTest;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/India");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		driver.close();

	}

}
