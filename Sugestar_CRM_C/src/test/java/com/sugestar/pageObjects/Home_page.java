package com.sugestar.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sugestar.genaric.library.BaseTest;

public class Home_page extends BaseTest {
@FindBy(xpath="//a[text()=\"Contacts\"]")private WebElement CampaignButton;

/**
 * @return the campaignButton
 */



public WebElement getCampaignButton() {
	return CampaignButton;
}

public void Home_Page_Action() {
	CampaignButton.click();
}
}
