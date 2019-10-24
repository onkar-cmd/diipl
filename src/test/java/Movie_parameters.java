import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Movie_parameters {

	public static void main(String[] args) throws IOException {
		List<Movie> data = new ArrayList<>();
		DataFormatter formatter = new DataFormatter();
		FileInputStream fis = new FileInputStream("C:\\Users\\onkarb\\Downloads\\Movie_details.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int lr = sheet.getLastRowNum();
		for (int i = 1; i <= lr; i++) {
			Movie m = new Movie();
			m.movie_name = formatter.formatCellValue(sheet.getRow(i).getCell(0));
			m.Date = formatter.formatCellValue(sheet.getRow(i).getCell(1));
			m.rating = formatter.formatCellValue(sheet.getRow(i).getCell(2));
			m.generic = formatter.formatCellValue(sheet.getRow(i).getCell(3));
			m.language = formatter.formatCellValue(sheet.getRow(i).getCell(4));
			m.type = formatter.formatCellValue(sheet.getRow(i).getCell(5));
			m.production = formatter.formatCellValue(sheet.getRow(i).getCell(6));
			m.movie_length = formatter.formatCellValue(sheet.getRow(i).getCell(7));
			m.director = formatter.formatCellValue(sheet.getRow(i).getCell(8));
			m.music_director = formatter.formatCellValue(sheet.getRow(i).getCell(9));
			m.movie_stars = formatter.formatCellValue(sheet.getRow(i).getCell(10));
			data.add(m);

		}

		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i).movie_name + ", " + data.get(i).Date + ", " + data.get(i).rating + " ,"
					+ data.get(i).generic + " ," + data.get(i).language + ", " + data.get(i).type + ", "
					+ data.get(i).production + ", " + data.get(i).movie_length + ", " + data.get(i).director + ", "
					+ data.get(i).music_director + ", " + data.get(i).movie_stars);

		}

	}
}

class Movie {
	String movie_name;
	String Date;
	String rating;
	String generic;
	String language;
	String type;
	String production;
	String movie_length;
	String director;
	String music_director;
	String movie_stars;
}
