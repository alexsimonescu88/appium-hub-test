package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HubRequirementsPage extends BasePage {

    @FindBy(id = "hub")
    private WebElement hubButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Requirements\"]")
    private WebElement requirementsLabel;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"magnifyingglass\"]")
    private WebElement requirementsSearchButton;

    @FindBy(id = "Team")
    private WebElement teamButton;

    @FindBy(id = "My")
    private WebElement myButton;

    @FindBy(id = "No Requirements Found")
    private WebElement noRequirementsLabel;

    public HubRequirementsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getHubButton() {
        return waitForClickability(hubButton, 20);
    }

    public WebElement getRequirementsLabel() {
        return waitForVisibility(requirementsLabel, 20);
    }

    public WebElement getRequirementsSearchButton() {
        return waitForClickability(requirementsSearchButton, 20);
    }

    public WebElement getTeamButton() {
        return waitForClickability(teamButton, 20);
    }

    public WebElement getMyButton() {
        return waitForClickability(myButton, 20);
    }

    public WebElement getNoRequirementsLabel() {
        return waitForVisibility(noRequirementsLabel, 20);
    }
}
