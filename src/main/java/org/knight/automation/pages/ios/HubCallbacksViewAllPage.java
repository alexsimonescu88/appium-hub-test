package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HubCallbacksViewAllPage extends BasePage {

    @FindBy(id = "Callbacks")
    private WebElement callbacksButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"View All\"]")
    private WebElement viewAllLabel;

    @FindBy(id = "Requirement Callbacks")
    private WebElement requirementCallbacksLabel;

    @FindBy(id = "No Information Available")
    private WebElement noInfoAvailableLabel;

    public HubCallbacksViewAllPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getCallbacksButton() {
        return waitForClickability(callbacksButton, 10);
    }

    public WebElement getViewAllLabel() {
        return waitForVisibility(viewAllLabel, 10);
    }

    public WebElement getRequirementCallbacksLabel() {
        return waitForVisibility(requirementCallbacksLabel, 10);
    }

    public WebElement getNoInfoAvailableLabel() {
        return waitForVisibility(noInfoAvailableLabel, 10);
    }
}
