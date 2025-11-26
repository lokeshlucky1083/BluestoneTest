package automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Selenium {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
        WebElement metalink = driver.findElement(By.xpath("//span[text()='Meta']"));
        metalink.click();
        Thread.sleep(5000);
        
        WebElement about = driver.findElement(By.xpath("//span[text()='About']"));
        about.click();
        Thread.sleep(5000);
        
        WebElement blog = driver.findElement(By.xpath("//span[text()='Blog']"));
        blog.click();
        Thread.sleep(5000);
        
        WebElement jobs = driver.findElement(By.xpath("//span[text()='Jobs']"));
        jobs.click();
        Thread.sleep(5000);
        
        Set<String> allwindows = driver.getWindowHandles();
        
        for(String temp: allwindows)
        {
        	driver.switchTo().window(temp);
        	Thread.sleep(5000);
        	String titleofwindow = driver.getTitle();
        	System.out.println(titleofwindow);
        }
        
        driver.quit();
		

	}

}
