package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HubRequirementsSearchPage extends BasePage {

    @FindBy(id = "Requirements")
    private WebElement requirementsButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Search\"]")
    private WebElement searchLabel;

    @FindBy(xpath = "//XCUIElementTypeOther[@name=\"filter_icon\"]")
    private WebElement filterButton;

    @FindBy(xpath = "//XCUIElementTypeTextField")
    private WebElement searchField;

    @FindBy(id = "multiply.circle.fill")
    private WebElement clearSearch;

    @FindBy(id = "My")
    private WebElement myButton;

    @FindBy(id = "Team")
    private WebElement teamButton;

    @FindBy(id = "All")
    private WebElement allButton;

    @FindBy(xpath = "//XCUIElementTypeScrollView")
    private WebElement verticalScrollView;

    public HubRequirementsSearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getRequirementsButton() {
        return waitForClickability(requirementsButton, 20);
    }

    public WebElement getSearchLabel() {
        return waitForVisibility(searchLabel, 20);
    }

    public WebElement getFilterButton() {
        return waitForClickability(filterButton, 20);
    }

    public WebElement getSearchField() {
        return waitForClickability(searchField, 20);
    }

    public WebElement getClearSearch() {
        return waitForClickability(clearSearch, 20);
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

    public WebElement getVerticalScrollView() {
        return waitForClickability(verticalScrollView, 20);
    }
}
