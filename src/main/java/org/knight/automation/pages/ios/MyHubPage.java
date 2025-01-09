package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyHubPage extends BasePage {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My hub\"]")
    private WebElement myHubLabel;

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

//    @FindBy(id = "No items")
//    private WebElement appointmentsNoItemsText;
//
//    @FindBy(id = "Mobile testing check in ")
//    private WebElement appointmentMobileTestingText;
//
//    @FindBy(id = "Mobile Backlog Review")
//    private WebElement appointmentsMobileBacklogText;

    @FindBy(id = "Favourites")
    private WebElement favouritesLabel;

    @FindBy(id = "Redlap House, Redlap, Dartmouth, TQ6 0JR")
    private WebElement favouritesLastCard;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"hub Uat\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeScrollView")
    private WebElement favouritesScrollView;

    @FindBy(id = "My Callbacks")
    private WebElement myCallbacksLabel;

    @FindBy(xpath = "(//XCUIElementTypeImage[@name=\"chevron.down\"])[2]")
    private WebElement myCallbacksChevronDown;

    @FindBy(id = "chevron.up")
    private WebElement myCallbacksChevronUp;

    @FindBy(id = "chevron.right")
    private WebElement selectionOptions;

    @FindBy(id = "Activity ")
    private WebElement callbacksActivityButton;

    @FindBy(id = "Keep In Touch")
    private WebElement callbacksKeepInTouchButton;

    @FindBy(id = "Not Instructed")
    private WebElement callbacksNotInstructedButton;

    @FindBy(id = "Requirement ")
    private WebElement callbacksRequirementButton;

    @FindBy(id = "Today")
    private WebElement callbacksTodayButton;

    @FindBy(id = "Upcoming")
    private WebElement callbacksUpcomingButton;

    @FindBy(id = "Overdue")
    private WebElement callbacksOverdueButton;

    @FindBy(id = "No Callbacks")
    private WebElement callbacksNoCallbacksText;

    @FindBy(id = "Explore hub Mobile")
    private WebElement exploreHubMobileLabel;

    @FindBy(id = "hub Quick Links")
    private WebElement hubQuickLinksLabel;

    @FindBy(id = "Home_Button_QuickLinkActivity")
    private WebElement activitySearchButton;

    @FindBy(id = "Home_Button_QuickLinkRequirement")
    private WebElement requirementSearchButton;

    @FindBy(id = "Home_Button_QuickLinkProperty")
    private WebElement propertySearchButton;

    @FindBy(id = "Home_Button_QuickLinkContact")
    private WebElement contactSearchButton;

    @FindBy(id = "Home_Button_QuickLinkCreateContact")
    private WebElement createContactButton;

    @FindBy(id = "Home_Button_QuickLinkCreateConnexion")
    private WebElement createConneXionButton;

    @FindBy(id = "Knight Frank Links")
    private WebElement knightFrankLinksLabel;

    @FindBy(id = "Home_Button_LinksTheView")
    private WebElement theViewButton;

    @FindBy(id = "Home_Button_LinksWealthReport")
    private WebElement theWealthReportButton;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"hub Uat\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeScrollView")
    private WebElement horizontalScroll;

    @FindBy(xpath = "(//XCUIElementTypeOther[@name=\"Vertical scroll bar, 2 pages\"])[2]")
    private WebElement verticalScroll;

    public MyHubPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getMyHubLabel() {
        return waitForVisibility(myHubLabel, 10);
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

//    public WebElement getAppointmentsNoItemsText() {
//        return waitForVisibility(appointmentsNoItemsText, 10);
//    }
//
//    public WebElement getAppointmentMobileTestingText() {
//        return waitForVisibility(appointmentMobileTestingText, 10);
//    }
//
//    public WebElement getAppointmentsMobileBacklogText() {
//        return waitForVisibility(appointmentsMobileBacklogText, 10);
//    }

    public WebElement getFavouritesLabel() {
        return waitForVisibility(favouritesLabel, 10);
    }

    public WebElement getFavouritesLastCard() {
        return waitForClickability(favouritesLastCard, 10);
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
        return waitForClickability(selectionOptions, 10);
    }

    public WebElement getCallbacksActivityButton() {
        return waitForClickability(callbacksActivityButton, 10);
    }

    public WebElement getCallbacksKeepInTouchButton() {
        return waitForClickability(callbacksKeepInTouchButton, 10);
    }

    public WebElement getCallbacksNotInstructedButton() {
        return waitForClickability(callbacksNotInstructedButton, 10);
    }

    public WebElement getCallbacksRequirementButton() {
        return waitForClickability(callbacksRequirementButton, 10);
    }

    public WebElement getCallbacksTodayButton() {
        return waitForClickability(callbacksTodayButton, 10);
    }

    public WebElement getCallbacksUpcomingButton() {
        return waitForClickability(callbacksUpcomingButton, 10);
    }

    public WebElement getCallbacksOverdueButton() {
        return waitForClickability(callbacksOverdueButton, 10);
    }

    public WebElement getCallbacksNoCallbacksText() {
        return waitForVisibility(callbacksNoCallbacksText, 10);
    }

    public WebElement getExploreHubMobileLabel() {
        return waitForVisibility(exploreHubMobileLabel, 10);
    }

    public WebElement getHubQuickLinksLabel() {
        return waitForVisibility(hubQuickLinksLabel, 10);
    }

    public WebElement getActivitySearchButton() {
        return waitForClickability(activitySearchButton, 10);
    }

    public WebElement getRequirementSearchButton() {
        return waitForClickability(requirementSearchButton, 10);
    }

    public WebElement getPropertySearchButton() {
        return waitForClickability(propertySearchButton, 10);
    }

    public WebElement getContactSearchButton() {
        return waitForClickability(contactSearchButton, 10);
    }

    public WebElement getCreateContactButton() {
        return waitForClickability(createContactButton, 10);
    }

    public WebElement getCreateConneXionButton() {
        return waitForClickability(createConneXionButton, 10);
    }

    public WebElement getKnightFrankLinksLabel() {
        return waitForVisibility(knightFrankLinksLabel, 10);
    }

    public WebElement getTheViewButton() {
        return waitForClickability(theViewButton, 10);
    }

    public WebElement getTheWealthReportButton() {
        return waitForClickability(theWealthReportButton, 10);
    }

    public WebElement getHorizontalScroll() {
        return waitForClickability(horizontalScroll, 10);
    }

    public WebElement getVerticalScroll() {
        return waitForClickability(verticalScroll, 10);
    }
}
