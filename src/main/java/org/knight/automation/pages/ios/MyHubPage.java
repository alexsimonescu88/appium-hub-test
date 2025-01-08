package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyHubPage extends BasePage {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My hub\"]")
    private WebElement myHubNavigatorBarTitle;

    @FindBy(id = "Appointments")
    private WebElement appointmentsLabel;

    @FindBy(xpath = "(//XCUIElementTypeImage[@name=\"chevron.down\"])[1]")
    private WebElement appointmentsChevronDown;

    @FindBy(id = "chevron.up")
    private WebElement appointmentsChevronUp;

    @FindBy(id = "Yesterday")
    private WebElement appointmentsYesterdayButton;

    @FindBy(id = "Today")
    private WebElement appointmentsTodayButton;

    @FindBy(id = "Tomorrow")
    private WebElement appointmentsTomorrowButton;

    @FindBy(id = "No items")
    private WebElement appointmentsNoItemsText;

    @FindBy(id = "Mobile testing check in ")
    private WebElement appointmentMobileTestingText;

    @FindBy(id = "Mobile Backlog Review")
    private WebElement appointmentsMobileBacklogText;

    @FindBy(id = "Favourites")
    private WebElement favouritesLabel;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"hub Uat\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[2]")
    private WebElement favouritesScrollView;

    @FindBy(id = "My Callbacks")
    private WebElement myCallbacksLabel;

    @FindBy(id = "chevron.down")
    private WebElement myCallbacksChevronDown;

    @FindBy(id = "chevron.up")
    private WebElement myCallbacksChevronUp;

    @FindBy(xpath = "//XCUIElementTypeImage[@name=\"chevron.right\"]")
    private WebElement selectionOptions;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Activity \"]")
    private WebElement callbacksActivityButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Keep In Touch\"]")
    private WebElement callbacksKeepInTouchButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Not Instructed\"]")
    private WebElement callbacksNotInstructedButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Requirement\"]")
    private WebElement callbacksRequirementButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Today\"]")
    private WebElement callbacksTodayButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Upcoming\"]")
    private WebElement callbacksUpcomingButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Overdue\"]")
    private WebElement callbacksOverdueButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"No Callbacks\"]")
    private WebElement callbacksNoCallbacksText;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Explore hub Mobile\"]")
    private WebElement exploreHubMobileText;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"hub Quick Links\"]")
    private WebElement hubQuickLinksText;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Activity Search\"]")
    private WebElement activitySearchLink;

    @FindBy(id = "Requirement Search")
    private WebElement requirementSearchLink;

    @FindBy(id = "Property Search")
    private WebElement propertySearchLink;

    @FindBy(id = "Contact Search")
    private WebElement contactSearchLink;

    @FindBy(id = "Create a Contact")
    private WebElement createContactLink;

    @FindBy(id = "Create a ConneXion")
    private WebElement createConneXionLink;

    @FindBy(id = "Knight Frank Links")
    private WebElement knightFrankLinksText;

    @FindBy(id = "the_view")
    private WebElement theViewButton;

    @FindBy(id = "wealth_report")
    private WebElement theWealthReportButton;

    public MyHubPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getMyHubNavigatorBarTitle() {
        return waitForVisibility(myHubNavigatorBarTitle, 10);
    }

    public WebElement getAppointmentsLabel() {
        return waitForVisibility(appointmentsLabel, 10);
    }

    public WebElement getAppointmentsChevronDown() {
        return waitForClickability(appointmentsChevronDown, 10);
    }

    public WebElement getAppointmentsChevronUp() {
        return waitForClickability(appointmentsChevronUp, 10);
    }

    public WebElement getAppointmentsYesterdayButton() {
        return waitForClickability(appointmentsYesterdayButton, 10);
    }

    public WebElement getAppointmentsTodayButton() {
        return waitForClickability(appointmentsTodayButton, 10);
    }

    public WebElement getAppointmentsTomorrowButton() {
        return waitForClickability(appointmentsTomorrowButton, 10);
    }

    public WebElement getAppointmentsNoItemsText() {
        return waitForVisibility(appointmentsNoItemsText, 10);
    }

    public WebElement getAppointmentMobileTestingText() {
        return waitForVisibility(appointmentMobileTestingText, 10);
    }

    public WebElement getAppointmentsMobileBacklogText() {
        return waitForVisibility(appointmentsMobileBacklogText, 10);
    }

    public WebElement getFavouritesLabel() {
        return waitForVisibility(favouritesLabel, 10);
    }

    public WebElement getFavouritesScrollView() {
        return waitForClickability(favouritesScrollView, 10);
    }

    public WebElement getMyCallbacksLabel() {
        return waitForVisibility(myCallbacksLabel, 10);
    }

    public WebElement getMyCallbacksChevronDown() {
        return waitForClickability(myCallbacksChevronDown, 10);
    }

    public WebElement getMyCallbacksChevronUp() {
        return waitForClickability(myCallbacksChevronUp, 10);
    }

    public WebElement getSelectionOptions() {
        return selectionOptions;
    }

    public WebElement getCallbacksActivityButton() {
        return callbacksActivityButton;
    }

    public WebElement getCallbacksKeepInTouchButton() {
        return callbacksKeepInTouchButton;
    }

    public WebElement getCallbacksNotInstructedButton() {
        return callbacksNotInstructedButton;
    }

    public WebElement getCallbacksRequirementButton() {
        return callbacksRequirementButton;
    }

    public WebElement getCallbacksTodayButton() {
        return callbacksTodayButton;
    }

    public WebElement getCallbacksUpcomingButton() {
        return callbacksUpcomingButton;
    }

    public WebElement getCallbacksOverdueButton() {
        return callbacksOverdueButton;
    }

    public WebElement getCallbacksNoCallbacksText() {
        return callbacksNoCallbacksText;
    }

    public WebElement getExploreHubMobileText() {
        return exploreHubMobileText;
    }

    public WebElement getHubQuickLinksText() {
        return hubQuickLinksText;
    }

    public WebElement getActivitySearchLink() {
        return activitySearchLink;
    }

    public WebElement getRequirementSearchLink() {
        return requirementSearchLink;
    }

    public WebElement getPropertySearchLink() {
        return propertySearchLink;
    }

    public WebElement getContactSearchLink() {
        return contactSearchLink;
    }

    public WebElement getCreateContactLink() {
        return createContactLink;
    }

    public WebElement getCreateConneXionLink() {
        return createConneXionLink;
    }

    public WebElement getKnightFrankLinksText() {
        return knightFrankLinksText;
    }

    public WebElement getTheViewButton() {
        return theViewButton;
    }

    public WebElement getTheWealthReportButton() {
        return theWealthReportButton;
    }
}
