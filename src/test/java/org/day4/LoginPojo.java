package org.day4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends FlightBase {
	
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	} 
	@FindBy(xpath="(//span[@class='tgl-btn'])[2]")
	private WebElement btnOneway;
	@FindBy(id="to1")
	private WebElement txtDestination;
	@FindBy(xpath="(//*[contains(text(),'15')])[3]")
	private WebElement btnDate;
	@FindBy(xpath="//button[@class='btn large block']")
	private WebElement btnSearch;
	
	public WebElement getBtnOneway() {
		return btnOneway;
	}
	public WebElement getTxtDestination() {
		return txtDestination;
	}
	public WebElement getBtnDate() {
		return btnDate;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
}
