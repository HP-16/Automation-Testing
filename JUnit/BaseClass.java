package org.task7;

import java.io.IOException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass{
	static WebDriver driver;
	@BeforeClass
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Before
	public void hitUrl() {
		driver.get("http://www.adactin.com/HotelApp/");
	}
	@Test
	public void project() throws IOException, InterruptedException {
		LoginPage lp = new LoginPage();
		Methods m = new Methods();
		lp.getUserId().sendKeys(m.getValue(0, 0));
		lp.getPassword().sendKeys(m.getValue(1, 0));
		lp.getLoginbtn().click();
		m.dropDown(lp.getLocation(), m.getValue(2, 0));
		m.dropDown(lp.getHotels(), m.getValue(3, 0));
		m.dropDown(lp.getRoom_type(), m.getValue(4, 0));
		m.dropDown(lp.getRoom_nos(),"5");
		m.dropDown(lp.getAdult_room(), "3");
		m.dropDown(lp.getChild_room(), "2");
		lp.getSubmit().click();
		lp.getRb_1().click();
		lp.getCont().click();
		lp.getF_name().sendKeys(m.getValue(10, 0));
		lp.getL_name().sendKeys(m.getValue(11, 0));
		lp.getAddress().sendKeys(m.getValue(12, 0));
		lp.getCc_num().sendKeys("1234567892598750");
		m.dropDown(lp.getCc_type(), m.getValue(14, 0));
		m.dropDown(lp.getCc_exp_month(), "12");
		m.dropDown(lp.getCc_exp_year(), "2022");
		lp.getCc_cvv().sendKeys("123");
		lp.getBook_now().click();
		Thread.sleep(5000);
		m.getAttri(lp.getONo());
	}
}
