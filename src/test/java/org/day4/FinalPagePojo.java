package org.day4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalPagePojo extends FlightBase {
	
	public FinalPagePojo() {
		PageFactory.initElements(driver, this);
		} 
		@FindBy(xpath="//span[text()='No Thanks']")
		private WebElement btnNoThanksfinal ;
		public WebElement getBtnNoThanksfinal() {
			return btnNoThanksfinal;
		}
}
