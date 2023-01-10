package generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface AutoConstant 
{
	String chrome_key="webdriver.chrome.driver";
	String chrome_value="./drivers/chromedriver.exe";	

	String edge_key="webdriver.edge.driver";
	String edge_value="./drivers/msedgedriver.exe";

	String gecko_key="webdriver.gecko.driver";
	String gecko_value="./drivers/geckodriver.exe";
	
	String silent_output="webdriver.chrome.silentOutput";
	
	String chromelog_key="webdriver.chrome.logfile";
	String logfile_path="./chromelog/logfile.txt";
	
	String url="https://demo.actitime.com";
	
	String excel_path="./testdata/ActiTIMEData.xlsx";
	
	String sheet_name="logindata";		
}