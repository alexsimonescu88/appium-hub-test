package org.knight.automation.tests.ios;

import org.knight.automation.pages.ios.HubCalendarPage;
import org.knight.automation.pages.ios.HubPage;
import org.knight.automation.pages.ios.MyHubPage;
import org.knight.automation.tests.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;

public class HubCalendarPageTests extends BaseTest {

    @Test
    public void testAccessToHubCalendarPageTestAndToggleThroughDates_shouldSuccessfullyAccessAndToggleThroughCalendarPageDates() {
        MyHubPage myHubPage = new MyHubPage(driver);
        HubPage hubPage = new HubPage(driver);
        HubCalendarPage hubCalendarPage = new HubCalendarPage(driver);

        myHubPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().getText().matches("hub"));

        hubPage.getCalendarButton().click();
        Assert.assertTrue(hubCalendarPage.getCalendarLabel().getText().matches("Calendar"));
        Assert.assertTrue(hubCalendarPage.getLeftArrowButton().isDisplayed());
        Assert.assertTrue(hubCalendarPage.getRightArrowButton().isDisplayed());
        Assert.assertTrue(hubCalendarPage.getTodayButton().isDisplayed());
        Assert.assertTrue(hubCalendarPage.getHubButton().isDisplayed());

        hubCalendarPage.getLeftArrowButton().click();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("d MMMM yyyy");
        String yesterday = dateFormatter.format(Date.from(Instant.now().minus(Duration.ofDays(1))));
        Assert.assertEquals(driver.findElement(By.id(yesterday)).getText(), yesterday);

        hubCalendarPage.getTodayButton().click();
        String today = dateFormatter.format(Date.from(Instant.now()));
        Assert.assertEquals(driver.findElement(By.id(today)).getText(), today);

        hubCalendarPage.getRightArrowButton().click();
        String tomorrow = dateFormatter.format(Date.from(Instant.now().plus(Duration.ofDays(1))));
        Assert.assertEquals(driver.findElement(By.id(tomorrow)).getText(), tomorrow);

        hubCalendarPage.getTodayButton().click();
        Assert.assertTrue(driver.findElement(By.id(today)).getText().matches(today));

        hubCalendarPage.getHubButton().click();
        Assert.assertTrue(hubPage.getNavBarTittle().isDisplayed());

        hubPage.getMyHubButton().click();
        Assert.assertTrue(myHubPage.getMyHubLabel().isDisplayed());
    }
}
