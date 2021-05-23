package pagerepository;

import java.util.Set;

import org.openqa.selenium.By;


import businessfunctions.BaseClass;

public class MyInfo extends BaseClass{
	
	
	public static By myinfo  = By.xpath("//*[@id=\"menu_pim_viewMyDetails\"]/b");
	public static By edit = By.id("btnSave");
	public static By dob =By.id("personal_DOB");
	public static By name=By.name("personal[txtEmpFirstName]");
	public static void selectinfo()
	{
		
	driver.findElement(myinfo).click();
	
	}
	
	public static void clickeditbtn()
	{
	driver.findElement(edit).click();
	}
	
	public static void enterDOB()
	{
		driver.findElement(dob).sendKeys("1987-04-04");
	}
	public static void entername()
	{
		driver.findElement(name).sendKeys("Nidhi");
	}
}
