package automation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Implicit_wait {
	
	WebDriver driver;
	
	@BeforeMethod
	public void CreateDriver() {
		driver = new ChromeDriver();
	}
	
	
	@Test
	public void implicitwaitexample() {
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/dynamic-prop.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.findElement(By.id("colorChange")).click();
		driver.findElement(By.id("visibleAfter")).click();
		driver.close();
	}
	
	@Test
	public void Withoutimplicitwaitexample() throws InterruptedException {
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/dynamic-prop.php");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.findElement(By.id("colorChange")).click();
		Thread.sleep(20000);
		driver.findElement(By.id("visibleAfter")).click();
		driver.close();
	}
	
	
	

}
