package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HubRecentsPage extends BasePage {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Recents\"]")
    private WebElement recentsLabel;

    @FindBy(id = "My hub")
    private WebElement myHubButton;

    public HubRecentsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getRecentsLabel() {
        return waitForVisibility(recentsLabel, 20);
    }

    public WebElement getMyHubButton() {
        return waitForClickability(myHubButton, 20);
    }
}
