package testscripts;

import org.testng.annotations.Test;

import lib.Businessfunctions;


public class Tc1 {
@Test
	public void verifyorangehrm() {
		Businessfunctions br=new Businessfunctions();	
		br.configDriver("Chrome");
		br.openapp("http://apps.qaplanet.in/hrm");
		br.LoginToOrangeHRM("qaplanet1","lab1");
		br.LogoutFromapp();
		br.closebrowser();
		br.quitobject();
	}
}