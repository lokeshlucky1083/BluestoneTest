package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_in_all_Elements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement actionclass = driver.findElement(By.id("nav-link-accountList"));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		ac.moveToElement(actionclass).build().perform();
		
		List<WebElement> listofallwebelements = driver.findElements(By.xpath("//div[@id='nav-al-container']//a"));
		 
		int totallinks = listofallwebelements.size();
		
		for(int i =0; i<totallinks; i++)
		{
			WebElement templinks = listofallwebelements.get(i);
			String linktest = templinks.getText();
			System.out.println(linktest);
		}
		
		driver.close();

	}

}
