package miniProject;

import org.testng.annotations.Test;

public class TestLicensces 
{
	public class TestValidLicesnces extends BaseTest
	{
		@Test
		public void testProductEdition() throws InterruptedException
		{
			
			String un = FWutils.read_XL_Data(XL_DATA_PATH,SheetLP,1,0);
			String pw = FWutils.read_XL_Data(XL_DATA_PATH,SheetLP,1,1);
			String eLTitle = FWutils.read_XL_Data(XL_DATA_PATH,SheetLP,1,2);
			String ePEDITION = FWutils.read_XL_Data(XL_DATA_PATH,SheetLP,1,3);
			String eEnterPage = FWutils.read_XL_Data(XL_DATA_PATH,SheetETT,1,2);
			
			LoginPage lp=new LoginPage(driver);
			lp.setUN(un);
			lp.setPW(pw);
			lp.clickOnLoginBTN();
			
			EnterTTrackPage etp=new EnterTTrackPage(driver);
			Thread.sleep(2000);
			FWutils.verifyPage(driver, eEnterPage);
			Thread.sleep(1000);
			etp.clickOnSettings();
			etp.clickOnLicenses();
			
			LicenscesPage lcp=new LicenscesPage(driver);
			Thread.sleep(1000);
			FWutils.verifyPage(driver, eLTitle);
			lcp.verifyProductEdition();
		}
	}
}
