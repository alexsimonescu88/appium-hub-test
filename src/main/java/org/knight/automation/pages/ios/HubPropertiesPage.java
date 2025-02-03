package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HubPropertiesPage extends BasePage {

    @FindBy(id = "hub")
    private WebElement hubButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Properties\"]")
    private WebElement propertiesLabel;

    @FindBy(id = "Search")
    private WebElement searchField;

    @FindBy(id = "Enter text to search properties.")
    private WebElement helperText;

    public HubPropertiesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getHubButton() {
        return waitForClickability(hubButton, 10);
    }

    public WebElement getPropertiesLabel() {
        return waitForVisibility(propertiesLabel, 10);
    }

    public WebElement getSearchField() {
        return waitForClickability(searchField, 10);
    }

    public WebElement getHelperText() {
        return waitForVisibility(helperText, 10);
    }
}
