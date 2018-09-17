package com.mobile.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Login Screen
 * 
 * @author Ankit Jain.
 *
 */
public class CancelOrderPage extends BasePage {
	
	
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
	 * Open menu slider
	 */
	@FindBy(id="com.starquik:id/iv_home_navigation")
	private MobileElement Slider;
	
	
	@FindBy(id="com.starquik:id/tv_nav_name_item")
	private MobileElement Logon;
	
	@FindBy(id="com.starquik:id/email")
	private MobileElement userId;
	
	/**
	 * Password input text field.
	 */
	@FindBy(id="com.starquik:id/password")
	private MobileElement password;
	/**
	 * Button to be clicked for login.
	 */
	@FindBy(id="com.starquik:id/action_sign_in")
	private MobileElement loginButton;
	
	@FindBy(id="com.starquik:id/btn_nav_my_orders")
	private MobileElement MyOrders;
	
	@FindBy(id="com.starquik:id/tv_order_details_item")
	private MobileElement OrderDetails;
	
	@FindBy(id="com.starquik:id/tv_order_cancel")
	private MobileElement CancelOrder;
	
	@FindBy(id="com.starquik:id/btn_sq_dialog_positive")
	private MobileElement CancelOrderSure;
	/**
	
	/**
	 * Constructor of the class.
	 * @param driver
	 */
	public CancelOrderPage(AppiumDriver<WebElement> driver) {
		super(driver);
	}
	
	
	public void startTest(String testcaseName)
	{
		logger = extent.startTest(testcaseName);
	}

	/**
	 * Method to do login.
	 * @throws InterruptedException 
	 */
	public void doCancel(String p_user_id, String p_password, String Loc) throws InterruptedException {
		
		
		Thread.sleep(10000);
		Tap(ManualLocation, "Manual Location button");
		Longwait();
		Tap(EnterLocation, "Enter location textbox");
		Smallwait();
		Enterkeys(EnterLocation, "Location entered", Loc);
		Smallwait();
		Tap(SelectLocation, "Andheri Selected");
		Smallwait();
		Tap(ConfirmLocation, "Location Confirmed");
		Smallwait();
		Tap(Slider,"Menu Slider");
		Smallwait();
		Tap(Logon,"User Login");
		Smallwait();
//		Tap(allowPermissions, "first allow button");
//		Smallwait();
		clickBackButton();
		Smallwait();
		Tap(Logon,"User Login");
		Smallwait();
		Tap(userId, "Email");
		Smallwait();
		Enterkeys(userId,"user name",p_user_id);
		Smallwait();
		Enterkeys(password,"password",p_password);
		Smallwait();
		Tap(loginButton, "login button");
		Longwait();
		takeScreenShot("Home Page");
		Smallwait();
		scrollScreenDown();
		Smallwait();
		Tap(MyOrders, "My Orders");
		Smallwait();
		takeScreenShot("Order Status");
		Tap(OrderDetails, "Order Details");
		Smallwait();
		takeScreenShot("Order Status");
		Tap(CancelOrder, "Cancel Order button");
		Smallwait();
		Tap(CancelOrderSure, "Confirm cancel order");
		Smallwait();
		takeScreenShot("Order Status");
		
	}

	public MobileElement getUserId() {
		return userId;
	}
	public MobileElement getPassword() {
		return password;
	}
	public MobileElement getLoginButton() {
		return loginButton;
	}
	
	public void endTest()
	{
		extent.endTest(logger);
		extent.flush();
	}
	
}
