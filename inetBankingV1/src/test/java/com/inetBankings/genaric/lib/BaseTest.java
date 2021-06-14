package com.inetBankings.genaric.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
WebDriver driver;
@BeforeMethod
@Parameters("browser")
public void openBrowser(Object browser) {
	if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}else if(browser.equals("firfox")) {
		WebDriverManager.firefoxdriver().setup();
	}
}
@AfterMethod
public void close() {
	getDriver().close();
}
public WebDriver getDriver() {
	return driver;
}
}
