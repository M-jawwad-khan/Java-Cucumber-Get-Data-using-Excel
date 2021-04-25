package ui;

public class excelpath {
	public static void main(String[] args) {


//		workbook = new XSSFWorkbook(projectPath + "/excel/data.xlsx");
		String projectPath = System.getProperty("user.dir");
		new Excelutils(projectPath + "/excel/data.xlsx", "Sheet1");
	
		Excelutils.getrowcout();
		Excelutils.getcelldata(1,0);
		Excelutils.getcelldatanumber(1, 1);
		Excelutils.getcolumncout();
	
	
	}
}
