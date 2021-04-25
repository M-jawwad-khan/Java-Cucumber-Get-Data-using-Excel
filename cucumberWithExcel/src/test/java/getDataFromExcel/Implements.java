//package getDataFromExcel;
//
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//
//public class Implements {
//
//
//	
//
//	static String projectPath;
//	static XSSFWorkbook workbook;
//	static XSSFSheet sheet;
//	
//	
//	WebDriver driver = null;
//	getdata gd = new getdata(driver);
//	
//	@Given("Open browser goto the login page")
//	public void open_browser_goto_the_login_page() {
//		WebDriverManager.firefoxdriver().setup();
//		driver = new FirefoxDriver();
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().window().maximize();
//	}
//
//	
//	@When("^user fill thr form given sheetname (.*) and rownumber (.*)$")
//	public static void user_fill_thr_form_given_sheetname_and_rownumber(int rownumber, int columnnumber) {
//		
//		String projectPath = System.getProperty("user.dir");
//		new Excelutils(projectPath + "/excel/data.xlsx", "Sheet1");
//	
//		
//		
//	
//		
////		Excelutils.getrowcout();
////		Excelutils.getcelldata(1,0);
////		Excelutils.getcelldatanumber(1, 1);
////		Excelutils.getcolumncout();
//		
////		projectPath = System.getProperty("user.dir");
////		try {
////		workbook = new XSSFWorkbook(projectPath + "/excel/data.xlsx");
////		}
////		catch(Exception e) {
////			System.out.println(e.getMessage());
////		}
////		sheet = workbook.getSheet("Sheet1");
////		new Excelutils(SheetName, RowNumber);
////		int rowcount = Excelutils.getrowcout();
////		int colmcount = Excelutils.getcolumncout();
////		// rowcount -1 is used becuase we dont rum the first becasue
////		// the first is our header
////		Object[][] dataset = new Object[rowcount - 1][colmcount];
////
////		for (int i = 1; i < rowcount; i++) {
////			for (int j = 0; j < colmcount; j++) {
////				String data = Excelutils.getcelldata(i, j);
////				System.out.print(data + " | ");
////				dataset[i - 1][j] = data;
////			}
////			System.out.println();
////		}
////		return dataset;
//	}
//	
//
//	@And("user click on send button")
//	public void user_click_on_send_button() {
//		
//	}
//
//	@Then("it shows a successfull message")
//	public void it_shows_a_successfull_message() {
//		
//	}
//
//}
//
//
