package com.mobile.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mobile.pages.SignUpPage;
import com.mobile.pages.LoginPage;
import com.mobile.testdata.TestDataProvider;
/**
 * Test class for Login.
 * 
 * @author Ankit Jain.
 *
 */
public class SignUpTest extends BaseTestConfig {
	/**
	 * Variable of type {@link LoginPage}
	 */
	
	//private LoginPage loginPage;
	private SignUpPage signUpPage;
	
	//------------------------------------------------------------------------------------------------------------------
	@BeforeTest
	public void doBeforeTest() throws InterruptedException {
		//loginPage = new LoginPage(driver);
		signUpPage = new SignUpPage(driver);
	}	
	
//	@Test(dataProvider="loginTestData", dataProviderClass=TestDataProvider.class)
//	public void abctestLogin(String userId, String password, String messg) throws InterruptedException {
//		Thread.sleep(10000L);
//		
//		
//	}
	//------------------------------------------------------------------------------------------------------------------
	@Test(dataProvider="SignUpTestData", dataProviderClass=TestDataProvider.class)
	public void xyzSignUpTest(String F_Name, String M_Name, String L_Name, String email, String mob) throws InterruptedException {
		signUpPage.startTest("SignUpTest");
		signUpPage.doSignup( F_Name,  M_Name, L_Name, email, mob);
	}
	//------------------------------------------------------------------------------------------------------------------
	@AfterTest
	public void doAfterTest() {
		signUpPage.endTest();
	extent.close();
	}
	//------------------------------------------------------------------------------------------------------------------

}
