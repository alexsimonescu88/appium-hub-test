package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HubCompaniesPage extends BasePage {

    @FindBy(id = "hub")
    private WebElement hubButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Companies\"]")
    private WebElement companiesLabel;

    @FindBy(xpath = "//XCUIElementTypeOther[@name=\"magnifyingglass\"]")
    private WebElement companiesSearchButton;

    public HubCompaniesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getHubButton() {
        return waitForClickability(hubButton, 20);
    }

    public WebElement getCompaniesLabel() {
        return waitForVisibility(companiesLabel, 20);
    }

    public WebElement getCompaniesSearchButton() {
        return waitForClickability(companiesSearchButton, 20);
    }
}
