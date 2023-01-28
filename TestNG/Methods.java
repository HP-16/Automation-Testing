package org.task2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Methods extends BaseClass{
	public Methods() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="i-icon-profile")
	private WebElement loginClick;
	@FindBy(id="signInLink")
	private WebElement signup;
	@FindBy(id="mobileNoInp")
	private WebElement mobile;
	@FindBy(xpath="(//div[@class='recaptcha-checkbox-border'])[1]")
	private WebElement captcha;
	@FindBy(xpath="//span[@class='f-w-b']")
	private WebElement otp;
	
	
	public WebElement getLoginClick() {
		return loginClick;
	}
	public WebElement getSignup() {
		return signup;
	}
	public WebElement getMobile() {
		return mobile;
	}
	public WebElement getCaptcha() {
		return captcha;
	}
	public WebElement getOtp() {
		return otp;
	}
}
