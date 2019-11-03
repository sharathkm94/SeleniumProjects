package miniProject;

import org.testng.annotations.Test;

public class TestValidLoginPage extends BaseTest
{
	@Test
	public void validTest() throws InterruptedException 	
	{
		String un = FWutils.read_XL_Data(XL_DATA_PATH,SheetV,1,0);
		String pw = FWutils.read_XL_Data(XL_DATA_PATH,SheetV,1,1);
		LoginPage lp=new LoginPage(driver);
		lp.setUN(un);
		lp.setPW(pw);
		lp.clickOnLoginBTN();
		
	}
}
