package businesscomponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {
	
	
	
	/*public static String readDataFromExcel(String filepath,String sheetname,int rowcount,int columncount )
    {
        String data=null;
        try
        {
            FileInputStream input= new FileInputStream(filepath);
            HSSFWorkbook wb=new HSSFWorkbook(input);
            HSSFSheet sh=wb.getSheet(sheetname);
            HSSFRow row=sh.getRow(rowcount);
            row.getCell(columncount).toString();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return data;
     }*/

	public static String readDataFromExcel() throws Exception {
		
		
		File src = new File("D:/CRAFT_Classic/CRAFT_Classic/Datatables/test.xls");
		FileInputStream fis = new FileInputStream(src);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sheet = wb.getSheetAt(0);
		String data = sheet.getRow(0).getCell(0).getStringCellValue();
		wb.close();
		return data;
		
		
	}
}
