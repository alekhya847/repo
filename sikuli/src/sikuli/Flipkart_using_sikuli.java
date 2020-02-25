package sikuli;

import org.sikuli.script.Key;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class Flipkart_using_sikuli {

	public static void main(String[] args) throws SikuliException, InterruptedException {

	
		Screen x=new Screen();
		//browser launching
		x.click("C:\\Alekya_Drivers\\sikuli programs.sikuli\\1580537713218.png");
		//entering url
		x.type("C:\\Alekya_Drivers\\sikuli programs.sikuli\\1580537857954.png","https://www.flipkart.com/");
		//enter button
		x.type(Key.ENTER);
		Thread.sleep(1000);
		//maximize browser
		x.click("C:\\Alekya_Drivers\\sikuli programs.sikuli\\1580537990742.png");
		Thread.sleep(1000);
		//mouse action to electronics
		x.hover("C:\\Alekya_Drivers\\sikuli programs.sikuli\\1580536989934.png");
		Thread.sleep(1000);
		//login
		x.click("C:\\Alekya_Drivers\\sikuli programs.sikuli\\1580537229635.png");
		Thread.sleep(1000);
		//enter un pwd login
		x.type("C:\\Alekya_Drivers\\sikuli programs.sikuli\\1580537308288.png","7569993109");
		x.type("C:\\Alekya_Drivers\\sikuli programs.sikuli\\1580537323269.png","raghuchary");
		x.click("C:\\Alekya_Drivers\\sikuli programs.sikuli\\1580537335380.png");
		x.hover("C:\\Alekya_Drivers\\sikuli programs.sikuli\\1580538202140.png");
		x.click("C:\\Alekya_Drivers\\sikuli programs.sikuli\\1580539026474.png");
	
	}

}
