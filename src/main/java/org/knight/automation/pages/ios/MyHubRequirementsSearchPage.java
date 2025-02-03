package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyHubRequirementsSearchPage extends BasePage {

    @FindBy(id = "My hub")
    private WebElement myHubButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Search\"]")
    private WebElement searchLabel;

    @FindBy(xpath = "//XCUIElementTypeTextField")
    private WebElement searchField;

    @FindBy(id = "My")
    private WebElement myButton;

    @FindBy(id = "Team")
    private WebElement teamButton;

    @FindBy(id = "All")
    private WebElement allButton;

    @FindBy(id = "No Requirements Found")
    private WebElement noRequirementsFoundText;

    public MyHubRequirementsSearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getMyHubButton() {
        return waitForClickability(myHubButton, 20);
    }

    public WebElement getSearchLabel() {
        return waitForVisibility(searchLabel, 20);
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

    public WebElement getNoRequirementsFoundText() {
        return waitForVisibility(noRequirementsFoundText, 20);
    }
}
