package org.knight.automation.pages.ios;

import com.sun.jna.platform.win32.COM.Wbemcli;
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

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Home_Button_RecentsViewAll\"]")
    private WebElement viewAllButton;

    @FindBy(id = "Recently Viewed")
    private WebElement recentlyViewedLabel;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"hub Uat\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]")
    private WebElement recentlyViewedScrollView;

    @FindBy(id = "Favourites")
    private WebElement favouritesLabel;

    @FindBy(id = "Redlap House, Redlap, Dartmouth, TQ6 0JR")
    private WebElement favouritesLastCard;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"hub Uat\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[2]")
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

    @FindBy(id = "the_view")
    private WebElement theViewButton;

    @FindBy(id = "wealth_report")
    private WebElement theWealthReportButton;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"hub Uat\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeScrollView")
    private WebElement horizontalScroll;

    @FindBy(xpath = "(//XCUIElementTypeOther[@name=\"Vertical scroll bar, 2 pages\"])[1]")
    private WebElement verticalScroll;

    @FindBy(id = "hub")
    private WebElement hubButton;

    public MyHubPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getMyHubLabel() {
        return waitForVisibility(myHubLabel, 20);
    }

    public WebElement getAppointmentsLabel() {
        return waitForVisibility(appointmentsLabel, 20);
    }

    public WebElement getAppointmentsChevronDown() {
        return waitForClickability(appointmentsChevronDown, 20);
    }

    public WebElement getAppointmentsChevronUp() {
        return waitForClickability(appointmentsChevronUp, 20);
    }

    public WebElement getAppointmentsYesterdayButton() {
        return waitForClickability(appointmentsYesterdayButton, 20);
    }

    public WebElement getAppointmentsTodayButton() {
        return waitForClickability(appointmentsTodayButton, 20);
    }

    public WebElement getAppointmentsTomorrowButton() {
        return waitForClickability(appointmentsTomorrowButton, 20);
    }

//    public WebElement getAppointmentsNoItemsText() {
//        return waitForVisibility(appointmentsNoItemsText, 20);
//    }
//
//    public WebElement getAppointmentMobileTestingText() {
//        return waitForVisibility(appointmentMobileTestingText, 20);
//    }
//
//    public WebElement getAppointmentsMobileBacklogText() {
//        return waitForVisibility(appointmentsMobileBacklogText, 20);
//    }

    public WebElement getFavouritesLabel() {
        return waitForVisibility(favouritesLabel, 20);
    }

    public WebElement getViewAllButton() {
        return waitForClickability(viewAllButton, 20);
    }

    public WebElement getRecentlyViewedLabel() {
        return waitForVisibility(recentlyViewedLabel, 20);
    }

    public WebElement getRecentlyViewedScrollView() {
        return waitForClickability(recentlyViewedScrollView, 20);
    }

    public WebElement getFavouritesLastCard() {
        return waitForClickability(favouritesLastCard, 20);
    }

    public WebElement getFavouritesScrollView() {
        return waitForClickability(favouritesScrollView, 20);
    }

    public WebElement getMyCallbacksLabel() {
        return waitForVisibility(myCallbacksLabel, 20);
    }

    public WebElement getMyCallbacksChevronDown() {
        return waitForClickability(myCallbacksChevronDown, 20);
    }

    public WebElement getMyCallbacksChevronUp() {
        return waitForClickability(myCallbacksChevronUp, 20);
    }

    public WebElement getSelectionOptions() {
        return waitForClickability(selectionOptions, 20);
    }

    public WebElement getCallbacksActivityButton() {
        return waitForClickability(callbacksActivityButton, 20);
    }

    public WebElement getCallbacksKeepInTouchButton() {
        return waitForClickability(callbacksKeepInTouchButton, 20);
    }

    public WebElement getCallbacksNotInstructedButton() {
        return waitForClickability(callbacksNotInstructedButton, 20);
    }

    public WebElement getCallbacksRequirementButton() {
        return waitForClickability(callbacksRequirementButton, 20);
    }

    public WebElement getCallbacksTodayButton() {
        return waitForClickability(callbacksTodayButton, 20);
    }

    public WebElement getCallbacksUpcomingButton() {
        return waitForClickability(callbacksUpcomingButton, 20);
    }

    public WebElement getCallbacksOverdueButton() {
        return waitForClickability(callbacksOverdueButton, 20);
    }

    public WebElement getCallbacksNoCallbacksText() {
        return waitForVisibility(callbacksNoCallbacksText, 20);
    }

    public WebElement getExploreHubMobileLabel() {
        return waitForVisibility(exploreHubMobileLabel, 20);
    }

    public WebElement getHubQuickLinksLabel() {
        return waitForVisibility(hubQuickLinksLabel, 20);
    }

    public WebElement getActivitySearchButton() {
        return waitForClickability(activitySearchButton, 20);
    }

    public WebElement getRequirementSearchButton() {
        return waitForClickability(requirementSearchButton, 20);
    }

    public WebElement getPropertySearchButton() {
        return waitForClickability(propertySearchButton, 20);
    }

    public WebElement getContactSearchButton() {
        return waitForClickability(contactSearchButton, 20);
    }

    public WebElement getCreateContactButton() {
        return waitForClickability(createContactButton, 20);
    }

    public WebElement getCreateConneXionButton() {
        return waitForClickability(createConneXionButton, 20);
    }

    public WebElement getKnightFrankLinksLabel() {
        return waitForVisibility(knightFrankLinksLabel, 20);
    }

    public WebElement getTheViewButton() {
        return waitForClickability(theViewButton, 20);
    }

    public WebElement getTheWealthReportButton() {
        return waitForClickability(theWealthReportButton, 20);
    }

    public WebElement getHorizontalScroll() {
        return waitForClickability(horizontalScroll, 20);
    }

    public WebElement getVerticalScroll() {
        return waitForClickability(verticalScroll, 20);
    }

    public WebElement getHubButton() {
        return waitForClickability(hubButton, 20);
    }
}
