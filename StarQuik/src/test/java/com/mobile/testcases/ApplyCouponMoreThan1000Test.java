package com.mobile.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mobile.pages.LoginPage;
import com.mobile.pages.ApplyCouponMoreThan1000;
import com.mobile.testdata.TestDataProvider;



/**
 * Test class for Login.
 * 
 * @author Ankit Jain.
 *
 */
public class ApplyCouponMoreThan1000Test extends BaseTestConfig {
	
	/**
	 * Variable of type {@link LoginPage}
	 */
	//private LoginPage page;
	private ApplyCouponMoreThan1000 ApplyCouponMoreThan1000;
	//------------------------------------------------------------------------------------------------------------------
	@BeforeTest
	public void doBeforeTest() {
		//page = new LoginPage(driver);
		ApplyCouponMoreThan1000 = new ApplyCouponMoreThan1000(driver);
	}

	//------------------------------------------------------------------------------------------------------------------
	@Test(dataProvider="ApplyCouponM", dataProviderClass=TestDataProvider.class)
	public void ACMTest(String p_user_id, String p_password, String S_text, String loc, String address, String land, 
			String code1, String code2, String code3, String code4, String S_data) throws InterruptedException {
		ApplyCouponMoreThan1000.startTest("Apply Coupon on More than 1000 Cart Test");
		ApplyCouponMoreThan1000.doApplyCoupon(p_user_id, p_password, S_text, loc, address, land, code1, code2, code3, code4, S_data);
	}
	//------------------------------------------------------------------------------------------------------
	@AfterTest
	public void doAfterTest() {	
		
		ApplyCouponMoreThan1000.endTest();
       // extent.close();
	}
	//------------------------------------------------------------------------------------------------------------------

}
