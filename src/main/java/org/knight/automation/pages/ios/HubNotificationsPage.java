package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HubNotificationsPage extends BasePage {

    @FindBy(id = "hub")
    private WebElement hubButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Notifications\"]")
    private WebElement notificationsLabel;

    @FindBy(id = "filter icon")
    private WebElement notificationsFilterButton;

    public HubNotificationsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getHubButton() {
        return waitForClickability(hubButton, 20);
    }

    public WebElement getNotificationsLabel() {
        return waitForVisibility(notificationsLabel, 20);
    }

    public WebElement getNotificationsFilterButton() {
        return waitForClickability(notificationsFilterButton, 20);
    }
}
