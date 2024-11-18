package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyHubPage {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My hub\"]")
    private WebElement myHubNavigatorBarTitle;

    @FindBy(name = "Appointments")
    private WebElement appointmentsLabel;

    @FindBy(name = "chevron.down")
    private WebElement appointmentsChevronDown;

    @FindBy(name = "chevron.up")
    private WebElement appointmentsChevronUp;

    @FindBy(name = "Yesterday")
    private WebElement appointmentsYesterdayButton;

    @FindBy(name = "Today")
    private WebElement appointmentsTodayButton;

    @FindBy(name = "Tomorrow")
    private WebElement appointmentsTomorrowButton;

    @FindBy(name = "No items")
    private WebElement appointmentsNoItemsText;

    @FindBy(id = "")
    private WebElement recentlyViewedLabel;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"hub Uat\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]")
    private WebElement recentlyViewedScrollView;

    @FindBy(id = "Favourites")
    private WebElement favouritesLabel;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"hub Uat\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[2]")
    private WebElement favouritesScrollView;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My Callbacks\"]")
    private WebElement myCallbacksLabel;

    @FindBy(xpath = "//XCUIElementTypeImage[@name=\"chevron.down\"]")
    private WebElement myCallbacksChevronDown;

    @FindBy(xpath = "//XCUIElementTypeImage[@name=\"chevron.up\"]")
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
        PageFactory.initElements(driver, this);
    }

    public String getMyHubNavigatorBarTitle() {
        return myHubNavigatorBarTitle.getText();
    }

    public void expandAppointments() {
        appointmentsChevronDown.click();
    }

    public String getAppointmentsNoItemsText() {
        return appointmentsNoItemsText.getText();
    }

    public void selectAppointmentsToday() {
        appointmentsTodayButton.click();
    }

    public void selectAppointmentsYesterday() {
        appointmentsYesterdayButton.click();
    }

    public void selectAppointmentsTomorrow() {
        appointmentsTomorrowButton.click();
    }

    public boolean appointmentsTodayIsEnabled() {
        return appointmentsTodayButton.isEnabled();
    }

    public boolean appointmentsYesterdayIsEnabled() {
        return appointmentsYesterdayButton.isEnabled();
    }

    public boolean appointmentsTomorrowIsEnabled() {
        return appointmentsTomorrowButton.isEnabled();
    }

    public void collapseAppointments() {
        appointmentsChevronUp.click();
    }

    public void expandMyCallbacks() {
        myCallbacksChevronDown.click();
    }

    public String getCallbacksNoCallbacksText() {
        return callbacksNoCallbacksText.getText();
    }

    public void selectCallbacksActivity() {
        callbacksActivityButton.click();
    }

    public void selectCallbacksKeepInTouch() {
        callbacksKeepInTouchButton.click();
    }

    public void selectCallbacksNotInstructed() {
        callbacksNotInstructedButton.click();
    }

    public void selectCallbacksRequirement() {
        callbacksRequirementButton.click();
    }

    public void selectCallbacksToday() {
        callbacksTodayButton.click();
    }

    public void selectCallbacksUpcoming() {
        callbacksUpcomingButton.click();
    }

    public void selectCallbacksOverdue() {
        callbacksOverdueButton.click();
    }

    public void collapseCallbacks() {
        myCallbacksChevronUp.click();
    }

    public void openSelectionOptions() {
        selectionOptions.click();
    }

    public String getMyCallbacksTitle() {
        return myCallbacksLabel.getText();
    }

    public void exitSelection() {
        myCallbacksLabel.click();
    }

    public void openActivitySearch() {
        activitySearchLink.click();
    }

    public void openRequirementSearch() {
        requirementSearchLink.click();
    }

    public void openPropertySearch() {
        propertySearchLink.click();
    }

    public void openContactSearch() {
        contactSearchLink.click();
    }

    public void openCreateContact() {
        createContactLink.click();
    }

    public void openCreateConneXion() {
        createConneXionLink.click();
    }

    public void openTheViewLink() {
        theViewButton.click();
    }
}
