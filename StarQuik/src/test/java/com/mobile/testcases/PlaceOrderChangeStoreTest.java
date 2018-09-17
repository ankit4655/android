package com.mobile.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mobile.pages.LoginPage;
import com.mobile.pages.PlaceOrderChangeStore;
import com.mobile.testdata.TestDataProvider;



/**
 * Test class for Login.
 * 
 * @author Ankit Jain.
 *
 */
public class PlaceOrderChangeStoreTest extends BaseTestConfig {
	
	/**
	 * Variable of type {@link LoginPage}
	 */
	//private LoginPage page;
	private PlaceOrderChangeStore PlaceOrderChangeStore;
	//------------------------------------------------------------------------------------------------------------------
	@BeforeTest
	public void doBeforeTest() {
		//page = new LoginPage(driver);
		PlaceOrderChangeStore = new PlaceOrderChangeStore(driver);
	}

	//------------------------------------------------------------------------------------------------------------------
	@Test(dataProvider="placeOrderChangeStoreTestData", dataProviderClass=TestDataProvider.class)
	public void StoreTest(String p_user_id, String p_password, String S_text, String loc, 
			String address, String land, String Store, String PIN) throws InterruptedException {
		PlaceOrderChangeStore.startTest("Place Order Change Store Test");
		PlaceOrderChangeStore.doPlaceOrderChangeStore(p_user_id, p_password, S_text, loc, address, land, Store, PIN);
	}
	//------------------------------------------------------------------------------------------------------
	@AfterTest
	public void doAfterTest() {	
		
		PlaceOrderChangeStore.endTest();
       // extent.close();
	}
	//------------------------------------------------------------------------------------------------------------------

}
