package properties;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class addemployee {

	public static void main(String[] args) throws Exception {
		Properties obj=new Properties();
		obj.load(new FileInputStream("C:\\alekhya\\data_driven using properties\\src\\properties\\addemployee.properties"));
		
		System.setProperty("webdriver.chrome.driver","C:\\Alekya_Drivers\\chromedriver.exe");
		WebDriver x=new ChromeDriver();
		x.manage().window().maximize();
		
		x.get(obj.getProperty("url"));
		x.findElement(By.name("txtUserName")).sendKeys(obj.getProperty("username"));
		x.findElement(By.name("txtPassword")).sendKeys(obj.getProperty("password"));
		x.findElement(By.name("Submit")).click();
		
		for(int i=1;i<=3;i++)
		{
		
		
		Actions act=new Actions(x);
		act.moveToElement(x.findElement(By.linkText("PIM"))).perform();
		act.moveToElement(x.findElement(By.linkText("Add Employee"))).click().perform();
		x.switchTo().frame("rightMenu");
		Thread.sleep(2000);
		x.findElement(By.name("txtEmpLastName")).sendKeys(obj.getProperty("lastname"+i));
		Thread.sleep(2000);
		x.findElement(By.name("txtEmpFirstName")).sendKeys(obj.getProperty("firstname"+i));
		Thread.sleep(2000);
		x.findElement(By.xpath("//input[@value='Save']")).click();
		Thread.sleep(2000);
		
		x.switchTo().defaultContent();
		}
		
	
	}
	
	
	

}
