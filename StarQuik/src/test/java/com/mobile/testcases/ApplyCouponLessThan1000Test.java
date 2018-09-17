package com.mobile.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mobile.pages.LoginPage;
import com.mobile.pages.ApplyCouponLessThan1000;
import com.mobile.testdata.TestDataProvider;



/**
 * Test class for Login.
 * 
 * @author Ankit Jain.
 *
 */
public class ApplyCouponLessThan1000Test extends BaseTestConfig {
	
	/**
	 * Variable of type {@link LoginPage}
	 */
	//private LoginPage page;
	private ApplyCouponLessThan1000 ApplyCoupon;
	//------------------------------------------------------------------------------------------------------------------
	@BeforeTest
	public void doBeforeTest() {
		//page = new LoginPage(driver);
		ApplyCoupon = new ApplyCouponLessThan1000(driver);
	}

	//------------------------------------------------------------------------------------------------------------------
	@Test(dataProvider="ApplyCoupon", dataProviderClass=TestDataProvider.class)
	public void ACTest(String p_user_id, String p_password, String S_text, String loc, String address, String land, 
			String code1, String code2, String code3, String code4) throws InterruptedException {
		ApplyCoupon.startTest("Apply Coupon on Less than 1000 Cart Test");
		ApplyCoupon.doApplyCoupon(p_user_id, p_password, S_text, loc, address, land, code1, code2, code3, code4);
	}
	//------------------------------------------------------------------------------------------------------
	@AfterTest
	public void doAfterTest() {	
		
		ApplyCoupon.endTest();
       // extent.close();
	}
	//------------------------------------------------------------------------------------------------------------------

}
