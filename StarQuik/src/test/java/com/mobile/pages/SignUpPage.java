package com.mobile.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * 
 * @author Ankit Jain
 *
 */
public class SignUpPage extends BasePage {
     
	//------------------------------------------------------------------------------------------------------------------
	@FindBy(id="com.android.packageinstaller:id/permission_allow_button")
	private MobileElement allowPermissions;
	

	
	/**
	 * Constructor of the class.
	 * @param driver
	 */
	public SignUpPage(AppiumDriver<WebElement> driver) {
		super(driver);
	}
	
	
	public void startTest(String testcaseName)
	{
		logger = extent.startTest(testcaseName);
	}
	//------------------------------------------------------------------------------------------------------------------
	/**
	 * Method to do login.
	 * @throws InterruptedException 
	 */
	public void doSignup(String F_Name, String M_Name, String L_Name, String email, String mob) throws InterruptedException{
		Tap(allowPermissions, "first allow button");
		Smallwait();
		
		
		
	}
	public void endTest()
	{
		extent.endTest(logger);
		extent.flush();
	}
	//------------------------------------------------------------------------------------------------------------------
}
