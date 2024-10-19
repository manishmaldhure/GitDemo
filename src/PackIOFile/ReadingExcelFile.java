package PackIOFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFile {

	public static void main(String[] args) throws IOException {

		File src=new File("D:\\Skills\\Training Materials\\TestData.xlsx");

		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("Sheet1");
		
		System.out.println("Sheet name is.."+sh.getSheetName());
		
		
		System.out.println(sh.getRow(3).getCell(0).getStringCellValue());
		System.out.println((int)sh.getRow(2).getCell(1).getNumericCellValue());
		
		System.out.println("No of Rows..."+sh.getPhysicalNumberOfRows());
		System.out.println("No of Rows..."+sh.getLastRowNum());
		System.out.println("");
		System.out.println("No of Cells.."+sh.getRow(0).getPhysicalNumberOfCells());
		System.out.println("No of Cells.."+(sh.getRow(0).getLastCellNum()+1));
		
		
		
		
		
		
		
	}
	

}
