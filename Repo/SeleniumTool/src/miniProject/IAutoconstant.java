package miniProject;

public interface IAutoconstant 
{
	String CHROM_KEY="webdriver.chrome.driver";
	String CHROM_VALUE="./driver/chromedriver.exe";
	
	String GECKO_KEY="webdriver.gecko.driver";
	String GECKO_VALUE="./driver/geckodriver.exe";
	
	String URL="http://localhost/login.do";
	
	String XL_DATA_PATH="./data/input.xlsx";
	String SheetV = "ValidLogin";
	String SheetIN = "InvalidLogin";
	String SheetETT = "EnterTimeTrack";
	String SheetLP = "Licensces";
	
	long ITO=10;
	long ETO=10;
	

}
