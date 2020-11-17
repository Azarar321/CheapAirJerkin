package org.day4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPojo extends FlightBase {
	
	public PaymentPojo() {
	PageFactory.initElements(driver, this);
	} 
	@FindBy(id="firstName1")
	private WebElement txtFirstName ;
	@FindBy(id="lastName1")
	private WebElement txtLastName ;
	@FindBy(id="gender1")
	private WebElement slctGender;
	@FindBy(id="dobMonth1")
	private WebElement slctMonth;
	@FindBy(id="dobDay1")
	private WebElement txtDobDate;
	@FindBy(id="dobYear1")
	private WebElement txtDobYear;
	@FindBy(id="ccNum1")
	private WebElement txtCreditCardNum;
	@FindBy(id="expMonth1")
	private WebElement slctExpiryMonth ;
	@FindBy(id="expYear1")
	private WebElement slctExpiryYear;
	@FindBy(id="cvv1")
	private WebElement txtCVV;
	@FindBy(id="paymentName1")
	private WebElement txtHolderName;
	@FindBy(id="paymentCountry1")
	private WebElement txtCreditCountry;
	@FindBy(id="paymentAddress1")
	private WebElement txtAddress ;
	@FindBy(id="paymanetCity1")
	private WebElement txtCity;
	@FindBy(id="paymentPhone1")
	private WebElement txtPhone;
	@FindBy(id="email")
	private WebElement txtEmail;
	@FindBy(xpath="//button[@class='btn block large']")
	private WebElement btnClick;
	@FindBy(xpath="//button[text()='Okay']")
	private WebElement btnPopOk;
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	public WebElement getBtnPopOk() {
		return btnPopOk;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getBtnClick() {
		return btnClick;
	}
	public WebElement getSlctGender() {
		return slctGender;
	}
	public WebElement getSlctMonth() {
		return slctMonth;
	}
	public WebElement getTxtDobDate() {
		return txtDobDate;
	}
	public WebElement getTxtDobYear() {
		return txtDobYear;
	}
	public WebElement getTxtCreditCardNum() {
		return txtCreditCardNum;
	}
	public WebElement getSlctExpiryMonth() {
		return slctExpiryMonth;
	}
	public WebElement getSlctExpiryYear() {
		return slctExpiryYear;
	}
	public WebElement getTxtCVV() {
		return txtCVV;
	}
	public WebElement getTxtHolderName() {
		return txtHolderName;
	}
	public WebElement getTxtCreditCountry() {
		return txtCreditCountry;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	public WebElement getTxtCity() {
		return txtCity;
	}
	public WebElement getTxtPhone() {
		return txtPhone;
	}
	public WebElement getTxtEmail() {
		return txtEmail;
	}
}