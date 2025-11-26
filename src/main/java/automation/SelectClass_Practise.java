package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass_Practise {
	public static void main(String[] args) throws InterruptedException {
	commonmethodToSelectlastButtonvalue("//select[@id='dropdown-class-example']");
	
}
public static void commonmethodToSelectlastButtonvalue (String ddlXpath) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	WebElement ddl = driver.findElement(By.xpath(ddlXpath));
	Select sc = new Select(ddl);
	int Count = sc.getOptions().size();
	System.out.println("Length is:" +Count);
	sc.selectByIndex(Count-2);
	Thread.sleep(5000);
	driver.close();
	
	
	

}

}
