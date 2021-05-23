package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import businessfunctions.BaseClass;
import businessfunctions.LoginLogoutFunctions;
import pagerepository.LoginPage;
import pagerepository.LogoutPage;

public class LoginandLogoutTest extends BaseClass

{

	
	
	{
		
		//
		//driver.manage().window().maximize();
		BaseClass.openbrowser();
		
		LoginLogoutFunctions.login();
		
		LoginLogoutFunctions.logout();
		
		LoginLogoutFunctions.myinformation();
		
		
		//System.setProperty("webdriver.chrome.driver","D:\\Nidhi\\JAVA_practice\\SeleniumFramework\\src\\main\\java\\drivers\\chromedriver.exe");
		 
		//WebDriver driver= new ChromeDriver();
		
	//driver.get("https://opensource-demo.orangehrmlive.com");
		
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//driver.findElement(By.name("Submit")).click();
		
		
		//driver.findElement(By.partialLinkText("Welcome")).click();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.linkText("Logout")).click();
		
		//LoginPage.enterUserName();
		//LoginPage.enterPassword();
		//LoginPage.ButtonClick();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//MyInfo.click();
		//MyInfo.editbtn();
				
		//LogoutPage.clickwelcome();
		//LogoutPage.clicklogout();
		
		//BaseClass.closeBrowser();
		
		
		
		//driver.close();
		//driver.quit();
		
		
		
	}

}
