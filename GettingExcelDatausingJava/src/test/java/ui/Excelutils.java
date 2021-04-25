package ui;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {

	public Excelutils(String excelPath,String sheetPath) {
		try {
			workbook = new XSSFWorkbook(excelPath);

			sheet = workbook.getSheet(sheetPath);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public static void main(String[] args) {
		
	}

	public static int getrowcout() {
		int rowcount=0;
		try {
			 rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows : " + rowcount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return rowcount;

	}
	public static int getcolumncout() {

		int colcount=0;
		try {
			 colcount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of column : " + colcount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

		return colcount;
	}

	public static String getcelldata(int row, int column) {
		String celldata=null;
		try {
			 celldata = sheet.getRow(row).getCell(column).getStringCellValue();
			//System.out.println(celldata);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return celldata;

	}
	// thats for numeric value
//	public static void getcelldatanumber() {
//		try {
//			projectPath = System.getProperty("user.dir");
//			workbook = new XSSFWorkbook(projectPath + "/excel/data.xlsx");
//			sheet = workbook.getSheet("Sheet1");
//
//			double celldata = sheet.getRow(1).getCell(1).getNumericCellValue();
//			System.out.println(celldata);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}

	public static void getcelldatanumber(int row, int column) {
		try {
			projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath + "/excel/data.xlsx");
			sheet = workbook.getSheet("Sheet1");

			double celldata = sheet.getRow(row).getCell(column).getNumericCellValue();
			System.out.println(celldata);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
