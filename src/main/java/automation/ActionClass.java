package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		//actionclass();
		//doubleclick();
		//rightclick();
		dragAnddrop();
	}

	private static void dragAnddrop() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/#");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement fromElement = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement toElement = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(fromElement, toElement).build().perform();
		Thread.sleep(5000);
		driver.close();
		
	}

	private static void rightclick() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions ac = new Actions(driver);
		ac.contextClick(button).build().perform();
		Thread.sleep(5000);
		driver.close();
		
	}

	private static void doubleclick() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions ac = new Actions(driver);
		ac.doubleClick(button).build().perform();
		Thread.sleep(5000);
		driver.close();
	}

	private static void actionclass() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement actionclass = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		ac.moveToElement(actionclass).build().perform();
		
		WebElement yourmembership = driver.findElement(By.xpath("//span[text()='Your Prime Membership']"));
		Thread.sleep(5000);
		yourmembership.click();
		driver.close();
		
	}

}
