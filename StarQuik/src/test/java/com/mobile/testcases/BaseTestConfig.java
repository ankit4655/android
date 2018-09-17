package com.mobile.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;


/**
 * Base class for All Test Cases. All the test cases to extend this base class.
 * 
 * @author Ankit Jain.
 *
 */
public abstract class BaseTestConfig{
	
	public static ExtentReports extent;
	public static ExtentTest logger;
  
	
	//------------------------------------------------------------------------------------------------------------------
	/**
	 * Variable to store the test class name.
	 */
	public final String testName= this.getClass().getSimpleName();
	/**
	 * Instance of {@link WebDriver}
	 */
	protected static AppiumDriver<WebElement> driver;
	
	/**
	 * Instance of {@link AppiumDriverLocalService}
	 */
	private AppiumDriverLocalService appiumService;
	/**
	 * Variable to store appium service url.
	 */
	private String appiumServiceUrl;
	//------------------------------------------------------------------------------------------------------------------
	/**
	 * Method to be called before start of the test suite. This method will launch the appium server installed on the 
	 * machine. This method will load the device capabilites configuration and launch the device using appium.
	 */
	@BeforeSuite
	public void doBeforeSuite() {
		
		appiumService = AppiumDriverLocalService.buildDefaultService();
		appiumService.start();
		appiumServiceUrl = appiumService.getUrl().toString();
		extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/StarQuik_Extent_Report.html", true);
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("device_capabilities.properties"));
			
			Map<String, String> prop_map = new HashMap<String, String>();
			for (String key : prop.stringPropertyNames()) {
			    prop_map.put(key, prop.getProperty(key));
			}			
			DesiredCapabilities capabilities = new DesiredCapabilities(prop_map);
			driver = new AndroidDriver<WebElement>(new URL(appiumServiceUrl), capabilities);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//------------------------------------------------------------------------------------------------------------------
	/**
	 * Method to be called before the test starts. All the extending class to implement this method as per the test case requirements.
	 */
	/*@BeforeTest
	public void startReport(){
		//ExtentReports(String filePath,Boolean replaceExisting) 
		//filepath - path of the file, in .htm or .html format - path where your report needs to generate. 
		//replaceExisting - Setting to overwrite (TRUE) the existing file or append to it
		//True (default): the file will be replaced with brand new markup, and all existing data will be lost. Use this option to create a brand new report
		//False: existing data will remain, new tests will be appended to the existing report. If the the supplied path does not exist, a new file will be created.
		//extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/Panasonic_Extent_Report.html", false);
		//extent.addSystemInfo("Environment","Environment Name")
		extent
                .addSystemInfo("Host Name", "Starquik")
                .addSystemInfo("Environment", "Automation Testing")
                .addSystemInfo("User Name", "Starquik");
                //loading the external xml file (i.e., extent-config.xml) which was placed under the base directory
                //You could find the xml file below. Create xml file in your project and copy past the code mentioned below
                extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
	}*/
	//------------------------------------------------------------------------------------------------------------------
		/**
		 * Method to be called after every test class to reset the app.
		 */
	
	/*@AfterMethod
	public void getResult(ITestResult result){
		
		if(result.getStatus() == ITestResult.FAILURE){
			logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
			logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
		}else if(result.getStatus() == ITestResult.SKIP){
			logger.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
		}
		// ending test
		//endTest(logger) : It ends the current test and prepares to create HTML report
		extent.endTest(logger);
	}*/
	
	@AfterClass
    public void doAfterClass() {
        driver.resetApp();
        
    }
	//------------------------------------------------------------------------------------------------------------------
	/**
	 * Method to be called after test suite execution to close the web driver and close the appium service.
	 */
	@AfterSuite
	public void doAfterSuite() {
		driver.quit();
		appiumService.stop();
		//extent.flush();
        //extent.close();
	}
	//------------------------------------------------------------------------------------------------------------------
}
