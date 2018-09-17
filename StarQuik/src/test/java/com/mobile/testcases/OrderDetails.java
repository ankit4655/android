package com.mobile.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mobile.pages.LoginPage;
import com.mobile.pages.OrderDetailsVerification;
import com.mobile.testdata.TestDataProvider;



/**
 * Test class for Login.
 * 
 * @author Ankit Jain.
 *
 */
public class OrderDetails extends BaseTestConfig {
	
	/**
	 * Variable of type {@link LoginPage}
	 */
	//private LoginPage page;
	private OrderDetailsVerification OrderDetailsVerification;
	//------------------------------------------------------------------------------------------------------------------
	@BeforeTest
	public void doBeforeTest() {
		//page = new LoginPage(driver);
		OrderDetailsVerification = new OrderDetailsVerification(driver);
	}

	//------------------------------------------------------------------------------------------------------------------
	@Test(dataProvider="placeOrderTestData", dataProviderClass=TestDataProvider.class)
	public void ODVerification(String p_user_id, String p_password, String S_text, String loc, 
			String address, String land, String PIN) throws InterruptedException {
		OrderDetailsVerification.startTest("Order Details Verification");
		OrderDetailsVerification.doPlaceOrder(p_user_id, p_password, S_text, loc, address, land, PIN);
	}
	//------------------------------------------------------------------------------------------------------
	@AfterTest
	public void doAfterTest() {	
		
		OrderDetailsVerification.endTest();
       // extent.close();
	}
	//------------------------------------------------------------------------------------------------------------------

}
