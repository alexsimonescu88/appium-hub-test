package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HubConneXionsPage extends BasePage {

    @FindBy(id = "hub")
    private WebElement hubButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"ConneXions\"]")
    private WebElement conneXionsLabel;

    @FindBy(id = "Search")
    private WebElement conneXionsSearchButton;

    @FindBy(id = "No conneXions available")
    private WebElement noConneXionsLabel;

    public HubConneXionsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getHubButton() {
        return waitForClickability(hubButton, 20);
    }

    public WebElement getConneXionsLabel() {
        return waitForVisibility(conneXionsLabel, 20);
    }

    public WebElement getConneXionsSearchButton() {
        return waitForClickability(conneXionsSearchButton, 20);
    }

    public WebElement getNoConneXionsLabel() {
        return waitForVisibility(noConneXionsLabel, 20);
    }
}
