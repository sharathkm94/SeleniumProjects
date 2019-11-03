package miniProject;

import org.testng.annotations.Test;

public class TestEnterTimeTrackPage extends BaseTest
{
	public class TestValidEnterTimeTrack extends BaseTest
	{
		
		@Test
		public void testEnetrTimeTrack() throws InterruptedException
		{
			String un = FWutils.read_XL_Data(XL_DATA_PATH,SheetETT,1,0);
			String pw = FWutils.read_XL_Data(XL_DATA_PATH,SheetETT,1,1);
			String eTitle = FWutils.read_XL_Data(XL_DATA_PATH,SheetETT,1,2);
			
			LoginPage lp = new LoginPage(driver);
			lp.setUN(un);
			Thread.sleep(2000);
			lp.setPW(pw);
			Thread.sleep(2000);
			lp.clickOnLoginBTN();
			
			EnterTTrackPage etp = new EnterTTrackPage(driver);
			Thread.sleep(2000);
			FWutils.verifyPage(driver, eTitle);
			Thread.sleep(2000);
			etp.clickOnSettings();
			Thread.sleep(2000);
			etp.clickOnLicenses();
			
		}

	}


}
