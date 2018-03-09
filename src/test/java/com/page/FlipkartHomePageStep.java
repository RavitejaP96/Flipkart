package com.page;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class FlipkartHomePageStep extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "xpath.allow.button")
	private QAFWebElement xpathAllowButton;

	@FindBy(locator = "xpath.closebutton")
	private QAFWebElement xpathClosebutton;

	@FindBy(locator = "xpath.homebutton")
	private QAFWebElement xpathHomebutton;

	@FindBy(locator = "xpath.catagorybutton.flipkarthomepage")
	private QAFWebElement xpathCatagorybuttonFlipkarthomepage;

	@FindBy(locator = "id.closebutton.flipkartlaunchpage")
	private QAFWebElement idClosebuttonFlipkartlaunchpage;

	@FindBy(locator = "xpath.allowbutton.launchpage")
	private QAFWebElement xpathAllowbuttonLaunchpage;

	@FindBy(locator = "xpath.catagorymenu")
	private QAFWebElement xpathCatagorymenu;
	

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getXpathAllowButton() {
		return xpathAllowButton;
	}

	public QAFWebElement getXpathClosebutton() {
		return xpathClosebutton;
	}

	public QAFWebElement getXpathHomebutton() {
		return xpathHomebutton;
	}

	@QAFTestStep(description = "Open my application {0}")
	public void openApp(String value) {
		xpathAllowbuttonLaunchpage.click();
		idClosebuttonFlipkartlaunchpage.click();
		xpathCatagorybuttonFlipkarthomepage.click();
		
		
		
		
		
		QAFExtendedWebElement element = new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("xpathCatagorymenu"), value));
		element.click();
	}
	
	

	public QAFWebElement getXpathCatagorybuttonFlipkarthomepage() {
		return xpathCatagorybuttonFlipkarthomepage;
		
	}

	public QAFWebElement getIdClosebuttonFlipkartlaunchpage() {
		return idClosebuttonFlipkartlaunchpage;
	}

	public QAFWebElement getXpathAllowbuttonLaunchpage() {
		return xpathAllowbuttonLaunchpage;
	}
	
	public void testMethod() {
		System.out.println("Test method for git");
	}

	public QAFWebElement getXpathCatagorymenu() {
		return xpathCatagorymenu;
	}

}
