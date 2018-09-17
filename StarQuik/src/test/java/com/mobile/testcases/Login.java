package com.mobile.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mobile.pages.LoginPage;
import com.mobile.testdata.TestDataProvider;



/**
 * Test class for Login.
 * 
 * @author Ankit Jain.
 *
 */
public class Login extends BaseTestConfig {
	
	/**
	 * Variable of type {@link LoginPage}
	 */
	private LoginPage page;
	//------------------------------------------------------------------------------------------------------------------
	@BeforeTest
	public void doBeforeTest() {
		page = new LoginPage(driver);		
	}
	//------------------------------------------------------------------------------------------------------------------
	@Test(priority=1,dataProvider="loginTestData", dataProviderClass=TestDataProvider.class)
	public void testLogin(String userId, String password, String Loc, String hno, String landmark, String PIN) throws InterruptedException {
		Thread.sleep(10000L);
		page.startTest("LoginTest");
		page.doLogin(userId, password, Loc, hno, landmark, PIN);
		//takeScreenShot("")
		//logger.log(LogStatus.PASS, "Test Case Passed is testLogin");
		
	}
	
	@Test(priority=2,dataProvider="SearchProductTestData", dataProviderClass=TestDataProvider.class)
	public void searchTest(String S_data, String loc) throws InterruptedException {
		page.startTest("Search Product Test");
		page.doSearch(S_data, loc);
	}
	//------------------------------------------------------------------------------------------------------------------
	
	@AfterTest
	public void doAfterTest() {	
		page.endTest();
      // extent.close();
	}
	//------------------------------------------------------------------------------------------------------------------

}
