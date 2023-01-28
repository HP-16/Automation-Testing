package org.task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static WebDriver driver;
	@BeforeClass
	private void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Test
	private void hitUrl() {
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
	}
	@Test
	private void loginBox() throws InterruptedException {
		Methods m = new Methods();
		m.getLoginClick().click();
		m.getSignup().click();
		Thread.sleep(5000);
		driver.switchTo().frame(1);
		m.getMobile().sendKeys("7010696213");
		Thread.sleep(2000);
		m.getCaptcha().click();
	}
	
}
