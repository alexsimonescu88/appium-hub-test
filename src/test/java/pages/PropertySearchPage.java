package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertySearchPage {
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"My hub\"]")
    private WebElement homePageButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter text to search properties.\"]")
    private WebElement propertiesSearchMessage;

    public PropertySearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void navigateBackToHomePage() {
        homePageButton.click();
    }

    public String getMessageFromSearchProperties() {
        return propertiesSearchMessage.getText();
    }
}
