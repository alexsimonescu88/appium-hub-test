package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class HomePageTests extends BaseTest {

    @Test
    public void testAccessToActivityPage_ShouldSuccessfullyOpenActivityPage() {
        HomePage homePage = new HomePage(driver);
        ActivitySearchPage activitySearchPage = new ActivitySearchPage(driver);

        homePage.openActivitySearch();

        String mySearchActivitiesText = activitySearchPage.getNoActivitiesFoundText();
        Assert.assertEquals(mySearchActivitiesText, "No Activities Found");

        activitySearchPage.navigateBackToHomePage();

        String myHubNavigatorBarTitle = homePage.getMyHubNavigatorBarTitle();
        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");

    }

    @Test
    public void testAccessToRequirementsPage_ShouldSuccessfullyOpenRequirementsPage() {
        HomePage homePage = new HomePage(driver);
        RequirementsSearchPage requirementsSearchPage = new RequirementsSearchPage(driver);

        homePage.openRequirementSearch();

        String mySearchRequirementsText = requirementsSearchPage.getNoRequirementsFoundText();
        Assert.assertEquals(mySearchRequirementsText, "No Requirements Found");

        requirementsSearchPage.navigateBackToHomePage();

        String myHubNavigatorBarTitle = homePage.getMyHubNavigatorBarTitle();
        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");
    }

    @Test
    public void testAccessToPropertyPage_ShouldSuccessfullyOpenPropertyPage() {
        HomePage homePage = new HomePage(driver);
        PropertySearchPage propertySearchPage = new PropertySearchPage(driver);

        homePage.openPropertySearch();

        String mySearchPropertiesMessage = propertySearchPage.getMessageFromSearchProperties();
        Assert.assertEquals(mySearchPropertiesMessage, "Enter text to search properties.");

        propertySearchPage.navigateBackToHomePage();

        String myHubNavigatorBarTitle = homePage.getMyHubNavigatorBarTitle();
        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");
    }

    @Test
    public void testAccessToContactSearchPage_ShouldSuccessfullyOpenContactSearchPage() {
        HomePage homePage = new HomePage(driver);
        ContactSearchPage contactSearchPage = new ContactSearchPage(driver);

        homePage.openContactSearch();

        String noContactsAvailableMessage = contactSearchPage.getNoContactsAvailableText();
        Assert.assertEquals(noContactsAvailableMessage, "No contacts available");

        contactSearchPage.navigateBackToHomePage();

        String myHubNavigatorBarTitle = homePage.getMyHubNavigatorBarTitle();
        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");
    }

    @Test
    public void testAccessToCreateContactPage_ShouldSuccessfullyOpenCreateContactPage() {
        HomePage homePage = new HomePage(driver);
        CreateContactPage createContactPage = new CreateContactPage(driver);

        homePage.openCreateContact();

        String searchTitle = createContactPage.getSearchTitleText();
        Assert.assertEquals(searchTitle, "Search");

        String duplicateCheckText = createContactPage.getDuplicateCheckText();
        Assert.assertEquals(duplicateCheckText, "Duplicate check");

        createContactPage.navigateBackToHomePage();

        String myHubNavigatorBarTitle = homePage.getMyHubNavigatorBarTitle();
        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");
    }
}
