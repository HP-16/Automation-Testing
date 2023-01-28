package org.task7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Methods extends BaseClass{
	public void dropDown(WebElement dd,String s1) {
		Select s = new Select(dd);
		s.selectByValue(s1);
	}
	
	public void getAttri(WebElement ga) {
		String attribute = ga.getAttribute("value");
		System.out.println("The order ID is: "+attribute);
	}
	
	public String getValue(int r, int c) throws IOException{
		File f = new File("C:\\HARI\\New folder\\JUnitDailyTasks\\ExcelSheet\\JUnit.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fin);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(r);
		Cell cell = row.getCell(c);
		String stringCellValue = cell.getStringCellValue();
		Row createRow = sheet.createRow(18);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue(stringCellValue);
		FileOutputStream fout = new FileOutputStream(f);
		wb.write(fout);
		return stringCellValue;
	}
	
}
