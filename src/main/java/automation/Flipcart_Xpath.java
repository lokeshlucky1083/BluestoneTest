package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flipcart_Xpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("poco");
		
		Select sc = new Select(search);
		sc.selectByVisibleText("Option1");
		
		////a[contains(@href,'/poco-c71-desert-gold-64-gb')]//div[@class='KzDlHZ']
	}

}
