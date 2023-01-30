package org.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static WebDriver driver;
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void hitUrl(String url) {
		driver.get(url);
	}
	public static void sendValues(WebElement sv, String value) {
		sv.sendKeys(value);
	}
	public static void btnClk(List<WebElement> list) {
		list.get(0).click();
	}
}
