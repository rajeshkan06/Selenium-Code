package com.datadriven.test;

import com.excel.utility.Xls_Reader;

public class ExcelOperations {

	public static void main(String[] args) {
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\css100409\\eclipse-workspace\\SeleniumAutomationSessions\\src\\test\\java\\com\\testdata\\HalfEbayTestData.xlsx");
//		reader.addSheet("TestSheet");
		reader.removeSheet("TestSheet");
		System.out.println(reader.getColumnCount("RegTestData"));
	}

}
