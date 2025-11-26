package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Footer {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		List <WebElement> Listoffooterlinks = driver.findElements(By.xpath("//footer//a"));
		
		int totallinks = Listoffooterlinks.size();
		
		for(int i=0;i<totallinks;i++)
		{
			WebElement templink = Listoffooterlinks.get(i);
			String linktest = templink.getText();
			System.out.println(linktest);
			
		}
		
		driver.close();
		
		
		

	}

}
