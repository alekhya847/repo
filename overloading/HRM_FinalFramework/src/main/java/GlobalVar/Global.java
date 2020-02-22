package GlobalVar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Global 
{
	//Global objects
	public WebDriver driver;
	public Actions action;
	//-------Locators-------------------------------
	public By objUN=By.id("txtUserName");
	public By objPWD=By.id("txtPassword");
	
	//---------------TestData----------------------------------
	public static String sBrowserName="Chrome";
	public static String sURL="http://apps.qaplanet.in/hrm";
	public static String sUsername="qaplanet1";
	public static String sPassword="lab1";
	
}
