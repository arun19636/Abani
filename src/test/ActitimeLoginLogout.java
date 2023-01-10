package test;

import java.io.IOException;
import org.testng.annotations.Test;
import generics.BaseTest;
import pom.ActitimeHomePage;
import pom.ActitimeLoginPage;

public class ActitimeLoginLogout extends BaseTest
{
	@Test
	public void loginlogout() throws InterruptedException, IOException
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();
		
		ActitimeHomePage homePage=new ActitimeHomePage(driver);
		homePage.savechangesMethod();
		
		
		
		//ActitimeHomePage homePage=new ActitimeHomePage(driver);
		//homePage.logoutMethod();
	}
}