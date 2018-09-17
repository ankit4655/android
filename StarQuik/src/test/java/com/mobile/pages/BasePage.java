package com.mobile.pages;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.mobile.testdata.DataDrivenExcel;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL; 
import org.json.JSONObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * Base class for the test case screens. All the pages to extend this base class.
 * 
 * @author Ankit Jain.
 *
 */


public class BasePage {
	@SuppressWarnings("all")
	public static ExtentReports extent =extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/StarQuik_MobileAutomation_Report.html", true);
	public static ExtentTest logger;
	
	public static DataDrivenExcel excel = new DataDrivenExcel(System.getProperty("user.dir")+"\\TestData\\StarQuik.xls", "MetaData");
	
	/**
	 * Variable of type {@link AppiumDriver}
	 */
	protected AppiumDriver<WebElement> driver;

	/**
	 * Constructor for the class.
	 * 
	 * @param driver
	 */
	public BasePage(AppiumDriver<WebElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	}
	//------------------------------------------------------------------------------------------------------------------
	/**
	 * Method to take screenshots.
	 * 
	 * @param testName
	 */
	
	public void takeScreenShot(String testName) {
		
		 String destDir;
		 DateFormat dateFormat;
		 
		  // Set folder name to store screenshots.
		  destDir = "screenshots";
		  // Capture screenshot.
		  File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  // Set date format to set It as screenshot file name.
		  dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		  // Create folder under project with name "screenshots" provided to destDir.
		  new File(destDir).mkdirs();
		  // Set file name using current date time.
		  String destFile = dateFormat.format(new Date()) + ".jpg";
		  try {
			  // Copy paste file at destination folder location
			  FileUtils.copyFile(scrFile, new File(destDir + "/" + testName + "/" + destFile));
		   } catch (IOException e) {
			  e.printStackTrace();
		  }
	}
	
	
	// scrollScreenDown function is used for scrolling down the mobile screen. top to bottom till end
	
	public  void scrollScreenDown()
	{
		try
		{
			org.openqa.selenium.Dimension dimensions = driver.manage().window().getSize();
			Double screenHeightStart = dimensions.getHeight() * 0.5;
			int scrollStart = screenHeightStart.intValue();
			Double screenHeightEnd = dimensions.getHeight() * 0.2;
			int scrollEnd = screenHeightEnd.intValue();
			new TouchAction(driver).press(0, scrollStart).waitAction(2000).moveTo(0, scrollEnd).release().perform();
			Report("Scrolling down screen", "info");
		}
		catch(Exception e)
		{
			Report("scrolling down screen is fail due to " + e.getMessage(), "Fail");
		}
		}
	
	
	//scrollScreenUp function is used for scrolling up the screen from bottom to up till top.
	
	public  void scrollScreenUp()
	{
		try
		{
		org.openqa.selenium.Dimension dimensions = driver.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getHeight() * 0.2;
		int scrollEnd = screenHeightEnd.intValue();
		new TouchAction(driver).press(0, scrollEnd).waitAction(2000).moveTo(0, scrollStart).release().perform();
		Report("Scrolling up the mobile screen ", "Info");
		}
		catch(Exception e)
		{
			Report("Scrolling up screen is fail due to "+e.getMessage(), "Fail");
		}
	}
	
	// Smallwait method is used for waiting purpose only 5 second wait.
	public void Smallwait() throws InterruptedException
	{
		Thread.sleep(5000);
	}
	public void Longwait() throws InterruptedException
	{
		Thread.sleep(30000L);
	}
	
	
	public boolean isElementPresent(String str)
	{
		return driver.findElements(By.id(str)).size()!=0;
	}
	
	public void Tap(MobileElement m , String StepDesc)
	{
		try
		{
			m.click();
			Report("Tap done on "+StepDesc+" successfully","Pass");
		}
		catch(Exception e)
		{
			Report("Tap action is fail due to "+e.getMessage(),"Fail");
		}
	}
	
	public void Enterkeys(MobileElement m,String StepDesc, String data)
	{
		try
		{
			m.sendKeys(data);
			Report("Data entered successfully in "+StepDesc,"Pass");
		}
		catch(Exception e)
		{
			Report("Enter data Fail due to "+e.getMessage(),"Fail");
		}
	}
	
	public void Report(String Desc , String Status)
	{
		if(Status.equalsIgnoreCase("Pass"))
		{
			logger.log(LogStatus.PASS, Desc);
		}
		else if(Status.equalsIgnoreCase("Fail"))
		{
			logger.log(LogStatus.FAIL, Desc);
		}
		else
			logger.log(LogStatus.INFO, Desc);
	}
	@SuppressWarnings("rawtypes")
	public void clickBackButton(){
	    ((AndroidDriver)driver).pressKeyCode(AndroidKeyCode.BACK);
	}
	
	public String drawDigitsFromString(String strValue){
		String str = strValue.trim();
        String digits="";
        for (int i = 0; i < str.length(); i++) {
            char chrs = str.charAt(i);              
            if (Character.isDigit(chrs))
                digits = digits+chrs;
        }
        return digits;
    }
	
	public int drawDigitsFromString2(String strValue){
		String str = strValue.trim();
        String digits="";
        for (int i = 0; i < str.length(); i++) {
            char chrs = str.charAt(i);              
            if (Character.isDigit(chrs))
                digits = digits+chrs;
        }
        int e = Integer.parseInt(digits);
 		int f=e/100;
        return f;
    }
	
	
	
	
	public static void apiRead() throws Exception {
	     String url = "http://api.starquik.com/api/featureswitch";
	     URL obj = new URL(url);
	     HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	     // optional default is GET
	     con.setRequestMethod("GET");
	     //add request header
	     con.setRequestProperty("User-Agent", "Mozilla/5.0");
	     int responseCode = con.getResponseCode();
	     System.out.println("\nSending 'GET' request to URL : " + url);
	     System.out.println("Response Code : " + responseCode);
	     BufferedReader in = new BufferedReader(
	             new InputStreamReader(con.getInputStream()));
	     String inputLine;
	     StringBuffer response = new StringBuffer();
	     while ((inputLine = in.readLine()) != null) {
	     	response.append(inputLine);
	     }
	     in.close();
	     //print in String
	     System.out.println(response.toString());
	     //Read JSON response and print
	     JSONObject myResponse = new JSONObject(response.toString());
	     System.out.println("result after Reading JSON Response");
	     System.out.println("is_clubcard_active- "+myResponse.getString("is_clubcard_active"));
	     System.out.println("invite_and_earn- "+myResponse.getString("invite_and_earn"));
	     System.out.println("location_more_detail- "+myResponse.getString("location_more_detail"));
	     System.out.println("userid- "+myResponse.getString("userid"));
	     System.out.println("flag- "+myResponse.getString("flag"));
	   }
	
/*	public static void captureLog(AppiumDriver driver, String testName)
		    throws Exception {
		    DateFormat df = new SimpleDateFormat("dd_MM_yyyy_HH-mm-ss");
		    Date today = Calendar.getInstance().getTime();
		    String reportDate = df.format(today);
		    String logPath = "C:\\automation_capture\\";
		    log.info(driver.getSessionId() + ": Saving device log...");
		    List<LogEntry> logEntries = driver.manage().logs().get("logcat").filter(Level.ALL);
		    File logFile = new File(logPath + reportDate + "_" + testName + ".txt");
		    PrintWriter log_file_writer = new PrintWriter(logFile);
		    log_file_writer.println(logEntries );
		    log_file_writer.flush();
		    log.info(driver.getSessionId() + ": Saving device log - Done.");
		    }
		}*/
	
	}
