package businessfunctions;

import pagerepository.LoginPage;
import pagerepository.LogoutPage;
import pagerepository.MyInfo;

public class LoginLogoutFunctions extends BaseClass {
	
	
	public static void login()
	{
		LoginPage.enterUserName();
		LoginPage.enterPassword();
		LoginPage.ButtonClick();
	}
	
	public static void logout()
	{
		LogoutPage.clickwelcome();
		LogoutPage.clicklogout();
	}
	public static void myinformation()
	{
	MyInfo.selectinfo();
	MyInfo.clickeditbtn();
	MyInfo.enterDOB();
	MyInfo.entername();
	}
	
	
}
