package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HubCallbacksPage extends BasePage {

    @FindBy(id = "hub")
    private WebElement hubButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Callbacks\"]")
    private WebElement callbacksLabel;

    @FindBy(id = "Team")
    private WebElement teamButton;

    @FindBy(id = "My")
    private WebElement myButton;

    @FindBy(id = "Activity Callbacks")
    private WebElement activityCallbacksLabel;

    @FindBy(xpath = "(//XCUIElementTypeImage[@name=\"chevron.down\"])[1]")
    private WebElement activityCallbacksChevronDown;

    @FindBy(id = "Requirement Callbacks")
    private WebElement requirementCallbacksLabel;

    @FindBy(xpath = "(//XCUIElementTypeImage[@name=\"chevron.down\"])[2]")
    private WebElement requirementCallbacksChevronDown;

    @FindBy(id = "Not Instructed Callbacks")
    private WebElement notInstructedCallbacksLabel;

    @FindBy(xpath = "(//XCUIElementTypeImage[@name=\"chevron.down\"])[3]")
    private WebElement notInstructedCallbacksChevronDown;

    @FindBy(id = "Keep In Touch")
    private WebElement keepInTouchCallbacksLabel;

    @FindBy(xpath = "(//XCUIElementTypeImage[@name=\"chevron.down\"])[4]")
    private WebElement keepInTouchCallbacksChevronDown;

    @FindBy(id = "chevron.up")
    private WebElement chevronUp;

    @FindBy(id = "Today")
    private WebElement todayButton;

    @FindBy(id = "Upcoming")
    private WebElement upcomingButton;

    @FindBy(id = "Overdue")
    private WebElement overdueButton;

    @FindBy(id = "No Callbacks")
    private WebElement noCallbacksLabel;

    @FindBy(id = "View All")
    private WebElement viewAllButton;

    public HubCallbacksPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getHubButton() {
        return waitForClickability(hubButton, 20);
    }

    public WebElement getCallbacksLabel() {
        return waitForVisibility(callbacksLabel, 20);
    }

    public WebElement getTeamButton() {
        return waitForClickability(teamButton, 20);
    }

    public WebElement getMyButton() {
        return waitForClickability(myButton, 20);
    }

    public WebElement getActivityCallbacksLabel() {
        return waitForVisibility(activityCallbacksLabel, 20);
    }

    public WebElement getActivityCallbacksChevronDown() {
        return waitForClickability(activityCallbacksChevronDown, 20);
    }

    public WebElement getRequirementCallbacksLabel() {
        return waitForVisibility(requirementCallbacksLabel, 20);
    }

    public WebElement getRequirementCallbacksChevronDown() {
        return waitForClickability(requirementCallbacksChevronDown, 20);
    }

    public WebElement getNotInstructedCallbacksLabel() {
        return waitForVisibility(notInstructedCallbacksLabel, 20);
    }

    public WebElement getNotInstructedCallbacksChevronDown() {
        return waitForClickability(notInstructedCallbacksChevronDown, 20);
    }

    public WebElement getKeepInTouchCallbacksLabel() {
        return waitForVisibility(keepInTouchCallbacksLabel, 20);
    }

    public WebElement getKeepInTouchCallbacksChevronDown() {
        return waitForClickability(keepInTouchCallbacksChevronDown, 20);
    }

    public WebElement getChevronUp() {
        return waitForClickability(chevronUp, 20);
    }

    public WebElement getTodayButton() {
        return waitForClickability(todayButton, 20);
    }

    public WebElement getUpcomingButton() {
        return waitForClickability(upcomingButton, 20);
    }

    public WebElement getOverdueButton() {
        return waitForClickability(overdueButton, 20);
    }

    public WebElement getNoCallbacksLabel() {
        return waitForVisibility(noCallbacksLabel, 20);
    }

    public WebElement getViewAllButton() {
        return waitForClickability(viewAllButton, 20);
    }
}
