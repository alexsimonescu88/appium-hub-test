package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My hub\"]")
    private WebElement myHubNavigatorBarTitle;

    @FindBy(id = "Appointments")
    private WebElement appointmentsLabel;

    @FindBy(xpath = "(//XCUIElementTypeImage[@name=\"chevron.down\"])[1]")
    private WebElement appointmentsChevronDown;

    @FindBy(xpath = "(//XCUIElementTypeImage[@name=\"chevron.up\"])[1]")
    private WebElement appointmentsChevronUp;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Yesterday\"]")
    private WebElement appointmentsYesterdayButton;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Today\"])[1]")
    private WebElement appointmentsTodayButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Tomorrow\"]")
    private WebElement appointmentsTomorrowButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"No items\"]")
    private WebElement appointmentsNoItemsText;

    @FindBy(id = "")
    private WebElement recentlyViewedLabel;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"hub Uat\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]")
    private WebElement recentlyViewedScrollView;

    @FindBy(id = "Favourites")
    private WebElement favouritesLabel;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"hub Uat\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[2]")
    private WebElement favouritesScrollView;

    @FindBy(id = "")
    private WebElement myCallbacksLabel;

    @FindBy(xpath = "(//XCUIElementTypeImage[@name=\"chevron.down\"])[2]")
    private WebElement myCallbacksChevronDown;

    @FindBy(xpath = "(//XCUIElementTypeImage[@name=\"chevron.up\"])[2]")
    private WebElement myCallbacksChevronUp;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Activity \"]")
    private WebElement callbacksActivityButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Keep In Touch\"]")
    private WebElement callbacksKeepInTouchButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Not Instructed\"]")
    private WebElement callbacksNotInstructedButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Requirement \"]")
    private WebElement callbacksRequirementButton;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Today\"])[2]")
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

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getMyHubNavigatorBarTitle() {
        return myHubNavigatorBarTitle.getText();
    }

    public void expandAppointment() {
        appointmentsChevronDown.click();
    }

    public void collapseAppointment() {
        appointmentsChevronUp.click();
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
}
