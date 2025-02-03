package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyHubPropertySearchPage extends BasePage {
    @FindBy(id = "My hub")
    private WebElement myHubButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Properties\"]")
    private WebElement propertiesLabel;

    @FindBy(id = "Search")
    private WebElement searchField;

    @FindBy(id = "Enter text to search properties.")
    private WebElement propertiesSearchMessage;

    public MyHubPropertySearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getMyHubButton() {
        return waitForClickability(myHubButton, 20);
    }

    public WebElement getPropertiesLabel() {
        return waitForVisibility(propertiesLabel, 20);
    }

    public WebElement getSearchField() {
        return waitForClickability(searchField, 20);
    }

    public WebElement getPropertiesSearchMessage() {
        return waitForVisibility(propertiesSearchMessage, 20);
    }
}
