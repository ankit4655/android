package com.mobile.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Login Screen
 * 
 * @author Ankit Jain.
 *
 */
public class OrderDetailsVerification extends BasePage {
	
	
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
//	@FindBy(id="com.starquik:id/ib_search_light_cart")
//	private MobileElement CartButton;
//	
//	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView[3]")
//	private MobileElement CartButton;
	
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
	
	@FindBy(id="com.starquik:id/tv_cart_sub_total")
	private MobileElement Cartsubtotal;
	
	@FindBy(id="com.starquik:id/tv_cart_delivery_charges")
	private MobileElement CartDeliveryCharges;
	
	@FindBy(id="com.starquik:id/tv_cart_total_savings")
	private MobileElement CartTotalSavings;
	
	@FindBy(id="com.starquik:id/tv_cart_total")
	private MobileElement Carttotal;
	
	@FindBy(id="com.starquik:id/tv_order_details_status")
	private MobileElement OrderStatusMessage;
	
	@FindBy(id="com.starquik:id/tv_od_placed_on")
	private MobileElement OrderPlacedOn;
	
	@FindBy(id="com.starquik:id/tv_order_payment_type")
	private MobileElement PaymentType;
	
	@FindBy(id="com.starquik:id/quantity")
	private MobileElement OrderNumber;
	
	@FindBy(id="com.starquik:id/tv_od_items_amount")
	private MobileElement TotItemandPrice;
	
	@FindBy(id="com.starquik:id/tv_od_total_order")
	private MobileElement OrderTotal;
	
	@FindBy(id="com.starquik:id/tv_od_shipping_amount")
	private MobileElement OrderDeliveryCharges;
	
	@FindBy(id="com.starquik:id/tv_od_savings")
	private MobileElement OrderTotalSavings;
	
	@FindBy(id="com.starquik:id/tv_order_net_amount")
	private MobileElement NetAmount;
	
	@FindBy(id="com.starquik:id/tv_od_payable_amount")
	private MobileElement PayableAmount;
	
	@FindBy(id="com.starquik:id/tv_od_delivery_date")
	private MobileElement DeliveryDatenTime;
	
	@FindBy(id="com.starquik:id/btn_continue_shopping")
	private MobileElement ContinueShoppingButton;
	
	@FindBy(id="com.starquik:id/btn_nav_my_orders")
	private MobileElement MyOrders;
	
	@FindBy(id="com.starquik:id/tv_order_details_item")
	private MobileElement OrderDetails;
	
	@FindBy(id="com.starquik:id/tv_order_cancel")
	private MobileElement CancelOrder;
	
	@FindBy(id="com.starquik:id/btn_sq_dialog_positive")
	private MobileElement CancelOrderSure;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.TextView")
	private MobileElement AddSearchedItem;
	
	
	/**
	 * Constructor of the class.
	 * @param driver
	 */
	public OrderDetailsVerification(AppiumDriver<WebElement> driver) {
		super(driver);
	}
	
	
	public void startTest(String testcaseName)
	{
		logger = extent.startTest(testcaseName);
	}

	/**
	 * Method to PlaceOrder	
	 * @throws InterruptedException 
	 */
	public void doPlaceOrder(String p_user_id, String p_password, String S_text, String loc, 
			String address, String land, String PIN) throws InterruptedException {
		
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
		Smallwait();
		Tap(AddSearchedItem, "Add Product Button");
		Smallwait();
		Tap(CartButton, "Cart Button");
		WebDriverWait wait = new WebDriverWait(driver,200);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.starquik:id/tv_cart_view_details_label")));
		takeScreenShot("Cart");
		String subt=Cartsubtotal.getText();
 		int ExtractedSubt=drawDigitsFromString2(subt);
 		String deliveryChar =CartDeliveryCharges.getText();
 		Report(deliveryChar+"Delivery Charges", "FAIL");
 		int ExtractedDeliveryChar=drawDigitsFromString2(deliveryChar);
 		if ((ExtractedSubt<500)&&(ExtractedDeliveryChar>0)) 
 		{
			Report("Correct Delivery Charges applied to Cart", "PASS");
		}
 		else 
 			if ((ExtractedSubt>500)&&(deliveryChar=="Free"))  
 			{
 				Report("Correct Delivery Charges applied to Cart", "PASS");
 			}
 			else
 			{
 				Report("Wrong Delivery Charges", "FAIL");
 			}
 		 		
 		
// 		String CartTS=CartTotalSavings.getText();
// 		int ExtractedCartTS=drawDigitsFromString2(CartTS);
// 		String CT=Carttotal.getText();
// 		int ExtractedCT=drawDigitsFromString2(CT);
		String saving=CartTotalSavings.getText();
		Report(saving+"Cart Total Savings", "FAIL");
		//String totalCart=Carttotal.getText();
		Report(Carttotal+"Cart Total", "FAIL");
		Tap(CheckoutButton, "Checkout Button");
		Smallwait();
		if (!driver.findElements(By.id("com.starquik:id/address_no")).isEmpty()) {
			Enterkeys(houseNo, "House number", address);
			Enterkeys(Landmark, "Landmark", land);
			if (PinCode.getText().isEmpty())
			{
				Enterkeys(PinCode, "Pincode", PIN);
				scrollScreenDown();
			}
			else {
				scrollScreenDown();
			}
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
		Tap(ContinueShoppingButton, "Continue Shopping Button");
		Smallwait();
		Tap(Slider, "Menu Slider");
		Smallwait();
		scrollScreenDown();
		Smallwait();
		Tap(MyOrders, "My Orders");
		Smallwait();
		takeScreenShot("Order Status");
		Tap(OrderDetails, "Order Details");
		Smallwait();
		String OrdrStat = OrderStatusMessage.getText();
		System.out.println(OrdrStat+">>>>>>>>>>");
		String PayType =PaymentType.getText();
		System.out.println(PayType+">>>>>>>>>>");
		String TotalitemAndPrice = TotItemandPrice.getText();
		System.out.println(TotalitemAndPrice+">>>>>>>>>>");
		scrollScreenDown();
		Smallwait();
		scrollScreenDown();
		Smallwait();
		String OT=OrderTotal.getText();
		Report(OT +"Order Total", "FAIL");
		int ExtractedOT=drawDigitsFromString2(OT);
		System.out.println(ExtractedOT+">>>>>>>>>>");
		String DC=OrderDeliveryCharges.getText();
		int ExtractedDC=drawDigitsFromString2(DC);
		Report(DC + "Delivery Charges OD", "FAIL");
		String Sav=OrderTotalSavings.getText();
		System.out.println(Sav+">>>>>>>>>>");
		int ExtractedSav=drawDigitsFromString2(Sav);
		System.out.println(ExtractedSav+">>>>>>>>>>");
		String NA=NetAmount.getText();
		Report(NA + "Net Amount", "FAIL");
		String PA=PayableAmount.getText();
		Report(PA + "Payable Amount", "FAIL");
		String DDT=DeliveryDatenTime.getText();
		Report(DDT + "Delivery date and time","FAIL");
		Report(subt + "Subtotal", "FAIL");
		Report(OT + "Order total", "FAIL");
		Report(Sav + "Savings", "FAIL");
		if ((ExtractedOT-ExtractedSav)==ExtractedSubt) {
			Report("Order Total is fine", "PASS");
		}else {
			Report("Calculation Mistake", "Fail");
		}
		if ((ExtractedDeliveryChar==ExtractedDC)&&(ExtractedSubt<500)) {
			Report("Delivery Charges are correct", "PASS");
			
		}else {
			Report("Incorrect Delivery charges", "FAIL");
		}
			
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
