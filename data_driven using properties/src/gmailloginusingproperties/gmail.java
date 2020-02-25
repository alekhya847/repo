package gmailloginusingproperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmail {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		
		Properties obj=new Properties();
		obj.load(new FileInputStream("C:\\alekhya\\data_driven using properties\\src\\gmailloginusingproperties\\gmail.properties"));

		System.setProperty("webdriver.chrome.driver","C:\\Alekya_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 60);

		driver.get(obj.getProperty("url"));

		driver.findElement(By.id("identifierId")).sendKeys(obj.getProperty("username"));
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("password"))).sendKeys(obj.getProperty("password"));
		driver.findElement(By.xpath("//span[text()='Next']")).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Compose']"))).click();
		System.out.println("compose clicked");

		wait.until(ExpectedConditions.elementToBeClickable(By.name("to"))).sendKeys(obj.getProperty("sendmail"));
		driver.findElement(By.name("subjectbox")).sendKeys(obj.getProperty("subject"));
		Thread.sleep(5000);
		driver.findElement(By.id(":l8")).sendKeys(obj.getProperty("automail"));
		Thread.sleep(5000);
		driver.findElement(By.id(":jt")).click();


		}




		



	
				
				
				
				
				
				
				

			}

		


	


