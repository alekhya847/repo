package lib;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;


public class Businessfunctions {
WebDriver brow;
WebDriverWait wait;
WebElement objun;
WebElement objpwd;
//driver configuration

	public void configDriver(String Browser) {
		if(Browser.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Alekya_Drivers\\chromedriver.exe");
			brow=new ChromeDriver(); 
		}
		else
			
	{
			System.out.println("invalid driver");
		}
		wait=new WebDriverWait(brow,30);
		brow.manage().window().maximize();
	}
	//close browser
	public void closebrowser()
	{
		brow.close();
	}
	//quit object
	public void quitobject()
	{
		brow.quit();
	}
	//open application
	public void openapp(String url){
		brow.get(url);
		wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
		//verify homepage
		if(brow.getTitle().equals("OrangeHRM - New Level of HR Management")){
			System.out.println("homepage displayed");
		}
		//create object for un,pwd
		objun=brow.findElement(By.name("txtUserName"));
		objpwd=brow.findElement(By.xpath("//input[@name='txtPassword']"));
		assertTrue(objun.isDisplayed()&&objpwd.isDisplayed());
		Reporter.log("un,pwd are exists");
	}
	//login to application
		public void LoginToOrangeHRM(String un,String pwd){
		{
			objun.sendKeys(un);
			objpwd.sendKeys(pwd);
			//click on login
			brow.findElement(By.name("Submit")).click();
			wait.until(ExpectedConditions.titleIs("OrangeHRM"));
			//verify homepage
			if(brow.getTitle().equals("OrangeHRM")){
				System.out.println("OrangeHRM page displayed");
			}
		}
		}
		//logout app
		public void LogoutFromapp() 
		{
			//click on logout
			brow.findElement(By.linkText("Logout")).click();
			wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
			//verify homepage
			if(brow.getTitle().equals("OrangeHRM - New Level of HR Management")){
				System.out.println("signoff successfull and homepage displayed");
			}
		}
			//add employee
			public void addemployee() throws Exception
			{
				Actions Act=new Actions(brow);
				Act.moveToElement(brow.findElement(By.linkText("PIM"))).perform();
				brow.findElement(By.linkText("Add Employee")).click();
				Thread.sleep(2000);
				brow.switchTo().frame("rightMenu");
				Thread.sleep(2000);
				String EmpId=brow.findElement(By.xpath("//input[@name='txtEmployeeId']")).getAttribute("value");
				wait.until(ExpectedConditions.elementToBeClickable(brow.findElement(By.id("txtEmpLastName")))).sendKeys("alekhya");
				Thread.sleep(2000);
				wait.until(ExpectedConditions.elementToBeClickable(brow.findElement(By.xpath("//input[@name='txtEmpFirstName']")))).sendKeys("lucky");
				Thread.sleep(2000);
				wait.until(ExpectedConditions.elementToBeClickable(brow.findElement(By.xpath("//input[@id='btnEdit']")))).click();
				Thread.sleep(2000);
				wait.until(ExpectedConditions.elementToBeClickable(brow.findElement(By.xpath("//input[@value='Back']")))).click();
				//brow.switchTo().parentFrame();
				Thread.sleep(2000);
				wait.until(ExpectedConditions.elementToBeClickable(brow.findElement(By.id("loc_code")))).click();
				Thread.sleep(2000);
				new Select(brow.findElement(By.id("loc_code"))).selectByVisibleText("Emp. ID");
				wait.until(ExpectedConditions.elementToBeClickable(brow.findElement(By.xpath("//input[@type='text']")))).sendKeys(EmpId);
				wait.until(ExpectedConditions.elementToBeClickable(brow.findElement(By.xpath("//input[@value='Search']")))).click();
				
				brow.findElement(By.xpath("//tbody/tr/td[2]")).getAttribute(EmpId);
				
				
				
				
				
				}
}	