
package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class excelDataProvider {
	
	@Test(dataProvider = "test1")
	public void test(String username,String password) {
		System.out.println(username+" | " +password);
	}

	@DataProvider(name = "test1")
	public Object[][] getdata() {
		String pth = "C:\\Users\\hp\\Documents\\eclipse workspace\\GettingExcelDatausingJava\\excel\\data.xlsx";
		Object dataset[][] = testdata(pth, "Sheet1");
		return dataset;
	}

	public static Object[][] testdata(String excelPath, String sheetPath) {
		new Excelutils(excelPath, sheetPath);
		int rowcount = Excelutils.getrowcout();
		int colmcount = Excelutils.getcolumncout();
		// rowcount -1 is used becuase we dont rum the first becasue
		// the first is our header
		Object[][] dataset = new Object[rowcount - 1][colmcount];

		for (int i = 1; i < rowcount; i++) {
			for (int j = 0; j < colmcount; j++) {
				String data = Excelutils.getcelldata(i, j);
				System.out.print(data + " | ");
				dataset[i - 1][j] = data;
			}
			System.out.println();
		}
		return dataset;

	}
}
