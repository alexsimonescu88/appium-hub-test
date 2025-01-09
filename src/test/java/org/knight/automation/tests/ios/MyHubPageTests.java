package org.knight.automation.tests.ios;

import io.appium.java_client.AppiumDriver;
import org.knight.automation.pages.ios.*;
import org.knight.automation.tests.BaseTest;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MyHubPageTests extends BaseTest {

    @Test()
    public void testPresenceOfAllElementsOnMyHubPage_ShouldSuccessfullyIdentifyThePresenceOfAllElementsOnMyHubPage() {
        MyHubPage myHubPage = new MyHubPage(driver);
        AppiumDriver appiumDriver = (AppiumDriver) this.driver;
        Map<String, Object> scrollParams = new HashMap<>();

        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
        Assert.assertTrue(myHubPage.getFavouritesLabel().isDisplayed());

        scrollParams.put("direction", "left");
        scrollParams.put("element", myHubPage.getFavouritesScrollView());
        appiumDriver.executeScript("mobile: swipe", scrollParams);
        appiumDriver.executeScript("mobile: swipe", scrollParams);
        appiumDriver.executeScript("mobile: swipe", scrollParams);
        appiumDriver.executeScript("mobile: swipe", scrollParams);

        scrollParams.put("direction", "right");
        scrollParams.put("element", myHubPage.getFavouritesScrollView());
        appiumDriver.executeScript("mobile: swipe", scrollParams);
        appiumDriver.executeScript("mobile: swipe", scrollParams);
        appiumDriver.executeScript("mobile: swipe", scrollParams);
        appiumDriver.executeScript("mobile: swipe", scrollParams);

        Assert.assertTrue(myHubPage.getMyCallbacksLabel().isDisplayed());

        Assert.assertTrue(myHubPage.getExploreHubMobileLabel().isDisplayed());
        Assert.assertTrue(myHubPage.getHubQuickLinksLabel().isDisplayed());
        Assert.assertTrue(myHubPage.getActivitySearchButton().isDisplayed());
        Assert.assertTrue(myHubPage.getRequirementSearchButton().isDisplayed());
        Assert.assertTrue(myHubPage.getPropertySearchButton().isDisplayed());
        Assert.assertTrue(myHubPage.getContactSearchButton().isDisplayed());
        Assert.assertTrue(myHubPage.getCreateContactButton().isDisplayed());
        Assert.assertTrue(myHubPage.getCreateConneXionButton().isDisplayed());
        Assert.assertTrue(myHubPage.getKnightFrankLinksLabel().isDisplayed());

        scrollParams.put("direction", "up");
        scrollParams.put("element", myHubPage.getVerticalScroll());
        appiumDriver.executeScript("mobile: swipe", scrollParams);

        Assert.assertTrue(myHubPage.getTheViewButton().isDisplayed());
        Assert.assertTrue(myHubPage.getTheWealthReportButton().isDisplayed());

        scrollParams.put("direction", "down");
        scrollParams.put("element", myHubPage.getVerticalScroll());
        appiumDriver.executeScript("mobile: swipe", scrollParams);
    }

    @Test(priority = 1)
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

    @Test(priority = 2)
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

    @Test(priority = 3)
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

    @Test(priority = 4)
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

    @Test(priority = 5)
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

    @Test(priority = 6)
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

    @Test(priority = 7)
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


    @Test(priority = 8)
    public void testAccessToActivityPage_ShouldSuccessfullyOpenActivityPage() {
        MyHubPage myHubPage = new MyHubPage(driver);
        ActivitySearchPage activitySearchPage = new ActivitySearchPage(driver);

        myHubPage.getActivitySearchButton().click();

        String searchLabel = activitySearchPage.getSearchLabel().getText();
        Assert.assertEquals(searchLabel, "Search");

        activitySearchPage.getMyHubButton().click();

        String myHubNavigatorBarTitle = myHubPage.getMyHubLabel().getText();
        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");
    }

    @Test(priority = 9)
    public void testAccessToRequirementsPage_ShouldSuccessfullyOpenRequirementsPage() {
        MyHubPage myHubPage = new MyHubPage(driver);
        RequirementsSearchPage requirementsSearchPage = new RequirementsSearchPage(driver);

        myHubPage.getRequirementSearchButton().click();

        String mySearchRequirementsText = requirementsSearchPage.getNoRequirementsFoundText().getText();
        Assert.assertEquals(mySearchRequirementsText, "No Requirements Found");

        requirementsSearchPage.getMyHubButton().click();

        String myHubNavigatorBarTitle = myHubPage.getMyHubLabel().getText();
        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");
    }

    @Test(priority = 10)
    public void testAccessToPropertyPage_ShouldSuccessfullyOpenPropertyPage() {
        MyHubPage myHubPage = new MyHubPage(driver);
        PropertySearchPage propertySearchPage = new PropertySearchPage(driver);

        myHubPage.getPropertySearchButton().click();

        String mySearchPropertiesMessage = propertySearchPage.getPropertiesSearchMessage().getText();
        Assert.assertEquals(mySearchPropertiesMessage, "Enter text to search properties.");

        propertySearchPage.getMyHubButton().click();

        String myHubNavigatorBarTitle = myHubPage.getMyHubLabel().getText();
        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");
    }

    @Test(priority = 11)
    public void testAccessToContactSearchPage_ShouldSuccessfullyOpenContactSearchPage() {
        MyHubPage myHubPage = new MyHubPage(driver);
        ContactSearchPage contactSearchPage = new ContactSearchPage(driver);

        myHubPage.getContactSearchButton().click();

        String myContactsTitle = contactSearchPage.getMyContactsLabel().getText();
        Assert.assertEquals(myContactsTitle, "My contacts");

        contactSearchPage.getMyHubButton().click();

        String myHubNavigatorBarTitle = myHubPage.getMyHubLabel().getText();
        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");
    }

    @Test(priority = 12)
    public void testAccessToCreateContactPage_ShouldSuccessfullyOpenCreateContactPage() {
        MyHubPage myHubPage = new MyHubPage(driver);
        CreateContactPage createContactPage = new CreateContactPage(driver);

        myHubPage.getCreateContactButton().click();

        String searchTitle = createContactPage.getSearchLabel().getText();
        Assert.assertEquals(searchTitle, "Search");

        String duplicateCheckText = createContactPage.getDuplicateCheckLabel().getText();
        Assert.assertEquals(duplicateCheckText, "Duplicate check");

        createContactPage.getMyHubButton().click();

        String myHubNavigatorBarTitle = myHubPage.getMyHubLabel().getText();
        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");
    }

    @Test(priority = 13)
    public void testAccessToCreateConneXionPage_ShouldSuccessfullyOpenCreateConneXionPageWithAllContactsSelected() {
        MyHubPage myHubPage = new MyHubPage(driver);
        CreateConneXionPage createConneXion = new CreateConneXionPage(driver);

        myHubPage.getCreateConneXionButton().click();

        String allContactsTitle = createConneXion.getAllContactsTitle().getText();
        Assert.assertEquals(allContactsTitle, "All contacts");

        createConneXion.getMyHubButton().click();

        String myHubNavigatorBarTitle = myHubPage.getMyHubLabel().getText();
        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");
    }


    @Test(priority = 14)
    @Ignore
    public void testAccessToTheViewLink_ShouldSuccessfullyOpenTheViewLink() {
        MyHubPage myHubPage = new MyHubPage(driver);
        TheViewPage theViewPage = new TheViewPage(driver);
        AppiumDriver appiumDriver = (AppiumDriver) this.driver;
        Map<String, Object> scrollParams = new HashMap<>();

        scrollParams.put("direction", "up");
        scrollParams.put("element", myHubPage.getVerticalScroll());
        appiumDriver.executeScript("mobile: swipe", scrollParams);

        myHubPage.getTheViewButton().click();
//        Assert.assertTrue(theViewPage.getArticleTitle().isDisplayed());

        // Get the element's top-left corner coordinates
        int elementX = theViewPage.getHubUatButton().getLocation().getX();
        int elementY = theViewPage.getHubUatButton().getLocation().getY();

        // Get the element's width and height
        int elementWidth = theViewPage.getHubUatButton().getSize().getWidth();
        int elementHeight = theViewPage.getHubUatButton().getSize().getHeight();

        // Calculate the target coordinates within the element
        // Example: Click 10% width and 50% height
        int targetX = elementX + (int) (elementWidth * 0.1);
        int targetY = elementY + (int) (elementHeight * 0.5);

        // Create W3C touch action
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);

        // Move to the target point and perform a tap
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), targetX, targetY));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        // Perform the action
        appiumDriver.perform(List.of(tap));
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());

        scrollParams.put("direction", "down");
        scrollParams.put("element", myHubPage.getVerticalScroll());
        appiumDriver.executeScript("mobile: swipe", scrollParams);
    }

    @Test(priority = 15)
    @Ignore
    public void testAccessToTheWealthReportLink_ShouldSuccessfullyOpenTheWealthReportLink() {
        MyHubPage myHubPage = new MyHubPage(driver);
        TheWealthReportPage theWealthReportPage = new TheWealthReportPage(driver);
        AppiumDriver appiumDriver = (AppiumDriver) this.driver;
        Map<String, Object> scrollParams = new HashMap<>();

        scrollParams.put("direction", "up");
        scrollParams.put("element", myHubPage.getVerticalScroll());
        appiumDriver.executeScript("mobile: swipe", scrollParams);

        myHubPage.getTheWealthReportButton().click();

        // Get the element's top-left corner coordinates
        int elementX = theWealthReportPage.getHubUatButton().getLocation().getX();
        int elementY = theWealthReportPage.getHubUatButton().getLocation().getY();

        // Get the element's width and height
        int elementWidth = theWealthReportPage.getHubUatButton().getSize().getWidth();
        int elementHeight = theWealthReportPage.getHubUatButton().getSize().getHeight();

        // Calculate the target coordinates within the element
        // Example: Click 75% width and 50% height
        int targetX = elementX + (int) (elementWidth * 0.1);
        int targetY = elementY + (int) (elementHeight * 0.5);

        // Create W3C touch action
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);

        // Move to the target point and perform a tap
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), targetX, targetY));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        // Perform the action
        appiumDriver.perform(List.of(tap));
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());

        scrollParams.put("direction", "down");
        scrollParams.put("element", myHubPage.getVerticalScroll());
        appiumDriver.executeScript("mobile: swipe", scrollParams);
    }
}
