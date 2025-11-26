package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SelectClassPractise {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement SelectValue = driver.findElement(By.xpath("//div[text()='Select Option']"));
		Select sc = new Select(SelectValue);
		int i = sc.getOptions().size();
		System.out.println("Total Count is " +i);
		sc.selectByIndex(i-3);
		
		
	}
	
	public static void CommonMethod_SelectByIndex(WebElement ele, int i) {
		Select sc = new Select(ele);
		sc.selectByIndex(i);
	}

}
