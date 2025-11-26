package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Xpaths {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement loginbutton = driver.findElement(By.xpath("//button[@name='login']"));
		
		username.sendKeys("Lokeshlucky1083@gmail.com");
		Thread.sleep(5000);
		password.sendKeys("534534534");
		Thread.sleep(6000);
		loginbutton.click();
		
		Thread.sleep(8000);
		
		driver.close();
		
		

	}

}
