package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition{
	WebDriver driver;
	@Given("User launches facebook web application")
	public void user_launches_facebook_web_application() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}

	@When("User enters valid username and valid password")
	public void user_enters_valid_username_and_valid_password() {
	    driver.findElement(By.id("email")).sendKeys("UserName");
	    driver.findElement(By.id("pass")).sendKeys("passWoRd@p");
	}

	@When("User clicks Login Button")
	public void user_clicks_Login_Button() {
	    driver.findElement(By.name("login")).click();
	}

	@Then("Error message should be displayed")
	public void error_message_should_be_displayed() {
	    String errorMsg = driver.findElement(By.className("_9ay7")).getText();
	    System.out.println("Facebook error message : "+errorMsg);
	}

}
