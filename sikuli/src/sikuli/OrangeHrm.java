package sikuli;

import org.sikuli.script.App;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class OrangeHrm {

	public static void main(String[] args) throws SikuliException {
		
		App.open("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		Screen x=new Screen();
		x.type("C:\\Alekya_Drivers\\sikuli orangehrm.sikuli\\1580541481842.png","http://apps.qaplanet.in/hrm/login.php");
		x.type(Key.ENTER);
		x.type("C:\\Alekya_Drivers\\sikuli orangehrm.sikuli\\1580541740314.png","qaplanet1");
		x.type("C:\\Alekya_Drivers\\sikuli orangehrm.sikuli\\1580541756271.png","lab1");
		x.click("C:\\Alekya_Drivers\\sikuli orangehrm.sikuli\\1580541765226.png");
		x.hover("C:\\Alekya_Drivers\\sikuli orangehrm.sikuli\\1580542653665.png");
		x.click("C:\\Alekya_Drivers\\sikuli orangehrm.sikuli\\1580542744492.png");
		x.type("C:\\Alekya_Drivers\\sikuli orangehrm.sikuli\\1580542882432.png","alekhya");
		x.type("C:\\Alekya_Drivers\\sikuli orangehrm.sikuli\\1580542899290.png","penchala");
		x.click("C:\\Alekya_Drivers\\sikuli orangehrm.sikuli\\1580543290629.png");
	}

}
