package com.sugestar.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sugestar.genaric.library.BaseTest;
import com.sugestar.genaric.library.FileLib;
import com.sugestar.genaric.library.WebDriverCommonLib;

public class Accounts_Page extends BaseTest {
@FindBy(xpath="//A[text()='Accounts']")private WebElement AC_Button;

/**
 * @return the campaingButton
 * 
 */
public Accounts_Page() {
	PageFactory.initElements(BaseTest.driver, this);
}


/**
 * @return the aC_Button
 */
public WebElement getAC_Button() {
	return AC_Button;
}


public void AC_click() {
	AC_Button.click();
}



}
