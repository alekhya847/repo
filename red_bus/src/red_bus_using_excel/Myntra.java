package red_bus_using_excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myntra {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\alekhya\\chromedriver.exe");
		ChromeOptions capability=new ChromeOptions();
		capability.addArguments("---disable-notifications");
		WebDriver driver=new ChromeDriver(capability);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		
		FileInputStream input=new FileInputStream("C:\\Users\\QAPLANET3\\Documents\\Myntra_excel.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(input);
		XSSFSheet sh=wb.getSheetAt(0);
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(0).getCell(1).getStringCellValue());
		String name=sh.getRow(1).getCell(0).getStringCellValue();
		String mobile_num=""+(long)sh.getRow(1).getCell(1).getNumericCellValue();
		String pin=""+(long)sh.getRow(1).getCell(2).getNumericCellValue();
		String adress=sh.getRow(2).getCell(0).getStringCellValue();
		System.out.println(name);
		System.out.println(mobile_num);
		System.out.println(pin);
		System.out.println(adress);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Profile']"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//a[text()='log in']"))).click().perform();
		driver.findElement(By.name("email")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
		driver.findElement(By.name("password")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(1000);
		
		act.moveToElement(driver.findElement(By.xpath("//a[@data-index='1']"))).build().perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Kurtas & Suits']"))).click().perform();
		Thread.sleep(3000);
		/*driver.findElement(By.xpath("//*[@id='mountRoot']/div/main/div[3]/div[1]/section/div/div[2]/ul/li[2]/label/div")).click();
		driver.findElement(By.xpath("//*[@id='mountRoot']/div/main/div[3]/div[1]/section/div/div[3]/ul/li[3]/label/div")).click();
		driver.findElement(By.xpath("//*[@id='mountRoot']/div/main/div[3]/div[1]/section/div/div[4]/ul/li[3]/label/div")).click();*/
		////*[@id="desktopSearchResults"]/div[2]/section/ul/li[1]/a/div[1]/div/div/div/picture/img
		driver.findElement(By.xpath("//img[@title='Indo Era Women Beige & Pink Yoke Design Kurta with Palazzos & Dupatta']")).click();
		//driver.findElement(By.xpath("//*[@id='desktopSearchResults']/div[2]/section/ul/li[1]/a/div[1]/div/div/div/picture/img")).click();
		
		
		Set<String> ids=driver.getWindowHandles();
		/*for(String id:ids){
			System.out.println(id);
		}*/
		
		Iterator<String> itr=ids.iterator();
		
		String first_id=itr.next();
		String second_id=itr.next();
		
		System.out.println(first_id);
		System.out.println(second_id);
		
		
		driver.switchTo().window(second_id);
		
		driver.findElement(By.xpath("//p[text()='S']")).click();
		
		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		
		driver.findElement(By.xpath("//span[text()='Bag']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Place Order']")).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("name"))).sendKeys(name);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("mobile"))).sendKeys(mobile_num);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("pincode"))).sendKeys(pin);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("streetAddress"))).sendKeys(adress);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("locality"))).sendKeys("Gandhinagar  (Hyderabad)");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("locality-0")))).click();
		Thread.sleep(2000);
		driver.findElement(By.id("addressType-icon-home")).click();
		driver.findElement(By.xpath("//div[text()='SAVE']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("placeOrderButton")).click();
		
		
		
	}

}
