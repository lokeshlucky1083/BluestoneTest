package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes_Selenium {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		driver.switchTo().frame("courses-iframe");
		
		WebElement joinnow = driver.findElement(By.xpath("//a[text()='JOIN NOW']"));
		joinnow.click();
		
		//Coming out of the frame
		driver.switchTo().defaultContent();
		
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='radio1']"));
		radio1.click();

	}

}
