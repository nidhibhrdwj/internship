package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import businessfunctions.BaseClass;

public class MyInfo extends BaseClass{
	
	public static By myinfo  = By.xpath("//*[@id=\"menu_pim_viewMyDetails\"]/b");
	public static By edit = By.id("btnSave");
	public static By dob =By.id("personal_DOB");
	
	public static void click()
	{
		WebElement element=driver.findElement(myinfo);
		
		
		Actions action=new Actions(driver);
		
		
		action.moveToElement(element).click();
		
	}
	
	public static void editbtn()
	{
		driver.findElement(edit).click();
	}
	
	public static void DOB()
	{
		driver.findElement(dob).sendKeys("1975-10-23");
	}
	
	

}
