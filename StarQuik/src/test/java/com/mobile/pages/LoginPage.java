package com.mobile.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Login Screen
 * 
 * @author Ankit Jain.
 *
 */
public class LoginPage extends BasePage {
	
	
	/**
	 * Allow permissions button.
	 */
	@FindBy(id="com.android.packageinstaller:id/permission_allow_button")
	private MobileElement allowPermissions;
	
	//-----------------------------------------	-------------------------------------------------------------------------
	
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
	
	@FindBy(id="com.starquik:id/cl_wallet_balance")
	private MobileElement wallet;
	
	@FindBy(id="com.starquik:id/amount")
	private MobileElement walletAmount;
	
	@FindBy(id="com.starquik:id/btn_nav_smart_basket")
	private MobileElement SmartBasket;
	
	@FindBy(id="com.starquik:id/ib_toolbar_cart")
	private MobileElement SmartBasketCart;
	
//	@FindBy(id="com.starquik:id/iv_home_search")
//	private MobileElement search;
	
	@FindBy(id="com.starquik:id/et_search_home")
	private MobileElement search;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")
	private MobileElement FirstAddButton;
	
	@FindBy(id="com.starquik:id/action_cart")
	private MobileElement CartButton;
	
/*	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.view.View[5]/android.view.View")
	private MobileElement logout;*/
	@FindBy(id="com.starquik:id/tv_cart_checkout")
	private MobileElement CheckoutButton;
	
	@FindBy(id="com.starquik:id/address_no")
	private MobileElement Address;
	
	@FindBy(id="com.starquik:id/edit_landmark")
	private MobileElement Landmark;
	
	@FindBy(id="com.starquik:id/action_done")
	private MobileElement savebutton;
	
	@FindBy(id="com.starquik:id/btn_delivery_payment")
	private MobileElement ProceedToPayment;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]/android.widget.TextView")
	private MobileElement WalletOption;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]/android.widget.TextView")
	private MobileElement CardOption;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[3]")
	private MobileElement NetbankingOption;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[4]")
	private MobileElement POD;
	@FindBy(id="com.starquik:id/btn_payment_submit")
	private MobileElement PaymentSubmit;
	
	@FindBy(id="com.starquik:id/iv_close_rate")
	private MobileElement CloseRating;
	
	@FindBy(id="com.starquik:id/btn_nav_my_orders")
	private MobileElement myOrders;
	
	@FindBy(id="com.starquik:id/address_no")
	private MobileElement houseNo;
	
	@FindBy(id="com.starquik:id/edit_landmark")
	private MobileElement landmark;
	
	@FindBy(id="com.starquik:id/edit_pin_code")
	private MobileElement PinCode;
	
	@FindBy(id="com.starquik:id/action_done")
	private MobileElement saveaddress;
	
	@FindBy(id="com.starquik:id/tv_nav_name_item")
	private MobileElement MyProfile;
	
	@FindBy(id="com.starquik:id/tv_nav_help_header")
	private MobileElement MyInfo;
	
	@FindBy(id="com.starquik:id/tv_add_a_new_address")
	private MobileElement AddNewAddressMyInfo;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.support.v7.widget.LinearLayoutCompat/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView[2]")
	private MobileElement DeleteAddress;
	
	@FindBy(id="com.starquik:id/btn_sq_dialog_positive")
	private MobileElement ConfirmDeleteAddress;
	
	@FindBy(id="com.starquik:id/et_search")
	private MobileElement isearch;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView")
	private MobileElement isearchResult;
	
	/**
	 * Constructor of the class.
	 * @param driver
	 */
	public LoginPage(AppiumDriver<WebElement> driver) {
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
	public void doLogin(String p_user_id, String p_password, String Loc, String hno, String landmark, String PIN) throws InterruptedException {
		
		
		Thread.sleep(10000);
		Tap(ManualLocation, "Manual Location button");
		Smallwait();
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
		Enterkeys(userId,"user name",p_user_id);
		Smallwait();
		Enterkeys(password,"password",p_password);
		Smallwait();
		Tap(loginButton, "login button");
		Smallwait();
		Tap(wallet, "Wallet option");
		Smallwait();
		if(walletAmount.isDisplayed())
		{
		Report("Wallet is working", "PASS");
		} 
		else 
		{ 
		Report("User is not redirected to Wallet details", "FAIL");
		}
		takeScreenShot("Customer Wallet");
		Smallwait();
		clickBackButton();
		Smallwait();
		Tap(SmartBasket, "Smartbasket option");
		Smallwait();
		takeScreenShot("Smart Basket");
		//Assert.assertEquals(SmartBasketText.getText(), "Smart Basket")
		boolean sb=SmartBasketCart.isDisplayed();
		System.out.println(sb+">>>>>>>>>>>>>>>>>>>>>");
		if(SmartBasketCart.isDisplayed())
		{
		Report("Smart Basket is working fine", "PASS");
		} 
		else 
		{ 
		Report("User is not redirected to Smart Basket", "FAIL");
		}
		Smallwait();
		clickBackButton();
		Smallwait();
		Tap(MyProfile, "My Profile option");
		Smallwait();
		Tap(MyInfo, "My info option");			
		Smallwait();
		if (!driver.findElements(By.id("com.starquik:id/tv_add_a_new_address")).isEmpty())
		{
			Report("No address saved for this customer", "PASS");
			Smallwait();
			Tap(AddNewAddressMyInfo, "Add New Address button");
			Smallwait();
			Enterkeys(houseNo, "House Number", hno);
			Smallwait();
			Enterkeys(Landmark, "Landmark", landmark);
			Smallwait();
			if (PinCode.getText().isEmpty()) {
				Enterkeys(PinCode, "Pincode", PIN);
				scrollScreenDown();
			}
			else {
				scrollScreenDown();
			}
			Smallwait();
			Tap(saveaddress, "Save Address button");
			Smallwait();
	    }	
		else 
		{
			Report("Address is Available", "PASS");
			Tap(DeleteAddress, "Delete Address button");
			Smallwait();
			Tap(ConfirmDeleteAddress, "Confirm Delete option");
			Smallwait();
			
		}
		}
	
public void doSearch(String S_data, String loc) throws InterruptedException {
		
		
//		Thread.sleep(10000);
//		Tap(ManualLocation, "Manual Location button");
//		Smallwait();
//		Tap(EnterLocation, "Enter location textbox");
//		Smallwait();
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
