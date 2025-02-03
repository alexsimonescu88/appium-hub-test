package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HubCalendarPage extends BasePage {

    @FindBy(id = "hub")
    private WebElement hubButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Calendar\"]")
    private WebElement calendarLabel;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"disclosure indicator\"])[1]")
    private WebElement rightArrowButton;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"disclosure indicator\"])[2]")
    private WebElement leftArrowButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Today\"]")
    private WebElement todayButton;

    public HubCalendarPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getHubButton() {
        return waitForClickability(hubButton, 20);
    }

    public WebElement getCalendarLabel() {
        return waitForVisibility(calendarLabel, 20);
    }

    public WebElement getRightArrowButton() {
        return waitForClickability(rightArrowButton, 20);
    }

    public WebElement getLeftArrowButton() {
        return waitForClickability(leftArrowButton, 20);
    }

    public WebElement getTodayButton() {
        return waitForClickability(todayButton, 20);
    }
}
