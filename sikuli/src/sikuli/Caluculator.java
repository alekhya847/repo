package sikuli;

import org.sikuli.script.App;
import org.sikuli.script.Screen;

public class Caluculator {

	public static void main(String[] args) throws Exception {
		App.open("Calc.exe");
		Screen x=new Screen();
		x.click("C:\\Users\\QAPLANET3\\Desktop\\sikuli.sikuli\\1579761408252.png");
		x.click("C:\\Users\\QAPLANET3\\Desktop\\sikuli.sikuli\\1579761426091.png");
		x.click("C:\\Users\\QAPLANET3\\Desktop\\sikuli.sikuli\\1579761439467.png");
		x.click("C:\\Users\\QAPLANET3\\Desktop\\sikuli.sikuli\\1579761447242.png");
		x.click("C:\\Users\\QAPLANET3\\Desktop\\sikuli.sikuli\\1579761456346.png");
//x.click("C:\\Users\\QAPLANET3\\Desktop\\sikuli.sikuli\\equal.png");
Thread.sleep(2000);
App.close("Calc.exe");
	}

}
