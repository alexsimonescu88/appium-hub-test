package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HubPage extends BasePage {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"hub\"]")
    private WebElement navBarTittle;

    @FindBy(id = "dashboard_contact")
    private WebElement contactsButton;

    @FindBy(id = "dashboard_companies")
    private WebElement companiesButton;

    @FindBy(id = "dashboard_properties")
    private WebElement propertiesButton;

    @FindBy(id = "dashboard_activities")
    private WebElement activitiesButton;

    @FindBy(id = "dashboard_requirements")
    private WebElement requirementsButton;

    @FindBy(id = "dashboard_referrals")
    private WebElement connexionsButton;

    @FindBy(id = "dashboard_calendar")
    private WebElement calendarButton;

    @FindBy(id = "notifications-tabbar-icon")
    private WebElement notificationsButton;

    @FindBy(id = "dashboard_callbacks")
    private WebElement callbacksButton;

    @FindBy(xpath = "//XCUIElementTypeImage[@name=\"house.fill\"]")
    private WebElement myHubButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"hub\"]")
    private WebElement hubButton;

    public HubPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getNavBarTittle() {
        return waitForVisibility(navBarTittle, 20);
    }

    public WebElement getContactsButton() {
        return waitForClickability(contactsButton, 20);
    }

    public WebElement getCompaniesButton() {
        return waitForClickability(companiesButton, 20);
    }

    public WebElement getPropertiesButton() {
        return waitForClickability(propertiesButton, 20);
    }

    public WebElement getActivitiesButton() {
        return waitForClickability(activitiesButton, 20);
    }

    public WebElement getRequirementsButton() {
        return waitForClickability(requirementsButton, 20);
    }

    public WebElement getConnexionsButton() {
        return waitForClickability(connexionsButton, 20);
    }

    public WebElement getCalendarButton() {
        return waitForClickability(calendarButton, 20);
    }

    public WebElement getNotificationsButton() {
        return waitForClickability(notificationsButton, 20);
    }

    public WebElement getCallbacksButton() {
        return waitForClickability(callbacksButton, 20);
    }

    public WebElement getMyHubButton() {
        return waitForClickability(myHubButton, 20);
    }

    public WebElement getHubButton() {
        return waitForClickability(hubButton, 20);
    }
}
