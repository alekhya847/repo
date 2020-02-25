package red_bus_using_excel;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;

public class FlipkartOrder {

	public static void main(String[] args) throws Exception   {
		
		System.setProperty("webdriver.chrome.driver","C:\\Alekya_Drivers\\chrome80\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("7569993109");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("raghuchary");
		
		Screen x=new Screen();
		x.click("C:\\Users\\QAPLANET3\\Desktop\\flipkartlogin.PNG");
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[1]/span"))).build().perform();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("OPPO")).click();
	    Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[3]/div[1]/div/div[1]/div[2]/a")).click();
	   Thread.sleep(1000);
	   act.moveToElement(driver.findElement(By.xpath("//div[text()='Price -- High to Low']"))).click().perform();
	   Thread.sleep(1000);
	   //------------------------------------------------------------
	   WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
	   
	   for(int i=0;i<=2;i++){
		   System.out.println("----page----"+(i+1));
		   Thread.sleep(2000);
		   List<WebElement> li=driver.findElements(By.xpath("//*[@id='container']/div/div[3]/div[2]/div/div[2]/div/div/div/div/a/div[2]/div[1]/div[1]"));
		   Iterator<WebElement> itr=li.iterator(); 
		   Thread.sleep(2000);//*[@id="container"]/div/div[3]/div[2]/div/div[2]/div[3]/div/div/div/a/div[2]/div[1]/div[1]
		   while(itr.hasNext()){
			   WebElement mobiles=itr.next();
			   System.out.println(mobiles.getText());
			   Thread.sleep(2000);
			   if(next.isDisplayed()){
				  Thread.sleep(2000);
				  next.click();
			   }
			   else{
				   Thread.sleep(2000);
				   System.out.println("pages completed");
			   }
			   
			   
		   }
	   }
	   
	   
	   
	   
	}
	    }

	    /* x.click("C:\\Users\\QAPLANET3\\Desktop\\flipkartIphn.PNG");
	    Thread.sleep(1000);
	    
	    FileOutputStream output=new FileOutputStream("C:\\Users\\QAPLANET3\\Desktop\\FlipkartExcel.xlsx");
	    XSSFWorkbook wb=new XSSFWorkbook();
	    XSSFSheet sh=wb.createSheet("alekhya");
	    
	    
	    String before_xpath="//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[";
	    String after_xpath="]/div/div/div/a/div[2]/div[1]/div[1]";
	     int i=2;
	     int j=0;
	     for( i=2;i<=9;i++){
	    WebElement names=driver.findElement(By.xpath(before_xpath+i+after_xpath));
	    sh.createRow(j).createCell(0).setCellValue(names.getText());
	    System.out.println(names.getText());
	    j++;
	     }
	     wb.write(output);
	  */
	    
	    
	    
	    
	    
	


