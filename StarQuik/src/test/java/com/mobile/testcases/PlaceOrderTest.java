package com.mobile.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mobile.pages.LoginPage;
import com.mobile.pages.PlaceOrderPage;
import com.mobile.testdata.TestDataProvider;



/**
 * Test class for Login.
 * 
 * @author Ankit Jain.
 *
 */
public class PlaceOrderTest extends BaseTestConfig {
	
	/**
	 * Variable of type {@link LoginPage}
	 */
	//private LoginPage page;
	private PlaceOrderPage PlaceOrderPage;
	//------------------------------------------------------------------------------------------------------------------
	@BeforeTest
	public void doBeforeTest() {
		//page = new LoginPage(driver);
		PlaceOrderPage = new PlaceOrderPage(driver);
	}

	//------------------------------------------------------------------------------------------------------------------
	@Test(dataProvider="placeOrderTestData", dataProviderClass=TestDataProvider.class)
	public void xyzTest(String p_user_id, String p_password, String S_text, String loc, 
			String address, String land, String PIN) throws InterruptedException {
		PlaceOrderPage.startTest("Place Order Test");
		PlaceOrderPage.doPlaceOrder(p_user_id, p_password, S_text, loc, address, land, PIN);
	}
	//------------------------------------------------------------------------------------------------------
	@AfterTest
	public void doAfterTest() {	
		
		PlaceOrderPage.endTest();
       // extent.close();
	}
	//------------------------------------------------------------------------------------------------------------------

}
