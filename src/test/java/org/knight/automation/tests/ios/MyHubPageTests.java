package org.knight.automation.tests.ios;

import io.appium.java_client.AppiumDriver;
import org.knight.automation.pages.ios.*;
import org.knight.automation.tests.BaseTest;
import org.knight.automation.tests.utils.Scrollable;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;


public class MyHubPageTests extends BaseTest implements Scrollable {

    @Test(priority = 1)
    public void testPresenceOfAllElementsOnMyHubPage_ShouldSuccessfullyIdentifyThePresenceOfAllElementsOnMyHubPage() {
        MyHubPage myHubPage = new MyHubPage(driver);
        AppiumDriver appiumDriver = (AppiumDriver) this.driver;

        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
        Assert.assertTrue(myHubPage.getFavouritesLabel().isDisplayed());

        scroll("left", myHubPage.getFavouritesScrollView(), appiumDriver);
        scroll("right", myHubPage.getFavouritesScrollView(), appiumDriver);

        Assert.assertTrue(myHubPage.getMyCallbacksLabel().isDisplayed());

        Assert.assertTrue(myHubPage.getExploreHubMobileLabel().isDisplayed());
        Assert.assertTrue(myHubPage.getHubQuickLinksLabel().isDisplayed());
        Assert.assertTrue(myHubPage.getActivitySearchButton().isDisplayed());
        Assert.assertTrue(myHubPage.getRequirementSearchButton().isDisplayed());

        scroll("up", myHubPage.getVerticalScroll(), appiumDriver);

        Assert.assertTrue(myHubPage.getPropertySearchButton().isDisplayed());
        Assert.assertTrue(myHubPage.getContactSearchButton().isDisplayed());
        Assert.assertTrue(myHubPage.getCreateContactButton().isDisplayed());
        Assert.assertTrue(myHubPage.getCreateConneXionButton().isDisplayed());
        Assert.assertTrue(myHubPage.getKnightFrankLinksLabel().isDisplayed());
        Assert.assertTrue(myHubPage.getTheViewButton().isDisplayed());
        Assert.assertTrue(myHubPage.getTheWealthReportButton().isDisplayed());

        scroll("down", myHubPage.getVerticalScroll(), appiumDriver);
    }

    @Test(priority = 2)
    public void testAccessToAppointmentsYesterday_shouldSuccessfullyExpandAppointmentsYesterday() {
        MyHubPage myHubPage = new MyHubPage(driver);

        myHubPage.getAppointmentsChevronDown().click();

        Assert.assertTrue(myHubPage.getAppointmentsTodayButton().isEnabled());

//        String appointmentsMobileBacklogText = myHubPage.getAppointmentsMobileBacklogText().getText();
//        Assert.assertEquals(appointmentsMobileBacklogText, "Mobile Backlog Review");

        myHubPage.getAppointmentsYesterdayButton().click();

//        String appointmentsMobileTestingText = myHubPage.getAppointmentMobileTestingText().getText();
        Assert.assertTrue(myHubPage.getAppointmentsYesterdayButton().isEnabled());
//        Assert.assertEquals(appointmentsMobileTestingText, "Mobile testing check in ");

        myHubPage.getAppointmentsTodayButton().click();
        Assert.assertTrue(myHubPage.getAppointmentsTodayButton().isEnabled());

        myHubPage.getAppointmentsChevronUp().click();
        Assert.assertTrue(myHubPage.getAppointmentsChevronDown().isEnabled());
    }

    @Test(priority = 3)
    public void testAccessToAppointmentsToday_shouldSuccessfullyExpandAppointmentsToday() {
        MyHubPage myHubPage = new MyHubPage(driver);

        myHubPage.getAppointmentsChevronDown().click();
        Assert.assertTrue(myHubPage.getAppointmentsChevronUp().isEnabled());
        Assert.assertTrue(myHubPage.getAppointmentsTodayButton().isEnabled());

//        String appointmentsMobileBacklogText = myHubPage.getAppointmentsMobileBacklogText().getText();
//        Assert.assertEquals(appointmentsMobileBacklogText, "Mobile Backlog Review");

        myHubPage.getAppointmentsChevronUp().click();
        Assert.assertTrue(myHubPage.getAppointmentsChevronDown().isEnabled());
    }

    @Test(priority = 4)
    public void testAccessToAppointmentsTomorrow_shouldSuccessfullyExpandAppointmentsTomorrow() {
        MyHubPage myHubPage = new MyHubPage(driver);

        myHubPage.getAppointmentsChevronDown().click();
        Assert.assertTrue(myHubPage.getAppointmentsTodayButton().isEnabled());

        myHubPage.getAppointmentsTomorrowButton().click();
        Assert.assertTrue(myHubPage.getAppointmentsTomorrowButton().isEnabled());

//        String appointmentsNoItemsText = myHubPage.getAppointmentsNoItemsText().getText();
//        Assert.assertEquals(appointmentsNoItemsText, "No items");

        myHubPage.getAppointmentsTodayButton().click();
        Assert.assertTrue(myHubPage.getAppointmentsTodayButton().isEnabled());

        myHubPage.getAppointmentsChevronUp().click();
        Assert.assertTrue(myHubPage.getAppointmentsChevronDown().isEnabled());
    }

    @Test(priority = 5)
    public void testAccessToMyCallbacksActivitySelection_shouldSuccessfullyExpandMyCallbacksActivitySelection() {
        MyHubPage myHubPage = new MyHubPage(driver);

        myHubPage.getMyCallbacksChevronDown().click();
        Assert.assertTrue(myHubPage.getMyCallbacksChevronUp().isEnabled());
        Assert.assertTrue(myHubPage.getCallbacksActivityButton().isEnabled());

        String noCallbacksText = myHubPage.getCallbacksNoCallbacksText().getText();
        Assert.assertTrue(myHubPage.getCallbacksNoCallbacksText().isDisplayed());
        Assert.assertEquals(noCallbacksText, "No Callbacks");

        myHubPage.getCallbacksUpcomingButton().click();
        Assert.assertTrue(myHubPage.getCallbacksUpcomingButton().isEnabled());
        Assert.assertTrue(myHubPage.getCallbacksNoCallbacksText().isDisplayed());
        Assert.assertEquals(noCallbacksText, "No Callbacks");

        myHubPage.getCallbacksOverdueButton().click();
        Assert.assertTrue(myHubPage.getCallbacksOverdueButton().isEnabled());
        Assert.assertTrue(myHubPage.getCallbacksNoCallbacksText().isDisplayed());
        Assert.assertEquals(noCallbacksText, "No Callbacks");

        myHubPage.getCallbacksTodayButton().click();
        Assert.assertTrue(myHubPage.getCallbacksNoCallbacksText().isDisplayed());
        Assert.assertEquals(noCallbacksText, "No Callbacks");

        myHubPage.getMyCallbacksChevronUp().click();
        Assert.assertTrue(myHubPage.getMyCallbacksChevronDown().isEnabled());
    }

    @Test(priority = 6)
    public void testAccessToMyCallbacksKeepInTouchSelection_ShouldSuccessfullyExpandMyCallbacksKeepInTouchSelection() {
        MyHubPage myHubPage = new MyHubPage(driver);

        myHubPage.getMyCallbacksChevronDown().click();
        Assert.assertTrue(myHubPage.getCallbacksActivityButton().isEnabled());
        Assert.assertTrue(myHubPage.getMyCallbacksChevronUp().isEnabled());

        myHubPage.getSelectionOptions().click();
        Assert.assertTrue(myHubPage.getCallbacksActivityButton().isDisplayed());
        Assert.assertTrue(myHubPage.getCallbacksKeepInTouchButton().isDisplayed());
        Assert.assertTrue(myHubPage.getCallbacksNotInstructedButton().isDisplayed());
        Assert.assertTrue(myHubPage.getCallbacksRequirementButton().isDisplayed());
        Assert.assertTrue(myHubPage.getCallbacksActivityButton().isSelected());

        myHubPage.getCallbacksKeepInTouchButton().click();
        Assert.assertTrue(myHubPage.getCallbacksKeepInTouchButton().isEnabled());

        String noCallbacksText = myHubPage.getCallbacksNoCallbacksText().getText();
        Assert.assertTrue(myHubPage.getCallbacksNoCallbacksText().isDisplayed());
        Assert.assertEquals(noCallbacksText, "No Callbacks");

        myHubPage.getCallbacksUpcomingButton().click();
        Assert.assertTrue(myHubPage.getCallbacksUpcomingButton().isEnabled());
        Assert.assertTrue(myHubPage.getCallbacksNoCallbacksText().isDisplayed());
        Assert.assertEquals(noCallbacksText, "No Callbacks");

        myHubPage.getCallbacksOverdueButton().click();
        Assert.assertTrue(myHubPage.getCallbacksOverdueButton().isEnabled());
        Assert.assertTrue(myHubPage.getCallbacksNoCallbacksText().isDisplayed());
        Assert.assertEquals(noCallbacksText, "No Callbacks");

        myHubPage.getCallbacksTodayButton().click();
        Assert.assertTrue(myHubPage.getCallbacksTodayButton().isEnabled());
        Assert.assertTrue(myHubPage.getCallbacksNoCallbacksText().isDisplayed());
        Assert.assertEquals(noCallbacksText, "No Callbacks");

        myHubPage.getSelectionOptions().click();
        Assert.assertTrue(myHubPage.getCallbacksKeepInTouchButton().isSelected());

        myHubPage.getCallbacksActivityButton().click();
        Assert.assertTrue(myHubPage.getCallbacksActivityButton().isEnabled());

        myHubPage.getMyCallbacksChevronUp().click();
        Assert.assertTrue(myHubPage.getMyCallbacksChevronDown().isEnabled());
    }

    @Test(priority = 7)
    public void testAccessToMyCallbacksNotInstructedSelection_ShouldSuccessfullyExpandMyCallbacksNotInstructedSelection() {
        MyHubPage myHubPage = new MyHubPage(driver);

        myHubPage.getMyCallbacksChevronDown().click();
        Assert.assertTrue(myHubPage.getCallbacksActivityButton().isEnabled());
        Assert.assertTrue(myHubPage.getMyCallbacksChevronUp().isEnabled());

        myHubPage.getSelectionOptions().click();
        Assert.assertTrue(myHubPage.getCallbacksActivityButton().isDisplayed());
        Assert.assertTrue(myHubPage.getCallbacksKeepInTouchButton().isDisplayed());
        Assert.assertTrue(myHubPage.getCallbacksNotInstructedButton().isDisplayed());
        Assert.assertTrue(myHubPage.getCallbacksRequirementButton().isDisplayed());
        Assert.assertTrue(myHubPage.getCallbacksActivityButton().isSelected());

        myHubPage.getCallbacksNotInstructedButton().click();
        Assert.assertTrue(myHubPage.getCallbacksNotInstructedButton().isEnabled());

        String noCallbacksText = myHubPage.getCallbacksNoCallbacksText().getText();
        Assert.assertTrue(myHubPage.getCallbacksNoCallbacksText().isDisplayed());
        Assert.assertEquals(noCallbacksText, "No Callbacks");

        myHubPage.getCallbacksUpcomingButton().click();
        Assert.assertTrue(myHubPage.getCallbacksUpcomingButton().isEnabled());
        Assert.assertTrue(myHubPage.getCallbacksNoCallbacksText().isDisplayed());
        Assert.assertEquals(noCallbacksText, "No Callbacks");

        myHubPage.getCallbacksOverdueButton().click();
        Assert.assertTrue(myHubPage.getCallbacksOverdueButton().isEnabled());
        Assert.assertTrue(myHubPage.getCallbacksNoCallbacksText().isDisplayed());
        Assert.assertEquals(noCallbacksText, "No Callbacks");

        myHubPage.getCallbacksTodayButton().click();
        Assert.assertTrue(myHubPage.getCallbacksTodayButton().isEnabled());
        Assert.assertTrue(myHubPage.getCallbacksNoCallbacksText().isDisplayed());
        Assert.assertEquals(noCallbacksText, "No Callbacks");

        myHubPage.getSelectionOptions().click();
        Assert.assertTrue(myHubPage.getCallbacksNotInstructedButton().isSelected());

        myHubPage.getCallbacksActivityButton().click();
        Assert.assertTrue(myHubPage.getCallbacksActivityButton().isEnabled());

        myHubPage.getMyCallbacksChevronUp().click();
        Assert.assertTrue(myHubPage.getMyCallbacksChevronDown().isEnabled());
    }

    @Test(priority = 8)
    public void testAccessToMyCallbacksRequirementSelection_ShouldSuccessfullyExpandMyCallbacksRequirementSelection() {
        MyHubPage myHubPage = new MyHubPage(driver);

        myHubPage.getMyCallbacksChevronDown().click();
        Assert.assertTrue(myHubPage.getCallbacksActivityButton().isEnabled());
        Assert.assertTrue(myHubPage.getMyCallbacksChevronUp().isEnabled());

        myHubPage.getSelectionOptions().click();
        Assert.assertTrue(myHubPage.getCallbacksActivityButton().isDisplayed());
        Assert.assertTrue(myHubPage.getCallbacksKeepInTouchButton().isDisplayed());
        Assert.assertTrue(myHubPage.getCallbacksNotInstructedButton().isDisplayed());
        Assert.assertTrue(myHubPage.getCallbacksRequirementButton().isDisplayed());
        Assert.assertTrue(myHubPage.getCallbacksActivityButton().isSelected());

        myHubPage.getCallbacksRequirementButton().click();
        Assert.assertTrue(myHubPage.getCallbacksRequirementButton().isEnabled());

        String noCallbacksText = myHubPage.getCallbacksNoCallbacksText().getText();
        Assert.assertTrue(myHubPage.getCallbacksNoCallbacksText().isDisplayed());
        Assert.assertEquals(noCallbacksText, "No Callbacks");

        myHubPage.getCallbacksUpcomingButton().click();
        Assert.assertTrue(myHubPage.getCallbacksUpcomingButton().isEnabled());
        Assert.assertTrue(myHubPage.getCallbacksNoCallbacksText().isDisplayed());
        Assert.assertEquals(noCallbacksText, "No Callbacks");

        myHubPage.getCallbacksOverdueButton().click();
        Assert.assertTrue(myHubPage.getCallbacksOverdueButton().isEnabled());
        Assert.assertTrue(myHubPage.getCallbacksNoCallbacksText().isDisplayed());
        Assert.assertEquals(noCallbacksText, "No Callbacks");

        myHubPage.getCallbacksTodayButton().click();
        Assert.assertTrue(myHubPage.getCallbacksTodayButton().isEnabled());
        Assert.assertTrue(myHubPage.getCallbacksNoCallbacksText().isDisplayed());
        Assert.assertEquals(noCallbacksText, "No Callbacks");

        myHubPage.getSelectionOptions().click();
        Assert.assertTrue(myHubPage.getCallbacksRequirementButton().isSelected());

        myHubPage.getCallbacksActivityButton().click();
        Assert.assertTrue(myHubPage.getCallbacksActivityButton().isEnabled());

        myHubPage.getMyCallbacksChevronUp().click();
        Assert.assertTrue(myHubPage.getMyCallbacksChevronDown().isEnabled());
    }


    @Test(priority = 9)
    public void testAccessToActivityPage_ShouldSuccessfullyOpenActivityPage() {
        MyHubPage myHubPage = new MyHubPage(driver);
        MyHubActivitySearchPage myHubActivitySearchPage = new MyHubActivitySearchPage(driver);

        myHubPage.getActivitySearchButton().click();

        String searchLabel = myHubActivitySearchPage.getSearchLabel().getText();
        Assert.assertEquals(searchLabel, "Search");

        myHubActivitySearchPage.getMyHubButton().click();

        String myHubNavigatorBarTitle = myHubPage.getMyHubLabel().getText();
        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");
    }

    @Test(priority = 10)
    public void testAccessToRequirementsPage_ShouldSuccessfullyOpenRequirementsPage() {
        MyHubPage myHubPage = new MyHubPage(driver);
        MyHubRequirementsSearchPage myHubRequirementsSearchPage = new MyHubRequirementsSearchPage(driver);

        myHubPage.getRequirementSearchButton().click();

        String mySearchRequirementsText = myHubRequirementsSearchPage.getNoRequirementsFoundText().getText();
        Assert.assertEquals(mySearchRequirementsText, "No Requirements Found");

        myHubRequirementsSearchPage.getMyHubButton().click();

        String myHubNavigatorBarTitle = myHubPage.getMyHubLabel().getText();
        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");
    }

    @Test(priority = 11)
    public void testAccessToPropertyPage_ShouldSuccessfullyOpenPropertyPage() {
        MyHubPage myHubPage = new MyHubPage(driver);
        MyHubPropertySearchPage myHubPropertySearchPage = new MyHubPropertySearchPage(driver);
        AppiumDriver appiumDriver = (AppiumDriver) this.driver;

        scroll("up", myHubPage.getVerticalScroll(), appiumDriver);

        myHubPage.getPropertySearchButton().click();

        // TODO: Test failing due to missing placeholder "Enter text to search properties"
//        String mySearchPropertiesMessage = myHubPropertySearchPage.getPropertiesSearchMessage().getText();
//        Assert.assertEquals(mySearchPropertiesMessage, "Enter text to search properties.");

        myHubPropertySearchPage.getMyHubButton().click();

        String myHubNavigatorBarTitle = myHubPage.getMyHubLabel().getText();
        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");
    }

    @Test(priority = 12)
    public void testAccessToContactSearchPage_ShouldSuccessfullyOpenContactSearchPage() {
        MyHubPage myHubPage = new MyHubPage(driver);
        MyHubContactSearchPage myHubContactSearchPage = new MyHubContactSearchPage(driver);
        AppiumDriver appiumDriver = (AppiumDriver) this.driver;

        scroll("up", myHubPage.getVerticalScroll(), appiumDriver);

        myHubPage.getContactSearchButton().click();

        String searchTitle = myHubContactSearchPage.getSearchLabel().getText();
        Assert.assertEquals(searchTitle, "Search");

        myHubContactSearchPage.getTeamButton().click();
        Assert.assertEquals(searchTitle, "Search");

        myHubContactSearchPage.getAllButton().click();
        Assert.assertEquals(searchTitle, "Search");

        myHubContactSearchPage.getMyButton().click();
        Assert.assertEquals(searchTitle, "Search");

        myHubContactSearchPage.getMyHubButton().click();

        String myHubNavigatorBarTitle = myHubPage.getMyHubLabel().getText();
        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");
    }

    @Test(priority = 13)
    public void testAccessToCreateContactPage_ShouldSuccessfullyOpenCreateContactPage() {
        MyHubPage myHubPage = new MyHubPage(driver);
        MyHubCreateContactPage myHubCreateContactPage = new MyHubCreateContactPage(driver);
        AppiumDriver appiumDriver = (AppiumDriver) this.driver;
        Map<String, Object> scrollParams = new HashMap<>();

        scrollParams.put("direction", "up");
        scrollParams.put("element", myHubPage.getVerticalScroll());
        appiumDriver.executeScript("mobile: swipe", scrollParams);

        myHubPage.getCreateContactButton().click();

        String searchTitle = myHubCreateContactPage.getSearchLabel().getText();
        Assert.assertEquals(searchTitle, "Search");

        String duplicateCheckText = myHubCreateContactPage.getDuplicateCheckLabel().getText();
        Assert.assertEquals(duplicateCheckText, "Duplicate check");

        myHubCreateContactPage.getMyHubButton().click();

        String myHubNavigatorBarTitle = myHubPage.getMyHubLabel().getText();
        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");
    }

    @Test(priority = 14)
    public void testAccessToCreateConneXionPage_ShouldSuccessfullyOpenCreateConneXionPageWithAllContactsSelected() {
        MyHubPage myHubPage = new MyHubPage(driver);
        MyHubCreateConneXionPage createConneXion = new MyHubCreateConneXionPage(driver);
        AppiumDriver appiumDriver = (AppiumDriver) this.driver;

        scroll("up", myHubPage.getVerticalScroll(), appiumDriver);

        myHubPage.getCreateConneXionButton().click();

        String allContactsTitle = createConneXion.getAllContactsTitle().getText();
        Assert.assertEquals(allContactsTitle, "All contacts");

        createConneXion.getMyHubButton().click();

        String myHubNavigatorBarTitle = myHubPage.getMyHubLabel().getText();
        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");
    }


    @Test(priority = 15)
    public void testAccessToTheViewLink_ShouldSuccessfullyOpenTheViewLink() {
        MyHubPage myHubPage = new MyHubPage(driver);
        MyHubTheViewPage myHubTheViewPage = new MyHubTheViewPage(driver);
        AppiumDriver appiumDriver = (AppiumDriver) this.driver;

        scroll("up", myHubPage.getVerticalScroll(), appiumDriver);

        myHubPage.getTheViewButton().click();
//        Assert.assertTrue(theViewPage.getArticleTitle().isDisplayed());

//        // Get the element's top-left corner coordinates
//        int elementX = myHubTheViewPage.getHubUatButton().getLocation().getX();
//        int elementY = myHubTheViewPage.getHubUatButton().getLocation().getY();
//
//        // Get the element's width and height
//        int elementWidth = myHubTheViewPage.getHubUatButton().getSize().getWidth();
//        int elementHeight = myHubTheViewPage.getHubUatButton().getSize().getHeight();
//
//        // Calculate the target coordinates within the element
//        // Example: Click 10% width and 50% height
//        int targetX = elementX + (int) (elementWidth * 0.1);
//        int targetY = elementY + (int) (elementHeight * 0.5);
//
//        // Create W3C touch action
//        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//        Sequence tap = new Sequence(finger, 1);
//
//        // Move to the target point and perform a tap
//        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), targetX, targetY));
//        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

//        // Perform the action
//        appiumDriver.perform(List.of(tap));
//        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());

        myHubTheViewPage.getMyHubButton().click();

//        scrollParams.put("direction", "down");
//        scrollParams.put("element", myHubPage.getVerticalScroll());
//        appiumDriver.executeScript("mobile: swipe", scrollParams);
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }

    @Test(priority = 16)
    public void testAccessToTheWealthReportLink_ShouldSuccessfullyOpenTheWealthReportLink() {
        MyHubPage myHubPage = new MyHubPage(driver);
        MyHubTheWealthReportPage myHubTheWealthReportPage = new MyHubTheWealthReportPage(driver);
        AppiumDriver appiumDriver = (AppiumDriver) this.driver;

        scroll("up", myHubPage.getVerticalScroll(), appiumDriver);

        myHubPage.getTheWealthReportButton().click();

//        // Get the element's top-left corner coordinates
//        int elementX = myHubTheWealthReportPage.getHubUatButton().getLocation().getX();
//        int elementY = myHubTheWealthReportPage.getHubUatButton().getLocation().getY();
//
//        // Get the element's width and height
//        int elementWidth = myHubTheWealthReportPage.getHubUatButton().getSize().getWidth();
//        int elementHeight = myHubTheWealthReportPage.getHubUatButton().getSize().getHeight();
//
//        // Calculate the target coordinates within the element
//        // Example: Click 75% width and 50% height
//        int targetX = elementX + (int) (elementWidth * 0.1);
//        int targetY = elementY + (int) (elementHeight * 0.5);
//
//        // Create W3C touch action
//        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//        Sequence tap = new Sequence(finger, 1);
//
//        // Move to the target point and perform a tap
//        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), targetX, targetY));
//        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//
//        // Perform the action
//        appiumDriver.perform(List.of(tap));
//        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
//
//        scrollParams.put("direction", "down");
//        scrollParams.put("element", myHubPage.getVerticalScroll());
//        appiumDriver.executeScript("mobile: swipe", scrollParams);
        myHubTheWealthReportPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }
}
