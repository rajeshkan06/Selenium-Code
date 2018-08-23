package businesscomponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteExcel {
	
	
	/*public static void writeDataFromExcel(String filepath,String Sheetname,int rowcount,int columncount,String mailId)
	{
	    try
	    {
	        FileInputStream input=new FileInputStream(filepath);
	        HSSFWorkbook wb=new HSSFWorkbook(input);
	        HSSFSheet sh=wb.getSheet(Sheetname);
	        HSSFRow row=sh.getRow(rowcount);
	        FileOutputStream webdata=new FileOutputStream(filepath);
	        row.createCell(columncount).setCellValue(mailId);
	        wb.write(webdata);

	    }
	    catch(Exception e)
	    {

	    }
	}*/
	
	public static void writeDataFromExcel() throws Exception {
		
		File src = new File("D:\\CRAFT_Classic\\CRAFT_Classic\\Datatables\\test.xls");
		FileInputStream fis = new FileInputStream(src);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sheet = wb.getSheetAt(0);
		String mailid = RandomString.generate(5);
		sheet.getRow(0).createCell(0).setCellValue("test"+mailid+"@yopmail.com");
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		wb.close();
	}

}


