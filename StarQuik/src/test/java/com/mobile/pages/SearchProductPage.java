package com.mobile.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
//import junit.framework.Assert;
//
//import org.apache.http.cookie.SM;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//
//import com.relevantcodes.extentreports.LogStatus;
//import com.thoughtworks.selenium.webdriven.commands.IsElementPresent;


/**
 * Search Screen
 * 
 * @author Ankit Jain.
 *
 */
public class SearchProductPage extends BasePage {
	
	
	/**
	 * Allow permissions button.
	 */
	@FindBy(id="com.android.packageinstaller:id/permission_allow_button")
	private MobileElement allowPermissions;
	
	//------------------------------------------------------------------------------------------------------------------
	/**
	 * Auto Detect Location
	 */
	@FindBy(id="com.starquik:id/tv_new_user_detect")
	private MobileElement autoDetect;
	/**
	 * Set Location Manually
	 */
	@FindBy(id="com.starquik:id/tv_new_user_manual_select")
	private MobileElement ManualLocation;
	
	@FindBy(id="com.starquik:id/et_location_address")
	private MobileElement EnterLocation;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView")
	private MobileElement SelectLocation;
	
	
	@FindBy(id="com.starquik:id/tv_ls_confirm")
	private MobileElement ConfirmLocation;
	/**
	 * User id input text field.
	 */
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton")
	private MobileElement Slider;
	/**
	 * Password input text field.
	 */
	
	@FindBy(id="com.starquik:id/et_search_home")
	private MobileElement search;
	
	@FindBy(id="com.starquik:id/et_search")
	private MobileElement isearch;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView")
	private MobileElement isearchResult;
	
	/**
	 * Constructor of the class.
	 * @param driver
	 */
	public SearchProductPage(AppiumDriver<WebElement> driver) {
		super(driver);
	}
	
	
	public void startTest(String testcaseName)
	{
		logger = extent.startTest(testcaseName);
	}

	/**
	 * Method to Perform Product Search.
	 * @throws InterruptedException 
	 */
	public void doSearch(String S_data, String loc) throws InterruptedException {
		
		
		Thread.sleep(10000);
		Tap(ManualLocation, "Manual Location button");
		Smallwait();
		Tap(EnterLocation, "Enter location textbox");
		Smallwait();
		Enterkeys(EnterLocation, "Location entered", loc);
		Smallwait();
		Tap(SelectLocation, "Andheri Selected");
		Smallwait();
		Tap(ConfirmLocation, "Location Confirmed");
		Smallwait();
		Tap(search, "Search text box");
		Smallwait();
		Enterkeys(isearch, "Search text box i.e. "+ S_data, S_data);
		Smallwait();
		Tap(isearchResult, "Search results listing");
		Smallwait();
		if(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]")).isDisplayed())	
		{
		Report(S_data +" Located", "PASS");
		} 
		else 
		{ 
		Report("Search String not found", "FAIL");
		}
		takeScreenShot("Search Results");
		Smallwait();
		
	}
	
	public void endTest()
	{
		extent.endTest(logger);
		extent.flush();
	}
	
}
