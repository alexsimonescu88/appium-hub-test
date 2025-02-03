package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HubConneXionsSearchPage extends BasePage {

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"ConneXions\"]")
    private WebElement conneXionsButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"ConneXions\"]")
    private WebElement conneXionsLabel;

    @FindBy(id = "KFadd")
    private WebElement addButton;

    @FindBy(id = "Search")
    private WebElement searchField;

    @FindBy(id = "No conneXions available")
    private WebElement noConneXionsLabel;

    @FindBy(id = "Clear text")
    private WebElement clearSearchButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
    private WebElement cancelButton;

    public HubConneXionsSearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getConneXionsButton() {
        return waitForClickability(conneXionsButton, 20);
    }

    public WebElement getConneXionsLabel() {
        return waitForVisibility(conneXionsLabel, 20);
    }

    public WebElement getAddButton() {
        return waitForClickability(addButton, 20);
    }

    public WebElement getSearchField() {
        return waitForClickability(searchField, 20);
    }

    public WebElement getNoConneXionsLabel() {
        return waitForVisibility(noConneXionsLabel, 20);
    }

    public WebElement getClearSearchButton() {
        return waitForClickability(clearSearchButton, 20);
    }

    public WebElement getCancelButton() {
        return waitForClickability(cancelButton, 20);
    }
}
