package com.MakemyTripApp.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeMyTrip {

	WebDriver ldriver;

	public MakeMyTrip(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	
	@FindBy(id = "fromCity")
	WebElement fromsource;

	@FindBy(xpath = "//input[@placeholder ='From']")
	WebElement source;

	@FindBy(css=".calc60")
	WebElement selectsource;

	@FindBy(xpath = "//div[contains(@class,'fsw_inputBox dates inactiveWidget')]//label")
	WebElement clickcal;

	@FindBy(xpath = "//div[@class='DayPicker-Day']//p[contains(text(),'18')]")
	WebElement selectdate;
	
	@FindBy(css = "a.primaryBtn.font24.latoBold.widgetSearchBtn")
	WebElement search;

	@FindBy(xpath ="//div[contains(@class,'filtersCollapsOuter append_bottom20')]//span[2]//label[1]//span[1]//span[1]")
	WebElement onestop;

	@FindBy(xpath= "//div[contains(@class,'filtersCollapsOuter append_bottom20')]//span[2]//label[1]//div[1]//div[1]//p[1]")
	WebElement onestopcount;
	
	@FindBy(xpath= "//span[2]//label[1]//div[1]//div[1]//p[2]")
	WebElement minprice;

	public void clickFromsource() {
		fromsource.click();	
	}

	public void sourceFlight(String sou) {
		source.sendKeys(sou);
	}

	public void selsourceFlight() {
		selectsource.click();
	}
	
	public void selcal() {
		clickcal.click();
	}
	public void dateofFlight() {
		selectdate.click();
	}

	public void searchFlight() {
		search.click();
	}

	public void checkonestop() {
		onestop.click();
	}

	public String countFlight() {
		return onestopcount.getText();
	}

	public String mincharge() {
		return minprice.getText();
	}
}
