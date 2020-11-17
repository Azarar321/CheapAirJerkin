package org.day4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightListPojo extends FlightBase {
	
	public FlightListPojo() {
		PageFactory.initElements(driver, this);
	} 
	@FindBy(xpath="//span[text()='No Thanks']")
	private WebElement closePopUP;
//	@FindBy(xpath="(//span[@class='fltrt-sort'])[6]")
//	private WebElement btnPriceSort;
	@FindBy(xpath="(//div[@class='btnfare btn withsub'])[1]")
	private WebElement btnLowPrice;
	@FindBy(xpath="//span[text()='Continue']")
	private WebElement btnContinueToPayment;
	public WebElement getClosePopUP() {
		return closePopUP;
	}
//	public WebElement getBtnPriceSort() {
//		return btnPriceSort;
//	}
	public WebElement getBtnLowPrice() {
		return btnLowPrice;
	}
	public WebElement getBtnContinueToPayment() {
		return btnContinueToPayment;
	}
}
