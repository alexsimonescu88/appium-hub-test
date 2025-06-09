package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HubContactsSearchPage extends BasePage {

    @FindBy(id = "Contacts")
    private WebElement contactsButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Search\"]")
    private WebElement searchLabel;

    @FindBy(xpath = "//XCUIElementTypeTextField[@value=\"Search for name, address, email, number\"]")
    private WebElement searchField;

    @FindBy(id = "X Circle")
    private WebElement clearSearchButton;

    @FindBy(id = "My")
    private WebElement myButton;

    @FindBy(id = "Team")
    private WebElement teamButton;

    @FindBy(id = "All")
    private WebElement allButton;

    @FindBy(xpath = "//XCUIElementTypeScrollView")
    private WebElement verticalScrollView;

    public HubContactsSearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getContactsButton() {
        return waitForClickability(contactsButton, 20);
    }

    public WebElement getSearchLabel() {
        return waitForVisibility(searchLabel, 20);
    }

    public WebElement getSearchField() {
        return waitForClickability(searchField, 20);
    }

    public WebElement getClearSearchButton() {
        return waitForClickability(clearSearchButton, 20);
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
