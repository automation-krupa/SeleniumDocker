package Tests;

import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
import testBase.TestBase;


@Test
public class UserLoginTests extends TestBase{
	LoginPageObjects loginPage = new LoginPageObjects();
	

	public void ManagerLoginTest() throws Throwable {
		
		loginPage.login("manager@localhost.com", "admin@123");
		Thread.sleep(2000); ////// not required, adding just to see tests are running in parallel


	}
		public void ClientLoginTest() throws Throwable {
		
		loginPage.login("client@localhost.com", "admin@123");
		Thread.sleep(2000); ////// not required, adding just to see tests are running in parallel

	}
	public void DesignerLoginTest() throws Throwable {
		
		loginPage.login("developer@localhost.com", "developer");
		Thread.sleep(2000); ////// not required, adding just to see tests are running in parallel
		assertEqualsString_custom("ExpectedTest", "ActualText", "LoginPageHomePage");

	}

}
