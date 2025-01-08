package org.knight.automation.tests.ios;

import org.knight.automation.pages.ios.MyHubPage;
import org.knight.automation.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyHubPageTests extends BaseTest {

    @Test
    public void testAccessToAppointmentsYesterday_shouldSuccessfullyExpandAppointmentsYesterday() {
        MyHubPage myHubPage = new MyHubPage(driver);

        myHubPage.getAppointmentsChevronDown().click();

        Assert.assertTrue(myHubPage.getAppointmentsTodayButton().isEnabled());

        String appointmentsMobileBacklogText = myHubPage.getAppointmentsMobileBacklogText().getText();
        Assert.assertEquals(appointmentsMobileBacklogText, "Mobile Backlog Review");

        myHubPage.getAppointmentsYesterdayButton().click();

        String appointmentsMobileTestingText = myHubPage.getAppointmentMobileTestingText().getText();
        Assert.assertTrue(myHubPage.getAppointmentsYesterdayButton().isEnabled());
        Assert.assertEquals(appointmentsMobileTestingText, "Mobile testing check in ");

        myHubPage.getAppointmentsTodayButton().click();
        Assert.assertTrue(myHubPage.getAppointmentsTodayButton().isEnabled());

        myHubPage.getAppointmentsChevronUp().click();
        Assert.assertTrue(myHubPage.getAppointmentsChevronDown().isEnabled());
    }

    @Test
    public void testAccessToAppointmentsToday_shouldSuccessfullyExpandAppointmentsToday() {
        MyHubPage myHubPage = new MyHubPage(driver);

        myHubPage.getAppointmentsChevronDown().click();
        Assert.assertTrue(myHubPage.getAppointmentsChevronUp().isEnabled());
        Assert.assertTrue(myHubPage.getAppointmentsTodayButton().isEnabled());

        String appointmentsMobileBacklogText = myHubPage.getAppointmentsMobileBacklogText().getText();
        Assert.assertEquals(appointmentsMobileBacklogText, "Mobile Backlog Review");

        myHubPage.getAppointmentsChevronUp().click();
        Assert.assertTrue(myHubPage.getAppointmentsChevronDown().isEnabled());
    }

    @Test
    public void testAccessToAppointmentsTomorrow_shouldSuccessfullyExpandAppointmentsTomorrow() {
        MyHubPage myHubPage = new MyHubPage(driver);

        myHubPage.getAppointmentsChevronDown().click();
        Assert.assertTrue(myHubPage.getAppointmentsTodayButton().isEnabled());

        myHubPage.getAppointmentsTomorrowButton().click();
        Assert.assertTrue(myHubPage.getAppointmentsTomorrowButton().isEnabled());

        String appointmentsNoItemsText = myHubPage.getAppointmentsNoItemsText().getText();
        Assert.assertEquals(appointmentsNoItemsText, "No items");

        myHubPage.getAppointmentsTodayButton().click();
        Assert.assertTrue(myHubPage.getAppointmentsTodayButton().isEnabled());

        myHubPage.getAppointmentsChevronUp().click();
        Assert.assertTrue(myHubPage.getAppointmentsChevronDown().isEnabled());
    }
//
//
//    @Test
//    public void testAccessToActivityPage_ShouldSuccessfullyOpenActivityPage() {
//        MyHubPage myHubPage = new MyHubPage(driver);
//        ActivitySearchPage activitySearchPage = new ActivitySearchPage(driver);
//
//        myHubPage.openActivitySearch();
//
//        String searchTitle = activitySearchPage.getSearchTitle();
//        Assert.assertEquals(searchTitle, "Search");
//
//        activitySearchPage.navigateBackToMyHubPage();
//
//        String myHubNavigatorBarTitle = myHubPage.getMyHubNavigatorBarTitle().getText();
//        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");
//
//    }
//
//    @Test
//    public void testAccessToRequirementsPage_ShouldSuccessfullyOpenRequirementsPage() {
//        MyHubPage myHubPage = new MyHubPage(driver);
//        RequirementsSearchPage requirementsSearchPage = new RequirementsSearchPage(driver);
//
//        myHubPage.openRequirementSearch();
//
//        String mySearchRequirementsText = requirementsSearchPage.getNoRequirementsFoundText();
//        Assert.assertEquals(mySearchRequirementsText, "No Requirements Found");
//
//        requirementsSearchPage.navigateBackToMyHubPage();
//
//        String myHubNavigatorBarTitle = myHubPage.getMyHubNavigatorBarTitle().getText();
//        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");
//    }
//
//    @Test
//    public void testAccessToPropertyPage_ShouldSuccessfullyOpenPropertyPage() {
//        MyHubPage myHubPage = new MyHubPage(driver);
//        PropertySearchPage propertySearchPage = new PropertySearchPage(driver);
//
//        myHubPage.openPropertySearch();
//
//        String mySearchPropertiesMessage = propertySearchPage.getMessageFromSearchProperties();
//        Assert.assertEquals(mySearchPropertiesMessage, "Enter text to search properties.");
//
//        propertySearchPage.navigateBackToMyHubPage();
//
//        String myHubNavigatorBarTitle = myHubPage.getMyHubNavigatorBarTitle().getText();
//        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");
//    }
//
//    @Test
//    @Ignore
//    public void testAccessToContactSearchPage_ShouldSuccessfullyOpenContactSearchPage() {
//        MyHubPage myHubPage = new MyHubPage(driver);
//        ContactSearchPage contactSearchPage = new ContactSearchPage(driver);
//
//        myHubPage.openContactSearch();
//        contactSearchPage.selectMyContacts();
//
//        String myContactsTitle = contactSearchPage.getMyContactsTitle();
//        Assert.assertEquals(myContactsTitle, "My contacts");
//
//        contactSearchPage.navigateBackToMyHubPage();
//
//        String myHubNavigatorBarTitle = myHubPage.getMyHubNavigatorBarTitle().getText();
//        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");
//    }
//
//    @Test
//    public void testAccessToCreateContactPage_ShouldSuccessfullyOpenCreateContactPage() {
//        MyHubPage myHubPage = new MyHubPage(driver);
//        CreateContactPage createContactPage = new CreateContactPage(driver);
//
//        myHubPage.openCreateContact();
//
//        String searchTitle = createContactPage.getSearchTitleText();
//        Assert.assertEquals(searchTitle, "Search");
//
//        String duplicateCheckText = createContactPage.getDuplicateCheckText();
//        Assert.assertEquals(duplicateCheckText, "Duplicate check");
//
//        createContactPage.navigateBackToMyHubPage();
//
//        String myHubNavigatorBarTitle = myHubPage.getMyHubNavigatorBarTitle().getText();
//        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");
//    }
//
//    @Test
//    @Ignore
//    public void testAccessToCreateConneXionPage_ShouldSuccessfullyOpenCreateConneXionPageWithAllContactsSelected() {
//        MyHubPage myHubPage = new MyHubPage(driver);
//        CreateConneXionPage createConneXion = new CreateConneXionPage(driver);
//
//        myHubPage.openCreateConneXion();
//
//        createConneXion.selectAllContacts();
//
//        String allContactsTitle = createConneXion.getAllContactsTitle();
//        Assert.assertEquals(allContactsTitle, "All contacts");
//
//        createConneXion.selectMyContacts();
//        createConneXion.navigateBackToMyHubPage();
//
//        String myHubNavigatorBarTitle = myHubPage.getMyHubNavigatorBarTitle().getText();
//        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");
//    }
//
//    @Test
//    @Ignore
//    public void testAccessToCreateConneXionPage_ShouldSuccessfullyOpenCreateConneXionPageAndASelectMyContacts() {
//        MyHubPage myHubPage = new MyHubPage(driver);
//        CreateConneXionPage createConneXion = new CreateConneXionPage(driver);
//
//        myHubPage.openCreateConneXion();
//        createConneXion.selectMyContacts();
//
//        String myContactsTitle = createConneXion.getMyContactsTitle();
//        Assert.assertEquals(myContactsTitle, "My contacts");
//
//        createConneXion.navigateBackToMyHubPage();
//
//        String myHubNavigatorBarTitle = myHubPage.getMyHubNavigatorBarTitle().getText();
//        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");
//    }
//
//    @Test
//    @Ignore
//    public void testAccessToTheViewLink_ShouldSuccessfullyOpenTheViewLink() throws MalformedURLException {
//        MyHubPage myHubPage = new MyHubPage(driver);
//        LoginPage loginPage = new LoginPage(driver);
//
//        myHubPage.openTheViewLink();
//
//        URL safariDriverURL = URI.create("http://localhost:4723").toURL();
//        SafariOptions safariOptions = new SafariOptions()
//                .amend("platformName", "iOS")
//                .amend("appium:udid", "D01C27B5-B82F-431E-A572-5D2279579A95")
//                .amend("appium:automationName", "XCUITest")
//                .amend("appium:includeSafariInWebviews", true)
//                .amend("appium:newCommandTimeout", 3600)
//                .amend("appium:connectHardwareKeyboard", true);
//        WebDriver safariDriver = new SafariDriver(safariDriverURL, safariOptions);
//        try {
//            // Initialize TheViewPage with SafariDriver
//            TheViewPage theViewPage = new TheViewPage(safariDriver);
//
//            // Navigate to the web link
//            safariDriver.get("https://www.knightfrank.com/theview");
//
//
//            // Perform browser-specific actions if needed
//            // ...
//        } finally {
//            // Ensure the SafariDriver quits after use
//            safariDriver.quit();
//        }
//        String loginTitle = "";
//
//        try {
//            loginTitle = loginPage.getEnterPinLabelText();
//        } catch (Exception e) {
//            e.getMessage();
//        }
//
//        if (loginTitle.isEmpty()) {
//            loginPage.enterPin("200188");
//            loginPage.clickLoginButton();
//        }
//
//        String myHubNavigatorBarTitle = myHubPage.getMyHubNavigatorBarTitle().getText();
//        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");
//    }
//
//    @Test
//    @Ignore
//    public void testAccessToMyCallbacksActivityToday_shouldSuccessfullyExpandMyCallbacksActivityToday() {
//        MyHubPage myHubPage = new MyHubPage(driver);
//
//        myHubPage.expandMyCallbacks();
//
//        myHubPage.openSelectionOptions();
//        myHubPage.selectCallbacksKeepInTouch();
//
//        myHubPage.selectCallbacksToday();
//        String noCallbacksText = myHubPage.getCallbacksNoCallbacksText();
//        Assert.assertEquals(noCallbacksText, "No Callbacks");
//
//        myHubPage.selectCallbacksUpcoming();
//        Assert.assertEquals(noCallbacksText, "No Callbacks");
//
//        myHubPage.selectCallbacksOverdue();
//        Assert.assertEquals(noCallbacksText, "No Callbacks");
//
//        myHubPage.openSelectionOptions();
//        myHubPage.selectCallbacksActivity();
//        myHubPage.selectCallbacksToday();
//
//        myHubPage.collapseCallbacks();
//
//        myHubPage.openSelectionOptions();
//        myHubPage.selectCallbacksNotInstructed();
//
//        myHubPage.selectCallbacksToday();
//        Assert.assertEquals(noCallbacksText, "No Callbacks");
//
//        myHubPage.selectCallbacksUpcoming();
//        Assert.assertEquals(noCallbacksText, "No Callbacks");
//
//        myHubPage.selectCallbacksOverdue();
//        Assert.assertEquals(noCallbacksText, "No Callbacks");
//
//        myHubPage.openSelectionOptions();
//        myHubPage.selectCallbacksActivity();
//        myHubPage.selectCallbacksToday();
//
//        myHubPage.collapseCallbacks();
//
//        myHubPage.openSelectionOptions();
//        myHubPage.selectCallbacksRequirement();
//
//        myHubPage.selectCallbacksToday();
//        Assert.assertEquals(noCallbacksText, "No Callbacks");
//
//        myHubPage.selectCallbacksUpcoming();
//        Assert.assertEquals(noCallbacksText, "No Callbacks");
//
//        myHubPage.selectCallbacksOverdue();
//        Assert.assertEquals(noCallbacksText, "No Callbacks");
//
//        myHubPage.openSelectionOptions();
//        myHubPage.selectCallbacksActivity();
//        myHubPage.selectCallbacksToday();
//
//        myHubPage.collapseCallbacks();
//
//        String myHubNavigatorBarTitle = myHubPage.getMyHubNavigatorBarTitle().getText();
//        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");
//    }
}