package red_bus_using_excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBus_Excel {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeOptions capability=new ChromeOptions();
		capability.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Alekya_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(capability);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		FileInputStream file=new FileInputStream("C:\\Users\\QAPLANET3\\Desktop\\redbusexcel.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sh=wb.getSheet("sheet1");
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		driver.get(sh.getRow(0).getCell(0).getStringCellValue());
		
		//FileOutputStream output=new FileOutputStream("C:\\Users\\QAPLANET3\\Desktop\\redbusexcel.xlsx");
		
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='src']")))).sendKeys("hyderabad");
		Thread.sleep(1000);
		WebElement ul=driver.findElement(By.className("autoFill"));
		List<WebElement> li=ul.findElements(By.tagName("li"));
		Iterator<WebElement> itr=li.iterator();
		while(itr.hasNext())
		{
			WebElement liI=itr.next();
			String src=liI.getText();
			System.out.println(src);
		}
		System.out.println("**************");
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='dest']")))).sendKeys("vijayawada");
		Thread.sleep(1000);
		WebElement ui1=driver.findElement(By.className("autoFill"));
		List<WebElement> li1=ui1.findElements(By.tagName("li"));
		Iterator<WebElement> itr1=li1.iterator();
		while(itr1.hasNext())
		{
			WebElement liI1=itr1.next();
			String des=liI1.getText();
			System.out.println(des);
		}
		
		
	}

}
