package prime_assignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelBySan {

	@Test
	public void readexcel() {

		File excel = new File("./src/test/resources/testdata/MMPLogin.xlsx");
		try {
			FileInputStream fis = new FileInputStream(excel);
			XSSFWorkbook wb = new XSSFWorkbook(fis);

			int rowcount = wb.getSheetAt(0).getPhysicalNumberOfRows();

			
			for (int i = 1; i < rowcount; i++) {

				DataFormatter df = new DataFormatter();
				String row1 = df.formatCellValue(wb.getSheetAt(0).getRow(i).getCell(0));
				String col1 = df.formatCellValue(wb.getSheetAt(0).getRow(i).getCell(1));
				//String row1 = wb.getSheetAt(0).getRow(i).getCell(0).toString();
				//String col1 = wb.getSheetAt(0).getRow(i).getCell(1).toString();
				System.out.println(row1+ " " +col1);
			}

			wb.close();

		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
