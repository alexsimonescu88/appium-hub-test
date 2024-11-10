package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactSearchPage {

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"My hub\"]")
    private WebElement homePageButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"No contacts available\"]")
    private WebElement noContactsAvailableText;

    public ContactSearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void navigateBackToHomePage() {
        homePageButton.click();
    }

    public String getNoContactsAvailableText() {
        return noContactsAvailableText.getText();
    }
}
