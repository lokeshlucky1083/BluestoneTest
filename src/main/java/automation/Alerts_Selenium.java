package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Selenium {

	public static void main(String[] args) throws InterruptedException {
		//Simple alert --> It will be just display with okay button on pop up
		//gettextfromalert();
		
		//Confirmaition Alert--> It will display both Ok & Cancel button on pop up
		//acceptthepopup();
		//dismissthepopup();
		
		//Prompt alert--> it will allows text before clicking on Ok (or) cancel
		sendkeys();
		
		
	}

	private static void sendkeys() throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("https://demo.automationtesting.in/Alerts.html"));
		WebElement keys = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		WebElement button = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		keys.click();
		Thread.sleep(5000);
		driver.switchTo().alert().sendKeys("Lokesh");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		driver.close();
		
	}

	private static void gettextfromalert() throws InterruptedException {
		String expectedmessage = "Customer Successfully Delete!";
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement customerid = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement demo2 = driver.findElement(By.name("submit"));
		customerid.sendKeys("7987853");
		demo2.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		String actualmessage = driver.switchTo().alert().getText();
		System.out.println("actualmessage");
		if(actualmessage.equals(expectedmessage))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
		
		driver.switchTo().alert().accept();
		driver.quit();
	}

	private static void dismissthepopup() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement customerid = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement demo2 = driver.findElement(By.name("submit"));
		customerid.sendKeys("7987853");
		demo2.click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		
	}

	private static void acceptthepopup() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement customerid = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement demo2 = driver.findElement(By.name("submit"));
		customerid.sendKeys("7987853");
		demo2.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		
		
	}

}
