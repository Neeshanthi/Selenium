package prime_assignments;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class IntegrateExcelWithDP2 {
	
	@Test
		public static void getExcelData() throws Exception {

		File file = new File("./src/test/resources/testdata/MMPLogin.xlsx");

		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println(rows);
		int cols = sheet.getRow(0).getLastCellNum();
		System.out.println(cols);

		
		for (int i = 1; i < rows; i++) {

			

				XSSFCell row1 = wb.getSheetAt(0).getRow(i).getCell(0);
				XSSFCell col1 = wb.getSheetAt(0).getRow(i).getCell(1);
				System.out.println(row1+ " " +col1);
				
			
			
			
			wb.close();
		}
		

	}

}
