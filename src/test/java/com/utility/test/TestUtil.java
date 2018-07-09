package com.utility.test;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class TestUtil {
	
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getTestDataFromExcel(){
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
		reader = new Xls_Reader("C:\\Users\\css100409\\eclipse-workspace\\SeleniumAutomationSessions\\src\\test\\java\\com\\testdata\\HalfEbayTestData.xlsx");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		for(int rowNum=2; rowNum<=reader.getRowCount("RegTestData"); rowNum++) {
			
			String firstName = reader.getCellData("RegTestData", "firstname", rowNum);
			String lastName = reader.getCellData("RegTestData", "lastname", rowNum);
			String email = reader.getCellData("RegTestData", "email", rowNum);
			String password = reader.getCellData("RegTestData", "password", rowNum);
			
			Object ob[] = {firstName, lastName, email, password};
			myData.add(ob);
		}
		
		return myData;
		
	}
}
