package org.day4;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightBase {
	
	public static WebDriver driver;
	public static Robot r;
	public static Select se;
	public static TakesScreenshot ts;
	public static WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;
	}
	public static void launchURL() {
		driver.manage().window().maximize();
		driver.get("https://www.cheapair.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	public static  void passValues(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static  void clickButton(WebElement element) {
		element.click();
	}
	public static Robot keyPad() throws AWTException {
		r=new Robot();
		return r;
	}
	public static Select dropSel(WebElement selElement) {
		se=new Select(selElement);
		return se;
	}
	public static void screenShot(String fileName) throws IOException {
		ts=(TakesScreenshot)driver;
		File srce = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Azar. A. R\\eclipse-workspace-oxy\\CheapAir\\ScreenShots\\"+fileName+".png");
		FileUtils.copyFile(srce, dest);
	}
}
