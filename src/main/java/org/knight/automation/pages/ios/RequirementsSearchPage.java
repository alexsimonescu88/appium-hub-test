package org.knight.automation.pages.ios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequirementsSearchPage {

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"My hub\"]")
    private WebElement myHubPageButton;

    @FindBy(name = "No Requirements Found")
    private WebElement noRequirementsFoundText;

    public RequirementsSearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void navigateBackToMyHubPage() {
        myHubPageButton.click();
    }

    public String getNoRequirementsFoundText() {
        return noRequirementsFoundText.getText();
    }
}
