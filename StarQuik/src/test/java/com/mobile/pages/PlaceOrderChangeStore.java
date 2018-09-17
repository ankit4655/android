package com.mobile.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
//import sun.util.resources.cldr.zh.LocaleNames_zh_Hans_SG;
//
//import org.apache.http.cookie.SM;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//
//import com.relevantcodes.extentreports.LogStatus;


/**
 * Login Screen
 * 
 * @author Ankit Jain.
 *
 */
public class PlaceOrderChangeStore extends BasePage {
	
	
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
	
	@FindBy(id="com.starquik:id/tv_sign_in_action")
	private MobileElement directSignin;
	
//	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView[1]")
//	private MobileElement Slider;
		
	
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
	
	@FindBy(id="com.starquik:id/iv_home_search")
	private MobileElement search;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")
	private MobileElement FirstAddButton;
	
	@FindBy(id="com.starquik:id/location")
	private MobileElement location;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.support.v7.widget.LinearLayoutCompat/android.widget.RelativeLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.TextView")
	private MobileElement locationValue;
	
	@FindBy(id="com.starquik:id/btn_sq_dialog_positive")
	private MobileElement updatelocation;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")
	private MobileElement SecondAddButton;
	
	@FindBy(id="com.starquik:id/action_cart")
	private MobileElement CartButton;
	
//	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView[3]")
//	private MobileElement CartButton;
	
	@FindBy(id="com.starquik:id/tv_toolbar_location")
	private MobileElement locationToolbar;
	
	@FindBy(id="com.starquik:id/et_location_address")
	private MobileElement EnterStorelocation;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView")
	private MobileElement SelectStore;
	
	@FindBy(id="com.starquik:id/tv_location_store_id_update")
	private MobileElement StoreUpdateConfirm;
	
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
	/**
	 * Constructor of the class.
	 * @param driver
	 */
	public PlaceOrderChangeStore(AppiumDriver<WebElement> driver) {
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
	public void doPlaceOrderChangeStore(String p_user_id, String p_password, String S_text, String loc, 
			String address, String land, String Store, String PIN) throws InterruptedException {
		
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
		Tap(Slider,"Menu Slider");
		Smallwait();
		Tap(Logon,"User Login");
		Smallwait();
		/*Tap(allowPermissions, "first allow button");
		Smallwait();*/
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
		Smallwait();
		if (!driver.findElements(By.id("com.starquik:id/cl_wallet_balance")).isEmpty())
		{
			clickBackButton();
			takeScreenShot("Home Page");
			}
			else
			{
				Longwait();
				clickBackButton();
				takeScreenShot("Home Page");
			
			}
		Smallwait();
		scrollScreenDown();
		Smallwait();
		Tap(FirstAddButton, "Add Product Button");
		Smallwait();
		Tap(locationToolbar, "Location selection toolbar");
		Smallwait();
		Tap(EnterStorelocation, "Store location textbox");
		Smallwait();
		Enterkeys(EnterStorelocation, "Store address", Store);
		Smallwait();
		Tap(SelectStore, "One of the listed address");
		Smallwait();
		Tap(ConfirmLocation, "Confirm Selected location");
		Smallwait();
		Tap(StoreUpdateConfirm, "Update store button");
		WebDriverWait wait = new WebDriverWait(driver,200);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.starquik:id/tv_cart_view_details_label")));
		takeScreenShot("Cart");
		Tap(CheckoutButton, "Checkout Button");
		Smallwait();
		if (!driver.findElements(By.id("com.starquik:id/address_no")).isEmpty()) {
			Enterkeys(houseNo, "House number", address);
			Enterkeys(Landmark, "Landmark", land);
			Enterkeys(PinCode, "Pincode", PIN);
			scrollScreenDown();
			Tap(saveaddress, "Save Address");
			WebDriverWait wait1 = new WebDriverWait(driver,200);
			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.starquik:id/btn_delivery_payment")));
			Tap(ProceedToPayment, "Proceed To Payment button");
		}
		else {
			WebDriverWait wait1 = new WebDriverWait(driver,200);
			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.starquik:id/btn_delivery_payment")));
			Tap(ProceedToPayment, "Proceed To Payment button");
		}	
		Longwait();
		Tap(WalletOption, "Wallet option");
		Smallwait();
		Tap(CardOption, "Card Option");
		Smallwait();
		Tap(NetbankingOption, "Netbanking");
		Smallwait();
		Tap(POD, "POD");
		Smallwait();
		Tap(PaymentSubmit, "Place order");
		WebDriverWait wait2 = new WebDriverWait(driver,200);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.starquik:id/iv_close_rate")));
		Tap(CloseRating, "Close rating pop up");
		Smallwait();
		takeScreenShot("Order Placed Successfully");
		
		
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
