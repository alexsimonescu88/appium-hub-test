package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HubCompaniesSearchPage extends BasePage {

    @FindBy(id = "Companies")
    private WebElement companiesButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Search\"]")
    private WebElement searchLabel;

    @FindBy(xpath = "//XCUIElementTypeTextField")
    private WebElement searchField;

    @FindBy(id = "multiply.circle.fill")
    private WebElement clearSearchButton;

    @FindBy(xpath = "//XCUIElementTypeScrollView")
    private WebElement verticalScrollView;

    public HubCompaniesSearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getCompaniesButton() {
        return waitForClickability(companiesButton, 10);
    }

    public WebElement getSearchLabel() {
        return waitForVisibility(searchLabel, 10);
    }

    public WebElement getSearchField() {
        return waitForClickability(searchField, 10);
    }

    public WebElement getClearSearchButton() {
        return waitForClickability(clearSearchButton, 10);
    }

    public WebElement getVerticalScrollView() {
        return waitForClickability(verticalScrollView, 10);
    }
}
