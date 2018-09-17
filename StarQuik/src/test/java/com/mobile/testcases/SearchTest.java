package com.mobile.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mobile.pages.LoginPage;
import com.mobile.pages.SearchProductPage;
import com.mobile.testdata.TestDataProvider;



/**
 * Test class for Login.
 * 
 * @author Ankit Jain.
 *
 */
public class SearchTest extends BaseTestConfig {
	
	/**
	 * Variable of type {@link LoginPage}
	 */
	//private LoginPage page;
	private SearchProductPage SearchProductPage;
	//------------------------------------------------------------------------------------------------------------------
	@BeforeTest
	public void doBeforeTest() {
		//page = new LoginPage(driver);
		SearchProductPage = new SearchProductPage(driver);
	}
//	//------------------------------------------------------------------------------------------------------------------
//	@Test(dataProvider="loginTestData", dataProviderClass=TestDataProvider.class)
//	public void testLogin(String userId, String password) throws InterruptedException {
//		Thread.sleep(10000L);
//		page.startTest("Login Test");
//		page.doLogin(userId, password);
		//takeScreenShot("")
		//logger.log(LogStatus.PASS, "Test Case Passed is testLogin");
		
//	}
	//------------------------------------------------------------------------------------------------------------------
	@Test(dataProvider="SearchProductTestData", dataProviderClass=TestDataProvider.class)
	public void searchTest(String S_data, String loc) throws InterruptedException {
		SearchProductPage.startTest("Search Product Test");
		SearchProductPage.doSearch(S_data, loc);
	}
	//------------------------------------------------------------------------------------------------------
	@AfterTest
	public void doAfterTest() {	
		//List<LogEntry> logEntries = driver.manage().logs().get("logcat").getAll();
		
		
		SearchProductPage.endTest();
       // extent.close();
	}
	//------------------------------------------------------------------------------------------------------------------

}
