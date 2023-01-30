package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static WebDriver driver;
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void hitUrl(String url) {
		driver.get("http://adactinhotelapp.com/");
	}
	public static void sendValues(WebElement sv, String value) {
		sv.sendKeys(value);
	}
	public static void btnClick(WebElement bc) {
		bc.click();
	}
	public static String orderNumber(WebElement attribute) {
		String orderID = attribute.getAttribute("value");
		return orderID;
		
	}
	public static String excelRead(int r, int c) throws IOException {
		String text = "";
		File f = new File("C:\\HARI\\New folder\\InterviewPractice\\ExcelSheet\\data.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fin);
		Sheet s = wb.getSheet("Sheet1");
		Row row = s.getRow(r);
		Cell cell = row.getCell(c);
		int cellType = cell.getCellType();
		if(cellType==1) {
			text = cell.getStringCellValue();
		}
		else if(DateUtil.isCellDateFormatted(cell)) {
			Date d = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat();
			text = sdf.format(d);
		}
		else {
			double d = cell.getNumericCellValue();
			long l = (long) d;
			text = String.valueOf(l);
		}
		return text;
	}
	public static void excelWrite(String value) throws IOException {
		int physicalNumberOfCells=0;
		File f = new File("C:\\HARI\\New folder\\InterviewPractice\\ExcelSheet\\data.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fin);
		Sheet sheet = wb.getSheet("Sheet1");
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		for(int i=0;i<physicalNumberOfRows;i++) {
			Row row = sheet.getRow(i);
			physicalNumberOfCells = row.getPhysicalNumberOfCells();
		}
		Row createRow = sheet.createRow(physicalNumberOfRows-1);
		Cell createCell = createRow.createCell(physicalNumberOfCells-1);
		createCell.setCellValue(value);
		FileOutputStream fout = new FileOutputStream(f);
		wb.write(fout);
	}
	
	public static void dropDown(WebElement dd,String value) {
		Select s = new Select(dd);
		s.selectByValue(value);
	}
}



















