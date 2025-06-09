package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HubActivitiesPage extends BasePage {

    @FindBy(id = "hub")
    private WebElement hubButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Activities\"]")
    private WebElement activitiesLabel;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"magnifyingglass\"]")
    private WebElement activitiesSearchButton;

    @FindBy(id = "Team")
    private WebElement teamButton;

    @FindBy(id = "My")
    private WebElement myButton;

    public HubActivitiesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getHubButton() {
        return waitForClickability(hubButton, 20);
    }

    public WebElement getActivitiesLabel() {
        return waitForVisibility(activitiesLabel, 20);
    }

    public WebElement getActivitiesSearchButton() {
        return waitForClickability(activitiesSearchButton, 20);
    }

    public WebElement getTeamButton() {
        return waitForClickability(teamButton, 20);
    }

    public WebElement getMyButton() {
        return waitForClickability(myButton, 20);
    }
}
