package testscripts;



import org.testng.annotations.Test;

import lib.Businessfunctions;
public class Tc2 {
@Test
	public  void addemployee() throws Exception {
		Businessfunctions br=new Businessfunctions();
br.configDriver("Chrome");
br.openapp("http://apps.qaplanet.in/hrm");
br.LoginToOrangeHRM("qaplanet1","lab1");
br.addemployee();
br.LogoutFromapp();
br.closebrowser();
br.quitobject();
	}
}
