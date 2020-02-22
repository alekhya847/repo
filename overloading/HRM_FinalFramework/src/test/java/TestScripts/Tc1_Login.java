package TestScripts;
import org.testng.annotations.Test;
import BusinessFunctions.Login;
public class Tc1_Login extends RootTest 
{

	@Test
	public static void verifyOrangeHRM() throws Exception
	{
		Login objlogin=new Login(brow,objProperties,strlocPath);
		//---------------------------------------------------------
		brow.startBrowserFirefox();
		brow.maximiseBrowser();
		//verify title
		brow.verifyTitle("OrangeHRM - New Level of HR Management");
		objlogin.loginToapp("qaplanet1","lab1");
		brow.waitForPageToLoad();
		
		objlogin.logout();
		brow.closeBrowser();
		brow.QuitObject();
	}
}
