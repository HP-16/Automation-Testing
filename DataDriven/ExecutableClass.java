package org.datadriven;

import java.io.IOException;

public class ExecutableClass extends BaseClass{
	public static void main(String[] args) throws IOException,InterruptedException {
		launchBrowser();
		hitUrl("http://adactinhotelapp.com/");
		Adactin ac = new Adactin();
		sendValues(ac.getuName(), excelRead(0, 0));
		sendValues(ac.getPwd(), excelRead(1, 0));
		btnClick(ac.getLogin());
		sendValues(ac.getLocation(), excelRead(2, 0));
		sendValues(ac.getHotels(), excelRead(3, 0));
		sendValues(ac.getrType(), excelRead(4, 0));
		sendValues(ac.getrNos(), excelRead(5, 0));
		sendValues(ac.getCheckIn(), excelRead(6, 0));
		sendValues(ac.getCheckOut(), excelRead(7, 0));
		sendValues(ac.getAdultCount(), excelRead(8, 0));
		sendValues(ac.getChildrenCount(), excelRead(9, 0));
		btnClick(ac.getSubmitBtn());
		Thread.sleep(3000);
		btnClick(ac.getrBtn());
		btnClick(ac.getContinueBtn());
		sendValues(ac.getfName(), excelRead(10, 0));
		sendValues(ac.getlName(), excelRead(11, 0));
		sendValues(ac.getAddress(), excelRead(12, 0));
		sendValues(ac.getcNum(), excelRead(13, 0));
		dropDown(ac.getcType(), excelRead(14, 0));
		dropDown(ac.getcMonth(), excelRead(15, 0));
		dropDown(ac.getcYear(), excelRead(16, 0));
		sendValues(ac.getCvv(), excelRead(17, 0));
		btnClick(ac.getBookBtn());
		Thread.sleep(8000);
		excelWrite(orderNumber(ac.getOrderNumber()));
	}
}
