package org.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class POM extends BaseClass{
	public POM() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchBox;
	
	// FindBys -> AND condition
	@FindBys({
		@FindBy(id="nav-search-submit-button"),
		@FindBy(xpath="(//input[@class='nav-input nav-progressive-attribute'])[2]")
	})
	private List<WebElement>btnClick;
	
	// FindAll -> OR condition
	@FindAll({
		@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"),
		@FindBy(xpath="//span[@id = 1234]")
	})
	private List<WebElement>itemClick;
	
	
	public WebElement getSearchBox() {
		return searchBox;
	}
	
	public List<WebElement> getbtnClick() {
		return btnClick;
	}
	
	public List<WebElement> getitemClick() {
		return itemClick;
	}
	
	
	
	
	
	
	
	
}
