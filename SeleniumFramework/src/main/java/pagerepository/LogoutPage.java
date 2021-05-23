package pagerepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import businessfunctions.BaseClass;

public class LogoutPage extends BaseClass
{

	//static WebDriver driver = null;

	public static By linkWelcome = By.partialLinkText("Welcome");
	public static By logout = By.linkText("Logout");

	public static void clickwelcome() {
		driver.findElement(linkWelcome).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void clicklogout() {
		
		
		driver.findElement(logout).click();
	}

}
