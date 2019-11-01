package testng_framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelUtils {

	@DataProvider(name = "Passing parameters")
	public Object[][] getdata(String[] args) throws IOException {
		ArrayList<String> data = new ArrayList<String>();
		DataFormatter formatter = new DataFormatter();
		FileInputStream fis = new FileInputStream("C:\\Users\\onkarb\\Downloads\\Movie_details.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row;
		try {
			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				row = sheet.getRow(i);
				for (int j = 0; j <= sheet.getRow(sheet.getLastRowNum()).getLastCellNum(); j++) {
					String value = formatter.formatCellValue(sheet.getRow(i).getCell(j));
					data.add(value);
				}

			}
		} catch (Exception e) {
			e.getMessage();

		}

		System.out.println(data);
		Object[][] ex = { { data } };
		return ex;

	}

}
