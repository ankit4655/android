package com.mobile.testdata;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
/**
 * This class allows us the use of an Excel spreadsheet to provide input data to a test or set of tests.
 * 
 * @author Ankit Jain.
 * 
 */
 
public class DataDrivenExcel {
 
 private Workbook wb;
 private Sheet ws;
 private Row row;
 private String fileName  = System.getProperty("user.dir")+"\\TestData\\StarQuik.xls";
 /**
  * Opens a excel sheet
  * 
  * @param fileName
  *            name of the file where you want data
  * @param sheetName
  *            name of the sheet in the excel file
  */
 public DataDrivenExcel(String fileName, String sheetName) {
  try {
   if (fileName.indexOf("xlsx") < 0) { //for .xls format
    wb = new HSSFWorkbook(new FileInputStream(new File(fileName)));
    ws = wb.getSheet(sheetName);
   } else { //for .xlsx format
    wb = new XSSFWorkbook(fileName);
    ws = (XSSFSheet) wb.getSheet(sheetName);
   }
  } catch (IOException io) {
   System.err.println("Invalid file '" + fileName + "' or incorrect sheet '" + sheetName + "', enter a valid one");
  }
 }
 
 public int getRowCount(String sheetName)
 {
     ws = wb.getSheet(sheetName);
     int rowCount = ws.getLastRowNum()+1;
     return rowCount;
 }
 
 public int getColumnCount(String sheetName)
 {
     ws = wb.getSheet(sheetName);
     row = ws.getRow(0);
     int colCount = row.getLastCellNum();
     return colCount;
 }
 
 /**
  * Gets a cell value from the opened sheet
  * 
  * @param rowIndex
  *            starting with 0 index
  * @param columnIndex
  *            starting with 0 index
  * @return
  */
 public String getCell(int rowIndex, int columnIndex) {
  Cell cell = null;
  try {
    cell = ws.getRow(rowIndex).getCell(columnIndex);
  } catch (Exception e) {
   System.err.println("The cell with row '" + rowIndex + "' and column '"
     + columnIndex + "' doesn't exist in the sheet");
  }
  return new DataFormatter().formatCellValue(cell);
 }
 
 
 public void setData(String sheetName , String Colname, String data) throws IOException
 {
	 ws = wb.getSheet(sheetName);
	 row = ws.getRow(0);
	 for(int i=0;i<=row.getLastCellNum();i++)
	 {
		if(row.getCell(i).getStringCellValue().equalsIgnoreCase(Colname))
		{
			ws.getRow(1).createCell(i).setCellValue(data);
			break;
		}
	 }
	 FileOutputStream fos = new FileOutputStream(fileName);
	 wb.write(fos);	
	 fos.close();
	 wb.close();
	 		
 }
 
 
 public String getData(String sheetName, String Colname)
 {
	 String str = null;
	 ws = wb.getSheet(sheetName);
	 row = ws.getRow(0);
	 for(int i=0;i<=row.getLastCellNum();i++)
	 {
		if( row.getCell(i).getStringCellValue().equalsIgnoreCase(Colname))
		{
			str =  ws.getRow(1).getCell(i).getStringCellValue();
			break;
		}
	 }
	 	return str;
	 		
	 		
 }
}