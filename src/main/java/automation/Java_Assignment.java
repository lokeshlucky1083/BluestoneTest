package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Java_Assignment {
	WebDriver driver;
	
	
	@BeforeMethod
	public void CreateDriver() {
		driver = new ChromeDriver();
	}
	
	@AfterMethod
	public void closingbrowsers() {
		driver.quit();
	}
	
	@Test
	public void google() {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("page of the title: " +title);
		
	}
	
	@Test
	public void entertext() {
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.findElement(By.id("searchInput")).sendKeys("Selenium WebDriver");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	@Test
	public void linktest() {
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		String DownloadsTitle = driver.getTitle();
		System.out.println("Page title is:" +DownloadsTitle);
	}
	@Test
	public void dropdown() {
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		Select sc = new Select(country);
		sc.selectByVisibleText("INDIA");
		
	}
	
	@Test
	public void alert() throws InterruptedException {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(10000);
		driver.switchTo().alert().accept();
	}
	
	@Test
	public void allelements() {
		driver.get("https://www.wikipedia.org/");
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println("Totallinks :" +alllinks.size());
		for(WebElement link: alllinks)
		{
			System.out.println(link.getText()+"  "+ link.getAttribute("href"));
		}
		
	}
	
	

}


