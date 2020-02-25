package red_bus;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartReddy {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Alekya_Drivers\\chrome80\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    WebDriverWait wait = new WebDriverWait(driver,30);
	    
	    XSSFWorkbook wb=new XSSFWorkbook();
	    XSSFSheet sheet=wb.createSheet("Flipkart samsung");
	    int row=0;
	    int col=0;
	    Row r1=sheet.createRow(row);
	    r1.createCell(col).setCellValue("Samsung Mobile");
	    col++;
	    r1.createCell(col).setCellValue("mobile price");
	    
	    driver.get("https://www.flipkart.com/");
	    WebElement x=driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
	    if(x.isDisplayed())
			{
	    	x.click();	
			}
	    System.out.println("clicked sucessfull");
	    Actions act=new Actions(driver);
	    act.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).perform();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Samsung")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("VIEW ALL")).click();
	    Thread.sleep(2000);	    
	    driver.findElement(By.xpath("//div[text()='Price -- High to Low']")).click();
	    
	    /*String pagecount=driver.findElement(By.xpath("//div[@class='_2zg3yZ']/span[1]")).getText();
		String[] pga=pagecount.split(" ");
		int pc=Integer.parseInt(pga[3]);
		System.out.println(pc+" Pages are present");*/
	    
	    String beforexpath_name="//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[";
	    String afterxpath_name="]/div/div/div/a/div[2]/div[1]/div[1]";
	    
	    String beforexpath_price="//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[";
	    String afterxpath_price="]/div/div/div/a/div[2]/div[2]/div[1]/div/div[1]";
	    
	    String beforepage=" //a[text()='";
	    String Afterpage="']";
	    
	    for(int j=2;j<=22;j++) {
	    
	       Thread.sleep(2000); 
	       for(int i=2;i<=25;i++)
	        {	
	    	String actualxpath_name=beforexpath_name+i+afterxpath_name;
	    	String actualxpath_price=beforexpath_price+i+afterxpath_price;
	    	
	    	String mobile_Name=driver.findElement(By.xpath(actualxpath_name)).getText();
	    	String mobile_Price=driver.findElement(By.xpath(actualxpath_price)).getText();
	    	
	    	
			col=0;
			Row r2=sheet.createRow(++row);
			r2.createCell(col).setCellValue(mobile_Name);
			col++;
			r2.createCell(col).setCellValue(mobile_Price);
			
		    FileOutputStream fop=new FileOutputStream("C:\\Users\\QAPLANET3\\Desktop\\Flipkart_reddy.xlsx");
	    	wb.write(fop);
	    	
//	    	System.out.println((j-1)+":page    "+(i-1)+" th item"+"Mobile model name=="+mobile_Name);
//	    	System.out.println("Mobile price=="+mobile_Price);
//	    	System.out.println("=========================================================================================");
	    	}
	        Thread.sleep(1000);
	        String next=beforepage+j+Afterpage;
	    	driver.findElement(By.xpath(next)).click();
	        }
	   }
	}

	       
         