package org.knight.automation.pages.ios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertySearchPage {
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"My hub\"]")
    private WebElement myHubPageButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter text to search properties.\"]")
    private WebElement propertiesSearchMessage;

    public PropertySearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void navigateBackToMyHubPage() {
        myHubPageButton.click();
    }

    public String getMessageFromSearchProperties() {
        return propertiesSearchMessage.getText();
    }
}
