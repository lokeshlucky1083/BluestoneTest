package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Common_Utility {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_js_cascading_dropdown");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement SubjectDD1 = driver.findElement(By.xpath("//select[@id='subject']"));
		Commonmethod_selectByVisibleText(SubjectDD1, "Front-end");
		Thread.sleep(5000);
		
		WebElement TopicsDD1 = driver.findElement(By.xpath("//select[@id='topic']"));
		Commonmethod_selectByVisibleText(TopicsDD1, "CSS");
		Thread.sleep(5000);
		
		WebElement ChaptersDD1 = driver.findElement(By.xpath("//select[@id='chapter']"));
		Commonmethod_selectByVisibleText(ChaptersDD1, "Margins");
		Thread.sleep(5000);
		
		driver.close();
		

	}
	
	public static void Commonmethod_selectByVisibleText(WebElement ele, String str) {
		
		Select sc = new Select(ele);
		sc.selectByVisibleText(str);
		
	}

}
