package automation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataProvider_test {
	
	@Test (dataProvider = "ValidLoginData")
	public void testcase01(String userID, String pwd ) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		username.sendKeys(userID);
		password.sendKeys(pwd);
		Thread.sleep(4000);
		driver.quit();
	}
	
	@Test (dataProvider = "InValidLoginData")
	public void testcase02(String userID, String pwd ) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		username.sendKeys(userID);
		password.sendKeys(pwd);
		Thread.sleep(4000);
		driver.quit();
	}
	
	

	
	@DataProvider(name = "ValidLoginData")
	public Object[][] getValidData(){
		return new Object[][] {
			
			{"username01", "PassWord01"},
			{"username02", "PassWord02"},
			{"username03", "PassWord03"},
			{"username04", "PassWord04"},
			{"username05", "PassWord05"}
			
		};
	}
	
	
	@DataProvider(name = "InValidLoginData")
	public Object[][] getInvalidData(){
		return new Object[][] {
			
			{"usernfsdame01", "PassWord01"},
			{"username02", "PassWssssord02"},
			{"usern4555ame03", "PassWord03"},
			{"username04", "PassW999ord04"},
			{"username05", "PassxxxxxWord05"}
			
		};
	}
	
	
	
}
