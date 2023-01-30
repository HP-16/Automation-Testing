package org.datadriven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin extends BaseClass{
	public Adactin() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement uName;
	@FindBy(id="password")
	private WebElement pwd;
	@FindBy(id="login")
	private WebElement login;
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement rType;
	@FindBy(id="room_nos")
	private WebElement rNos;
	@FindBy(id="datepick_in")
	private WebElement checkIn;
	@FindBy(id="datepick_out")
	private WebElement checkOut;
	@FindBy(id="adult_room")
	private WebElement adultCount;
	@FindBy(id="child_room")
	private WebElement childrenCount;
	@FindBy(id="Submit")
	private WebElement submitBtn;
	@FindBy(id="radiobutton_0")
	private WebElement rBtn;
	@FindBy(id="continue")
	private WebElement continueBtn;
	@FindBy(id="first_name")
	private WebElement fName;
	@FindBy(id="last_name")
	private WebElement lName;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement cNum;
	@FindBy(id="cc_type")
	private WebElement cType;
	@FindBy(id="cc_exp_month")
	private WebElement cMonth;
	@FindBy(id="cc_exp_year")
	private WebElement cYear;
	
	
	
	public WebElement getuName() {
		return uName;
	}
	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getrType() {
		return rType;
	}
	public WebElement getrNos() {
		return rNos;
	}
	public WebElement getCheckIn() {
		return checkIn;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public WebElement getAdultCount() {
		return adultCount;
	}
	public WebElement getChildrenCount() {
		return childrenCount;
	}
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	public WebElement getrBtn() {
		return rBtn;
	}
	public WebElement getContinueBtn() {
		return continueBtn;
	}
	public WebElement getfName() {
		return fName;
	}
	public WebElement getlName() {
		return lName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getcNum() {
		return cNum;
	}
	public WebElement getcType() {
		return cType;
	}
	public WebElement getcMonth() {
		return cMonth;
	}
	public WebElement getcYear() {
		return cYear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBookBtn() {
		return bookBtn;
	}
	public WebElement getOrderNumber() {
		return orderNumber;
	}
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement bookBtn;
	@FindBy(id="order_no")
	private WebElement orderNumber;
	
}
