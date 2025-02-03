package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyHubCreateConneXionPage extends BasePage {

    @FindBy(id = "My hub")
    private WebElement myHubButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My contacts\"]")
    private WebElement myContactsTitle;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"All contacts\"]")
    private WebElement allContactsTitle;

    @FindBy(id = "Search")
    private WebElement searchField;

    @FindBy(id = "My")
    private WebElement myButton;

    @FindBy(id = "ALl")
    private WebElement allButton;

    @FindBy(id = "No results matched your search")
    private WebElement noResultsMatchedText;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Clear filters\"]")
    private WebElement clearFiltersButton;

    public MyHubCreateConneXionPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getMyHubButton() {
        return waitForClickability(myHubButton, 20);
    }

    public WebElement getMyContactsTitle() {
        return waitForVisibility(myContactsTitle, 20);
    }

    public WebElement getAllContactsTitle() {
        return waitForVisibility(allContactsTitle, 20);
    }

    public WebElement getSearchField() {
        return waitForClickability(searchField, 20);
    }

    public WebElement getMyButton() {
        return waitForClickability(myButton, 20);
    }

    public WebElement getAllButton() {
        return waitForClickability(allButton, 20);
    }

    public WebElement getNoResultsMatchedText() {
        return waitForVisibility(noResultsMatchedText, 20);
    }

    public WebElement getClearFiltersButton() {
        return waitForClickability(clearFiltersButton, 20);
    }
}
