package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ActivitySearchPage;
import pages.MyHubPage;

public class ActivitySearchPageTests extends BaseTest {

    @Test
    public void testAccessToActivityPage_ShouldSuccessfullyOpenActivityPageAndSelectMyActivityButton() {
        MyHubPage myHubPage = new MyHubPage(driver);
        ActivitySearchPage activitySearchPage = new ActivitySearchPage(driver);

        myHubPage.openActivitySearch();

        activitySearchPage.selectMyActivity();

        String searchTitle = activitySearchPage.getSearchTitle();
        Assert.assertEquals(searchTitle, "Search");

        activitySearchPage.selectMyActivity();

        activitySearchPage.navigateBackToMyHubPage();

        String myHubNavigatorBarTitle = myHubPage.getMyHubNavigatorBarTitle();
        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");

    }

    @Test
    public void testAccessToActivityPage_ShouldSuccessfullyOpenActivityPageAndSelectTeamActivityButton() {
        MyHubPage myHubPage = new MyHubPage(driver);
        ActivitySearchPage activitySearchPage = new ActivitySearchPage(driver);

        myHubPage.openActivitySearch();

        activitySearchPage.selectTeamActivity();

        String searchTitle = activitySearchPage.getSearchTitle();
        Assert.assertEquals(searchTitle, "Search");

        activitySearchPage.selectMyActivity();

        activitySearchPage.navigateBackToMyHubPage();

        String myHubNavigatorBarTitle = myHubPage.getMyHubNavigatorBarTitle();
        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");

    }

    @Test
    public void testAccessToActivityPage_ShouldSuccessfullyOpenActivityPageAndSelectAllActivityButton() {
        MyHubPage myHubPage = new MyHubPage(driver);
        ActivitySearchPage activitySearchPage = new ActivitySearchPage(driver);

        myHubPage.openActivitySearch();

        activitySearchPage.selectAllActivity();

        String searchTitle = activitySearchPage.getSearchTitle();
        Assert.assertEquals(searchTitle, "Search");

        activitySearchPage.selectMyActivity();

        activitySearchPage.navigateBackToMyHubPage();

        String myHubNavigatorBarTitle = myHubPage.getMyHubNavigatorBarTitle();
        Assert.assertEquals(myHubNavigatorBarTitle, "My hub");

    }
}
