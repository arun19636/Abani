package generics;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pom.ActitimeHomePage;
import pom.ActitimeLoginPage;

public class BaseTest implements AutoConstant
{
	public WebDriver driver;
	
	@BeforeSuite
	public void executionstart()
	{
		Reporter.log("execution started" , true);
	}
	
	@BeforeClass
	public void setup() throws InterruptedException, IOException
	{
		ChromeOptions options=new ChromeOptions();
		//options.addArguments("headless");
		System.setProperty(silent_output, "true");
		System.setProperty(chromelog_key, logfile_path);
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver(options);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);	
	}
	
	@AfterClass
	public void teardown()
	{
		//driver.quit();
	}
	
	@AfterSuite
	public void executioncomplete()
	{
		Reporter.log("execution completed" , true);
	}
}