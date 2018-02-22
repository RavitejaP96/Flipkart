package com.page;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
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

	@QAFTestStep(description = "Open my application")
	public void openApp() {
		xpathAllowbuttonLaunchpage.click();
		idClosebuttonFlipkartlaunchpage.click();
		xpathCatagorybuttonFlipkarthomepage.click();
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

}
