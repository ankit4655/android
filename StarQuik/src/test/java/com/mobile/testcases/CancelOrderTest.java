package com.mobile.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mobile.pages.LoginPage;
import com.mobile.pages.CancelOrderPage;
import com.mobile.testdata.TestDataProvider;



/**
 * Test class for Login.
 * 
 * @author Ankit Jain.
 *
 */
public class CancelOrderTest extends BaseTestConfig {
	
	/**
	 * Variable of type {@link LoginPage}
	 */
	private CancelOrderPage CancelOrderPage;
	//------------------------------------------------------------------------------------------------------------------
	@BeforeTest
	public void doBeforeTest() {
		CancelOrderPage = new CancelOrderPage(driver);		
	}
	//------------------------------------------------------------------------------------------------------------------
	@Test(dataProvider="CancelTestData", dataProviderClass=TestDataProvider.class)
	public void testLogin(String p_user_id, String p_password, String Loc) throws InterruptedException {
		Thread.sleep(10000L);
		CancelOrderPage.startTest("CancelOrderTest");
		CancelOrderPage.doCancel(p_user_id, p_password, Loc);
		//takeScreenShot("")
		//logger.log(LogStatus.PASS, "Test Case Passed is testLogin");
		
	}
	//------------------------------------------------------------------------------------------------------------------
	@AfterTest
	public void doAfterTest() {	
		
		CancelOrderPage.endTest();
       // extent.close();
	}
	//------------------------------------------------------------------------------------------------------------------

}
