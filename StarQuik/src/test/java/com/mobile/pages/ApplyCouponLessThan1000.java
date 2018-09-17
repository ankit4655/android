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
public class ApplyCouponLessThan1000 extends BasePage {
	
	
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
	
	@FindBy(id="com.starquik:id/action_done")
	private MobileElement saveaddress;
	
	@FindBy(id="com.starquik:id/tv_cart_sub_total")
	private MobileElement CartSubtotal;
	
	@FindBy(id="com.starquik:id/iv_promo_arrow")
	private MobileElement PromoArrow;
	
	@FindBy(id="com.starquik:id/et_promo")
	private MobileElement EditPromo;
	
	@FindBy(id="com.starquik:id/btn_promo_apply")
	private MobileElement ApplyPromoButton;
	
	@FindBy(id="com.starquik:id/tv_promo_fail")
	private MobileElement PromoResponseText;
	
	@FindBy(id="com.starquik:id/tv_cart_cashback")
	private MobileElement CashbackText;
	
	@FindBy(id="com.starquik:id/add")
	private MobileElement IncreaseQty;
	
	@FindBy(id="com.starquik:id/tv_promo_remove")
	private MobileElement RemoveCoupon;
	/**
	 * Constructor of the class.
	 * @param driver
	 */
	public ApplyCouponLessThan1000(AppiumDriver<WebElement> driver) {
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
	public void doApplyCoupon(String p_user_id, String p_password, String S_text, String loc, 
			String address, String land, String code1, String code2, String code3, String code4) throws InterruptedException {
		
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
		scrollScreenDown();
		Tap(FirstAddButton, "Add Product Button");
		Smallwait();
		Tap(CartButton, "Cart Button");
		WebDriverWait wait = new WebDriverWait(driver,200);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.starquik:id/tv_cart_view_details_label")));
		takeScreenShot("Cart");
		Smallwait();
		/**
		 * Apply Coupon 
		 */
		String subt=CartSubtotal.getText();
 		String d=drawDigitsFromString(subt);
 		int e = Integer.parseInt(d);
 		int f=e/100;
 		int C=0;
		
			for (int i = 0; i < 4; i++) {
	  			C = C+1;
		      switch(C) {
		         case 1 :
		        	 System.out.println("Inside case star5>>>>>>>>>>>>>>>>>>>>>>");
		        	 if (f<999)
		        	 {
		    			Tap(PromoArrow, "Apply coupon section");
		    			Smallwait();
		    			Enterkeys(EditPromo, "Coupon code Field : " + code1, code1);
		    			Smallwait();
		    			Tap(ApplyPromoButton, "Apply Promo Button");
		    			Smallwait();
		    			if (driver.findElements(By.id("com.starquik:id/tv_promo_fail")).isEmpty()) 
		    			{
		    				Report("Coupon Applied on below Rs. 1000 Cart", "FAIL");				
		    			}
		    			else
		    			{
		    				String CouponResponse=PromoResponseText.getText();
		    				Report("Application response on applying coupon below Rs. 1000 Cart: "+CouponResponse, "PASS");
		    				Tap(PromoArrow, "Back to Cart");
		    			}
		    		}
		    		else 
		    		{
		    			Tap(PromoArrow, "Apply coupon section");
		    			Smallwait();
		    			Enterkeys(EditPromo, "Coupon code Field : " + code1, code1);
		    			Smallwait();
		    			Tap(ApplyPromoButton, "Apply Promo Button");
		    			Smallwait();
		    			if (!driver.findElements(By.id("com.starquik:id/tv_promo_fail")).isEmpty()) 
		    			{
		    				Report("Coupon not working", "FAIL");	
		    				Tap(PromoArrow, "Coupon Section");
			    			Smallwait();
		    			}
		    			else
		    			{
		    				Report("Coupon is working fine", "PASS");
		    				Smallwait();
			    			String Cashback =CashbackText.getText();
			    			String g=drawDigitsFromString(Cashback);
			    			if (g.length()>2) 
			    			{
			    				int h = Integer.parseInt(g);
			    				h=h/100;
			    				int ExpectedCashback=((f*5)/100);
			    				if (ExpectedCashback==h) 
			    				{
			    					Report("Cashback is fine", "PASS");
								}
			    				else 
			    				{
			    					Report("Incorrect Cashback", "FAIL");							
								}
							}
			    			else
			    			{
			    				int h = Integer.parseInt(g);
			    				int ExpectedCashback=((f*5)/100);
			    				if (ExpectedCashback==h)
			    					{
			    					Report("Cashback is fine", "PASS");
			    					}
				    				else 
				    				{
				    				Report("Incorrect Cashback", "FAIL");							
									}
			    				
			    			
		    			}
			    			Tap(PromoArrow, "Coupon Section");
			    			Smallwait();
			    			Tap(RemoveCoupon, "Remove Coupon option");
			    			Smallwait();
			    			}
		    			
		    			}
		    		
		            System.out.println("STAR5"); 
		            break;
		         case 2 :
		        	 	System.out.println("Inside case STARNEW>>>>>>>>>>>>>>>>>>>>>>");
			     		if (f<999) 
			    		{
			    			Tap(PromoArrow, "Apply coupon section");
			    			Smallwait();
			    			Enterkeys(EditPromo, "Coupon code Field : " + code2, code2);
			    			Smallwait();
			    			Tap(ApplyPromoButton, "Apply Promo Button");
			    			Smallwait();
			    			if (driver.findElements(By.id("com.starquik:id/tv_promo_fail")).isEmpty()) 
			    			{
			    				Report("Coupon Applied on below Rs. 1000 Cart", "FAIL");				
			    			}
			    			else
			    			{
			    				String CouponResponse=PromoResponseText.getText();
			    				Report("Application response on applying coupon below Rs. 1000 Cart: "+CouponResponse, "PASS");
			    				Tap(PromoArrow, "Back to Cart");
			    			}
			    		}
			    		else 
			    		{
			    			Tap(PromoArrow, "Apply coupon section");
			    			Smallwait();
			    			Enterkeys(EditPromo, "Coupon code Field : " + code2, code2);
			    			Smallwait();
			    			Tap(ApplyPromoButton, "Apply Promo Button");
			    			Smallwait();
			    			if (!driver.findElements(By.id("com.starquik:id/tv_promo_fail")).isEmpty()) 
			    			{
			    				String CouponResponse=PromoResponseText.getText();
			    				Report("Coupon not working, App Response: " + CouponResponse, "FAIL");
			    				Tap(PromoArrow, "Coupon Section");
				    			Smallwait();
			    			}
			    			else
			    			{
			    				Report("Coupon is working fine", "PASS");
			    				Smallwait();
				    			String Cashback =CashbackText.getText();
				    			String g=drawDigitsFromString(Cashback);
				    			if (g.length()>3) 
				    			{
				    				int h = Integer.parseInt(g);
				    				h=h/100;
				    				int ExpectedCashback=((f*5)/100);
				    				if (ExpectedCashback==h) 
				    				{
				    					Report("Cashback is fine", "PASS");
									}
				    				else 
				    				{
				    					Report("Incorrect Cashback", "FAIL");							
									}
								}
				    			else
				    			{
				    					int h = Integer.parseInt(g);
				    					int ExpectedCashback=((f*5)/100);
					    				if (ExpectedCashback==h) 
					    				{
					    					Report("Cashback is fine", "PASS");
										}
					    				else 
					    				{
					    					Report("Incorrect Cashback", "FAIL");							
										}		    					
								}
			    			
			    			Tap(PromoArrow, "Coupon Section");
			    			Smallwait();
			    			Tap(RemoveCoupon, "Remove Coupon option");
			    			Smallwait();   			
			    			
			    		}
			    			}
		            System.out.println("STARNEW");
		            break;
		         case 3 :
		            System.out.println("Inside case STAR100>>>>>>>>>>>>>>>>>>>>>>");
		     		if (f<999) 
		    		{
		    			Tap(PromoArrow, "Apply coupon section");
		    			Smallwait();
		    			Enterkeys(EditPromo, "Coupon code Field : " + code3, code3);
		    			Smallwait();
		    			Tap(ApplyPromoButton, "Apply Promo Button");
		    			Smallwait();
		    			if (driver.findElements(By.id("com.starquik:id/tv_promo_fail")).isEmpty()) 
		    			{
		    				Report("Coupon Applied on below Rs. 1000 Cart", "FAIL");				
		    			}
		    			else
		    			{
		    				String CouponResponse=PromoResponseText.getText();
		    				Report("Application response on applying coupon below Rs. 1000 Cart: "+CouponResponse, "PASS");
		    				Tap(PromoArrow, "Back to Cart");
		    			}
		    		}
		    		else 
		    		{
		    			Tap(PromoArrow, "Apply coupon section");
		    			Smallwait();
		    			Enterkeys(EditPromo, "Coupon code Field : " + code3, code3);
		    			Smallwait();
		    			Tap(ApplyPromoButton, "Apply Promo Button");
		    			Smallwait();
		    			if (!driver.findElements(By.id("com.starquik:id/tv_promo_fail")).isEmpty()) 
		    			{
		    				String CouponResponse=PromoResponseText.getText();
		    				Report("Coupon not working, App Response: " + CouponResponse, "FAIL");				
		    				Tap(PromoArrow, "Coupon Section");
			    			Smallwait();
		    			}
		    			else
		    			{
		    				Report("Coupon is working fine", "PASS");
			    			Smallwait();
			    			String Cashback =CashbackText.getText();
			    			String g=drawDigitsFromString(Cashback);
			    				int h = Integer.parseInt(g);
			    				h=h/100;
			    				if (h==100) 
			    				{
			    					Report("Cashback is fine", "PASS");
								}
			    				else 
			    				{
			    					Report("Incorrect Cashback", "FAIL");							
								}   
		    			
		    			Tap(PromoArrow, "Coupon Section");
		    			Smallwait();
		    			Tap(RemoveCoupon, "Remove Coupon option");
		    			Smallwait();
		    		}
		    			}
		            break;
		         case 4 :
		            System.out.println("Inside case STAR250>>>>>>>>>>>>>>>>>>>>>>");
		     		if (f<2499) 
		    		{
		    			Tap(PromoArrow, "Apply coupon section");
		    			Smallwait();
		    			Enterkeys(EditPromo, "Coupon code Field : " + code4, code4);
		    			Smallwait();
		    			Tap(ApplyPromoButton, "Apply Promo Button");
		    			Smallwait();
		    			if (driver.findElements(By.id("com.starquik:id/tv_promo_fail")).isEmpty()) 
		    			{
		    				Report("Coupon Applied on below Rs. 2499 Cart", "FAIL");				
		    			}
		    			else
		    			{
		    				String CouponResponse=PromoResponseText.getText();
		    				Report("Application response on applying coupon below Rs. 2499 Cart: "+CouponResponse, "PASS");
		    				Tap(PromoArrow, "Back to Cart");
		    			}
		    		}
		    		else 
		    		{
		    			Tap(PromoArrow, "Apply coupon section");
		    			Smallwait();
		    			Enterkeys(EditPromo, "Coupon code Field : " + code4, code4);
		    			Smallwait();
		    			Tap(ApplyPromoButton, "Apply Promo Button");
		    			Smallwait();
		    			if (!driver.findElements(By.id("com.starquik:id/tv_promo_fail")).isEmpty()) 
		    			{
		    				String CouponResponse=PromoResponseText.getText();
		    				Report("Coupon not working, App Response: " + CouponResponse, "FAIL");
		    				Tap(PromoArrow, "Coupon Section");
			    			Smallwait();
		    			}
		    			else
		    			{
		    				Report("Coupon is working fine", "PASS");
			    			Smallwait();
			    			String Cashback =CashbackText.getText();
			    			String g=drawDigitsFromString(Cashback);
			    			int h = Integer.parseInt(g);
			    			h=h/100;
			    			if (h==250) 
			    				{
			    					Report("Cashback is fine", "PASS");
								}
			    			else 
			    				{
			    					Report("Incorrect Cashback", "FAIL");							
								}   			
		    		
		    			Tap(PromoArrow, "Coupon Section");
		    			Smallwait();
		    			Tap(RemoveCoupon, "Remove Coupon option");
		    			Smallwait();
		    			}
		    		}
		            break;
		         default :
		            Report("Invalid Coupon", "PASS");
		      }
	        }			
			
		
		/*Smallwait();
	    Tap(CheckoutButton, "Checkout Button");
		Smallwait();
		if (!driver.findElements(By.id("com.starquik:id/address_no")).isEmpty()) {
			Enterkeys(houseNo, "House number", address);
			Enterkeys(Landmark, "Landmark", land);
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
		*/
		
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
