package org.task7;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement userId;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login")
	private WebElement loginbtn;
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement room_type;
	@FindBy(id="room_nos")
	private WebElement room_nos;
	@FindBy(id="datepick_in")
	private WebElement dpick;
	@FindBy(id="datepick_out")
	private WebElement dout;
	@FindBy(id="adult_room")
	private WebElement adult_room;
	@FindBy(id="child_room")
	private WebElement child_room;
	@FindBy(id="Submit")
	private WebElement Submit;
	@FindBy(id="radiobutton_0")
	private WebElement rb_1;
	@FindBy(id="continue")
	private WebElement cont;
	@FindBy(id="first_name")
	private WebElement f_name;
	@FindBy(id="last_name")
	private WebElement l_name;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement cc_num;
	@FindBy(id="cc_type")
	private WebElement cc_type;
	@FindBy(id="cc_exp_month")
	private WebElement cc_exp_month;
	@FindBy(id="cc_exp_year")
	private WebElement cc_exp_year;
	@FindBy(id="cc_cvv")
	private WebElement cc_cvv;
	@FindBy(id="book_now")
	private WebElement book_now;
	@FindBy(id="Submit")
	private WebElement submit;
	@FindBy(id="radiobutton_0")
	private WebElement radioBtn;
	@FindBy(name="order_no")
	private WebElement oNo;
	
	
	public WebElement rBtn() {
		return radioBtn;
	}
	public WebElement getsubmitbtn() {
		return submit;
	}
	public WebElement getUserId() {
		return userId;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoom_type() {
		return room_type;
	}
	public WebElement getRoom_nos() {
		return room_nos;
	}
	public WebElement getCinDate() {
		return dpick;
	}
	public WebElement getCoutDate() {
		return dout;
	}
	public WebElement getAdult_room() {
		return adult_room;
	}
	public WebElement getChild_room() {
		return child_room;
	}
	public WebElement getSubmit() {
		return Submit;
	}
	public WebElement getRb_1() {
		return rb_1;
	}
	public WebElement getCont() {
		return cont;
	}
	public WebElement getF_name() {
		return f_name;
	}
	public WebElement getL_name() {
		return l_name;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCc_num() {
		return cc_num;
	}
	public WebElement getCc_type() {
		return cc_type;
	}
	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}
	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}
	public WebElement getCc_cvv() {
		return cc_cvv;
	}
	public WebElement getBook_now() {
		return book_now;
	}
	public WebElement getONo() {
		return oNo;
	}
}
