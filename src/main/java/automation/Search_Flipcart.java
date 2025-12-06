package automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Search_Flipcart {
	WebDriver driver;
	String URL;
	String browsertype;
	
	
	
	@BeforeMethod
	public void run() throws IOException {
		String filepath = "C:\\Users\\lokes\\eclipse-workspace\\BluestoneTest\\Resources\\propertyFile.properties";
		FileInputStream fis = new FileInputStream(filepath);
		Properties prop = new Properties();
		prop.load(fis);
		URL = prop.getProperty("prod_url");
		System.out.println("URl from property file: " +URL);
		
		browsertype = prop.getProperty("browser");
		
		if(browsertype.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browsertype.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else if(browsertype.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("please use only this keyword chrome, firefox, Edge");
		}
				
	}
	
	@Test
	public void searchFlipkart() {
		driver.get(URL);
		System.out.println("Search_Flipkart");
	}
	
	@Test
	public void voiceFlipkart() {
		driver.get(URL);
		System.out.println("voice_Flipkart");
	}
	
}
