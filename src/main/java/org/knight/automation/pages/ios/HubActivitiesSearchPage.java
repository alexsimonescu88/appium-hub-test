package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HubActivitiesSearchPage extends BasePage {

    @FindBy(id = "Activities")
    private WebElement activitiesButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Search\"]")
    private WebElement activitiesSearchLabel;

    @FindBy(xpath = "//XCUIElementTypeTextField")
    private WebElement searchField;

    @FindBy(id = "My")
    private WebElement myButton;

    @FindBy(id = "Team")
    private WebElement teamButton;

    @FindBy(id = "All")
    private WebElement allButton;

    @FindBy(id = "No Activities Found")
    private WebElement noActivitiesLabel;

    @FindBy(xpath = "//XCUIElementTypeScrollView")
    private WebElement verticalScrollView;

    @FindBy(id = "X Circle")
    private WebElement clearSearchButton;

    public HubActivitiesSearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getActivitiesButton() {
        return waitForClickability(activitiesButton, 20);
    }

    public WebElement getActivitiesSearchLabel() {
        return waitForVisibility(activitiesSearchLabel, 20);
    }

    public WebElement getSearchField() {
        return waitForClickability(searchField, 20);
    }

    public WebElement getMyButton() {
        return waitForClickability(myButton, 20);
    }

    public WebElement getTeamButton() {
        return waitForClickability(teamButton, 20);
    }

    public WebElement getAllButton() {
        return waitForClickability(allButton, 20);
    }

    public WebElement getNoActivitiesLabel() {
        return waitForVisibility(noActivitiesLabel, 20);
    }

    public WebElement getVerticalScrollView() {
        return waitForClickability(verticalScrollView, 20);
    }

    public WebElement getClearSearchButton() {
        return waitForClickability(clearSearchButton, 20);
    }
}
