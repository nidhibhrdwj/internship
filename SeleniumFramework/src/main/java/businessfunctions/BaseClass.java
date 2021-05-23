package businessfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.config;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void  openbrowser()
	{

		System.setProperty("webdriver.chrome.driver","D:\\Nidhi\\JAVA_practice\\SeleniumFramework\\src\\main\\java\\drivers\\chromedriver.exe");
		 
		driver= new ChromeDriver();
		
		driver.get(config.getPropertyValue("url"));
		
	}
	/*public static void closeBrowser()
	{
		driver.close();
		//driver.quit();
		
	}*/
	

}
