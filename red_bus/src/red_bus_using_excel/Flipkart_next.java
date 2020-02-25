package red_bus_using_excel;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart_next {
  static WebDriver driver;

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Alekya_Drivers\\chrome80\\chromedriver.exe");
   driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().deleteAllCookies();
   WebDriverWait wait = new WebDriverWait(driver,30);
   //-----------------------------------------------------------------------------------
   
   //-----------------------------------------------------------------------------------
   driver.get("https://www.flipkart.com/");
   driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
   Actions act=new Actions(driver);
   act.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).perform();
   Thread.sleep(2000);
   act.moveToElement(driver.findElement(By.linkText("Vivo"))).click().perform();
   Thread.sleep(2000);    
   driver.findElement(By.xpath("//div[text()='Price -- High to Low']")).click();
   Thread.sleep(3000);
 //-----------------------------------------------------------------------------------
   mobiles();
      }
 
public static void mobiles() throws InterruptedException {
    WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
   
    for(int i=0;i<=7;i++){
    System.out.println("==================page no================================"+(i+1));
    Thread.sleep(1000);
    List<WebElement> mobiles=driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div/div/div/div/a/div[2]/div[1]/div[1]"));
    Iterator<WebElement> it=mobiles.iterator();
    Thread.sleep(1000);
       while(it.hasNext()) {
       
        WebElement mob=it.next();
        System.out.println(mob.getText());}
       Thread.sleep(1000);
       if(next.isDisplayed())
       { Thread.sleep(3000);
        next.click();
       }
       else
       {Thread.sleep(5000);
        System.out.println("vivo mobiles completed");
         }
           }
}
}

