package org.day4;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Booking extends FlightBase {
	@BeforeClass
	public static void initial() {
		launchBrowser();
		launchURL();
	}
	@Test
	public void tc1() throws InterruptedException {
		LoginPojo lp1=new LoginPojo();
		clickButton(lp1.getBtnOneway());
		passValues(lp1.getTxtDestination(),"Bengaluru, India");
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.id("dates"));
		date.click();
		clickButton(lp1.getBtnDate());
		clickButton(lp1.getBtnSearch());
	}
	@Test
	public void tc2() {
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		for(String childWindow:allWindow) {
			if (!(parentWindow.equals(childWindow))) {
				driver.switchTo().window(childWindow);
			}
		}
		FlightListPojo flp=new FlightListPojo();
		clickButton(flp.getClosePopUP());
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()", flp.getBtnPriceSort());
		clickButton(flp.getBtnLowPrice());
		clickButton(flp.getBtnContinueToPayment());
	}
	@Test
	public void tc3() {
		PaymentPojo pmt=new PaymentPojo();
		passValues(pmt.getTxtFirstName(), "Azar");
		passValues(pmt.getTxtLastName(), "Ar");
		dropSel(pmt.getSlctGender());
		se.selectByValue("M");
		dropSel(pmt.getSlctMonth());
		se.selectByValue("04");
		passValues(pmt.getTxtDobDate(), "20");
		passValues(pmt.getTxtDobYear(), "1996");
		passValues(pmt.getTxtCreditCardNum(), "4485389429159240");
		dropSel(pmt.getSlctExpiryMonth());
		se.selectByValue("03");
		dropSel(pmt.getSlctExpiryYear());
		se.selectByValue("2021");
		passValues(pmt.getTxtCVV(), "622");
		passValues(pmt.getTxtHolderName(), "Jamil Prohaska");
		dropSel(pmt.getTxtCreditCountry());
		se.selectByValue("IN");
		passValues(pmt.getTxtAddress(), "OMR");
		passValues(pmt.getTxtCity(), "Chennai");
		passValues(pmt.getTxtPhone(), "8930400095");
		passValues(pmt.getTxtEmail(), "abbacc54321@gmail.com");
		clickButton(pmt.getBtnClick());
		clickButton(pmt.getBtnPopOk());
	}
	@Test
	public void tc4() throws IOException {
		FinalPagePojo fpg=new FinalPagePojo();
		clickButton(fpg.getBtnNoThanksfinal());
		screenShot("OrderPage");
		System.out.println("order done");
	}
	@AfterClass
	public static void quitBrow() {
		driver.quit();
	}
}

