package org.knight.automation.pages.ios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivitySearchPage {

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"My hub\"]")
    private WebElement myHubPageButton;

    @FindBy(name = "No Activities Found")
    private WebElement noActivitiesFoundText;

    @FindBy(name = "My")
    private WebElement myActivityButton;

    @FindBy(name = "Team")
    private WebElement teamActivityButton;

    @FindBy(name = "All")
    private WebElement allActivityButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Search\"]")
    private WebElement searchTitle;

    public ActivitySearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void navigateBackToMyHubPage() {
        myHubPageButton.click();
    }

    public String getNoActivitiesFoundText() {
        return noActivitiesFoundText.getText();
    }

    public void selectMyActivity() {
        myActivityButton.click();
    }

    public void selectTeamActivity() {
        teamActivityButton.click();
    }

    public void selectAllActivity() {
        allActivityButton.click();
    }

    public String getSearchTitle() {
        return searchTitle.getText();
    }
}
