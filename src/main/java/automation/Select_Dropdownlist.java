package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdownlist {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement ddlElement = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		driver.manage().window().maximize();
		
		Select sc= new Select(ddlElement);
		sc.selectByVisibleText("Option2");
		
		Thread.sleep(5000);
		
		sc.selectByIndex(3);
		
		Thread.sleep(5000);
		
		sc.selectByValue("option1");
		
		Thread.sleep(5000);
		
		sc.selectByValue("option2");
		
		driver.close();

	}

}
