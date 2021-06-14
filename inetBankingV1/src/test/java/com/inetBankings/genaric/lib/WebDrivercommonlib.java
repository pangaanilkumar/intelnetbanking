package com.inetBankings.genaric.lib;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.google.common.io.Files;

public class WebDrivercommonlib extends BaseTest {

	Filelib fb = new Filelib();

	public String getTitle() {
		String title = getDriver().getTitle();
		return title;
	}

	public void verify(String actualTitle, String ExpectedTitle) {
		Assert.assertEquals(actualTitle, ExpectedTitle);
	}

	public void mouseOverAction(WebElement element) {
		Actions action = new Actions(getDriver());
		action.moveToElement(element).perform();
	}

	public void doubleClicks(WebElement element) {
		Actions action = new Actions(getDriver());
		action.doubleClick();
	}

	public void SelectOptionByText(WebElement element, String text) {
		Select sc = new Select(element);
		sc.selectByVisibleText(text);
	}

	public void SelectOptionByValue(WebElement element, String value) {
		Select sc = new Select(element);
		sc.selectByValue(value);
	}

	public void deselectOptionbytext(WebElement element, String text) {
		Select sc = new Select(element);
		sc.deselectByVisibleText(text);
	}

	public void deSelectOptionByValue(WebElement element, String value) {
		Select sc = new Select(element);
		sc.deselectByValue(value);
	}

	public void switchToFrame(int indexValue) {
		getDriver().switchTo().frame(indexValue);
	}

	public void switchToFrameBytext(String text) {
		getDriver().switchTo().frame(text);
	}

	public void switchToFrameBy(WebElement element) {
		getDriver().switchTo().frame(element);
	}

	public void getScreenshot(String path) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) getDriver();
		{
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(path);
			Files.copy(src, dest);
		}
	}

	public void getElementToScreenShot(WebElement element, String path) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) getDriver();
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		Files.copy(src, dest);
	}
	public void WiatForTitle() {
		getDriver().manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
}
 
