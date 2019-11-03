package miniProject;

import org.testng.annotations.Test;

public class TestInvalidLoginPage extends BaseTest
{
	@Test
	public void invalidTest() throws InterruptedException
	{
		
		int rc = FWutils.XL_RowCount(XL_DATA_PATH,SheetIN);
		System.out.println("RowCount is :" +rc);
		LoginPage lp=new LoginPage(driver);
		
		for(int i=1;i<=rc;i++)
		{
			String un = FWutils.read_XL_Data(XL_DATA_PATH,SheetIN,i,0);
			String pw = FWutils.read_XL_Data(XL_DATA_PATH,SheetIN,i,1);
			lp.setUN(un);
			lp.setPW(pw);
			lp.clickOnLoginBTN();
			Thread.sleep(1000);
			lp.verifyErrMSg();
		}
		
	}

}
