package red_bus_using_excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBusWriteInExcel {

	public static void main(String[] args) throws IOException, Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Alekya_Drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("---disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		FileInputStream input=new FileInputStream("C:\\Users\\QAPLANET3\\Desktop\\WriteExcel - Copy (2).xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(input);
		XSSFSheet sh=wb.getSheet("Sheet1");
		driver.get(sh.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		
		FileOutputStream output=new FileOutputStream("C:\\Users\\QAPLANET3\\Desktop\\WriteExcel - Copy (2).xlsx");
		Row r1=sh.createRow(1);
		r1.createCell(0).setCellValue("FROM locations list");
		r1.createCell(1).setCellValue("TO locations list");
		driver.findElement(By.id("src")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		WebElement ui=driver.findElement(By.className("autoFill"));
		List<WebElement> li=ui.findElements(By.tagName("li"));
		Iterator<WebElement> itr=li.iterator();
		
		int i=2;
		while(itr.hasNext()){
			WebElement liI=itr.next();
			sh.createRow(i).createCell(0).setCellValue(liI.getText());
			System.out.println(liI.getText());
			i++;
		}
		wb.write(output);
		
		/*driver.findElement(By.id("dest")).sendKeys(sh.getRow(0).getCell(2).getStringCellValue());
		Thread.sleep(1000);
		WebElement ui1=driver.findElement(By.className("autoFill"));
		List<WebElement> li1=ui1.findElements(By.tagName("li"));
		Iterator<WebElement> itr1=li1.iterator();
		
		int j=2;
		while(itr1.hasNext()){
			WebElement liI1=itr1.next();
			sh.createRow(j).createCell(1).setCellValue(liI1.getText());
			j++;
		}
		wb.write(output);
		*/
		
		
		
		
	}

}
