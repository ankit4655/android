package com.mobile.testdata;

import java.util.ArrayList;

import org.testng.annotations.DataProvider;
import com.mobile.testdata.DataDrivenExcel;


/**
 * This class to act as data provider for the test cases.
 * 
 * @author Ankit Jain.
 *
 */
public class TestDataProvider {
	
	public static String filepath = System.getProperty("user.dir")+"\\TestData\\StarQuik.xls";

	//------------------------------------------------------------------------------------------------------------------
	/**
	 * This method to generate test data for Login test case. It will return an array of array, where the array consists of
	 * three fields, first the user id, second user password, and third the post login message value to be validated.
	 * @return
	 */
	
	// Data provider for login test case
	
	@DataProvider(name="loginTestData")
	public static Object[][] loginData()throws Exception{
		
		DataDrivenExcel userData = new DataDrivenExcel(filepath, "Login");
			 
			  ArrayList<Object> dataList = new ArrayList<Object>();
			 
			  int i = 1;// excluding header row
			  int totalRows = userData.getRowCount("Login");
			  int totalColumn = userData.getColumnCount("Login");
			  int totaldataCol = totalColumn-1; 
			  while (i < totalRows) {			 
			   Object[] dataLine = new Object[totaldataCol];
			   for(int j=1; j<=totaldataCol; j++){
				   dataLine[j-1] = userData.getCell(i, j);
			   }
			   
			   dataList.add(dataLine);			 
			   i++;
			  }
			  Object[][] data = new Object[dataList.size()][];
			  for (i = 0; i < dataList.size(); i++)
			   data[i] = (Object[]) dataList.get(i);
			  return data;
		};
		
		@DataProvider(name="SignUpTestData")
		public static Object[][] SignUpTestData()throws Exception{
			
			DataDrivenExcel userData = new DataDrivenExcel(filepath, "SignUp");
				 
				  ArrayList<Object> dataList = new ArrayList<Object>();
				 
				  int i = 1;// excluding header row
				  int totalRows = userData.getRowCount("SignUp");
				  int totalColumn = userData.getColumnCount("SignUp");
				  int totaldataCol = totalColumn-1; 
				  while (i < totalRows) {			 
				   Object[] dataLine = new Object[totaldataCol];
				   for(int j=1; j<=totaldataCol; j++){
					   dataLine[j-1] = userData.getCell(i, j);
				   }
				   
				   dataList.add(dataLine);			 
				   i++;
				  }
				  Object[][] data = new Object[dataList.size()][];
				  for (i = 0; i < dataList.size(); i++)
				   data[i] = (Object[]) dataList.get(i);
				  return data;
			};
			
			
			@DataProvider(name="placeOrderTestData")
			public static Object[][] placeOrderTestData()throws Exception{
				
				DataDrivenExcel userData = new DataDrivenExcel(filepath, "PlaceOrder");
					 
					  ArrayList<Object> dataList = new ArrayList<Object>();
					 
					  int i = 1;// excluding header row
					  int totalRows = userData.getRowCount("PlaceOrder");
					  int totalColumn = userData.getColumnCount("PlaceOrder");
					  int totaldataCol = totalColumn-1; 
					  while (i < totalRows) {			 
					   Object[] dataLine = new Object[totaldataCol];
					   for(int j=1; j<=totaldataCol; j++){
						   dataLine[j-1] = userData.getCell(i, j);
					   }
					   
					   dataList.add(dataLine);			 
					   i++;
					  }
					  Object[][] data = new Object[dataList.size()][];
					  for (i = 0; i < dataList.size(); i++)
					   data[i] = (Object[]) dataList.get(i);
					  return data;
				};
				
				@DataProvider(name="SearchProductTestData")
				public static Object[][] SearchProductTestData()throws Exception{
					
					DataDrivenExcel userData = new DataDrivenExcel(filepath, "Search");
						 
						  ArrayList<Object> dataList = new ArrayList<Object>();
						 
						  int i = 1;// excluding header row
						  int totalRows = userData.getRowCount("Search");
						  int totalColumn = userData.getColumnCount("Search");
						  int totaldataCol = totalColumn-1; 
						  while (i < totalRows) {			 
						   Object[] dataLine = new Object[totaldataCol];
						   for(int j=1; j<=totaldataCol; j++){
							   dataLine[j-1] = userData.getCell(i, j);
						   }
						   
						   dataList.add(dataLine);			 
						   i++;
						  }
						  Object[][] data = new Object[dataList.size()][];
						  for (i = 0; i < dataList.size(); i++)
						   data[i] = (Object[]) dataList.get(i);
						  return data;
					};
					
					
					
					@DataProvider(name="CancelTestData")
					public static Object[][] CancelTestData()throws Exception{
						
						DataDrivenExcel userData = new DataDrivenExcel(filepath, "CancelOrder");
							 
							  ArrayList<Object> dataList = new ArrayList<Object>();
							 
							  int i = 1;// excluding header row
							  int totalRows = userData.getRowCount("CancelOrder");
							  int totalColumn = userData.getColumnCount("CancelOrder");
							  int totaldataCol = totalColumn-1; 
							  while (i < totalRows) {			 
							   Object[] dataLine = new Object[totaldataCol];
							   for(int j=1; j<=totaldataCol; j++){
								   dataLine[j-1] = userData.getCell(i, j);
							   }
							   
							   dataList.add(dataLine);			 
							   i++;
							  }
							  Object[][] data = new Object[dataList.size()][];
							  for (i = 0; i < dataList.size(); i++)
							   data[i] = (Object[]) dataList.get(i);
							  return data;
						};
						
						@DataProvider(name="placeOrderChangeStoreTestData")
						public static Object[][] placeOrderChangeStoreTestData()throws Exception{
							
							DataDrivenExcel userData = new DataDrivenExcel(filepath, "ChangeStoreTestData");
								 
								  ArrayList<Object> dataList = new ArrayList<Object>();
								 
								  int i = 1;// excluding header row
								  int totalRows = userData.getRowCount("ChangeStoreTestData");
								  int totalColumn = userData.getColumnCount("ChangeStoreTestData");
								  int totaldataCol = totalColumn-1; 
								  while (i < totalRows) {			 
								   Object[] dataLine = new Object[totaldataCol];
								   for(int j=1; j<=totaldataCol; j++){
									   dataLine[j-1] = userData.getCell(i, j);
								   }
								   
								   dataList.add(dataLine);			 
								   i++;
								  }
								  Object[][] data = new Object[dataList.size()][];
								  for (i = 0; i < dataList.size(); i++)
								   data[i] = (Object[]) dataList.get(i);
								  return data;
							};
							
							@DataProvider(name="ApplyCoupon")
							public static Object[][] ApplyCoupondata()throws Exception{
								
								DataDrivenExcel userData = new DataDrivenExcel(filepath, "ApplyCoupon");
									 
									  ArrayList<Object> dataList = new ArrayList<Object>();
									 
									  int i = 1;// excluding header row
									  int totalRows = userData.getRowCount("ApplyCoupon");
									  int totalColumn = userData.getColumnCount("ApplyCoupon");
									  int totaldataCol = totalColumn-1; 
									  while (i < totalRows) {			 
									   Object[] dataLine = new Object[totaldataCol];
									   for(int j=1; j<=totaldataCol; j++){
										   dataLine[j-1] = userData.getCell(i, j);
									   }
									   
									   dataList.add(dataLine);			 
									   i++;
									  }
									  Object[][] data = new Object[dataList.size()][];
									  for (i = 0; i < dataList.size(); i++)
									   data[i] = (Object[]) dataList.get(i);
									  return data;
								};
								
								@DataProvider(name="ApplyCouponM")
								public static Object[][] ApplyCouponMdata()throws Exception{
									
									DataDrivenExcel userData = new DataDrivenExcel(filepath, "ApplyCouponM");
										 
										  ArrayList<Object> dataList = new ArrayList<Object>();
										 
										  int i = 1;// excluding header row
										  int totalRows = userData.getRowCount("ApplyCouponM");
										  int totalColumn = userData.getColumnCount("ApplyCouponM");
										  int totaldataCol = totalColumn-1; 
										  while (i < totalRows) {			 
										   Object[] dataLine = new Object[totaldataCol];
										   for(int j=1; j<=totaldataCol; j++){
											   dataLine[j-1] = userData.getCell(i, j);
										   }
										   
										   dataList.add(dataLine);			 
										   i++;
										  }
										  Object[][] data = new Object[dataList.size()][];
										  for (i = 0; i < dataList.size(); i++)
										   data[i] = (Object[]) dataList.get(i);
										  return data;
									};
								
							
							
}

