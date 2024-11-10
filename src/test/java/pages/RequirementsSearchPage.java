package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequirementsSearchPage {

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"My hub\"]")
    private WebElement homePageButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"No Requirements Found\"]")
    private WebElement noRequirementsFoundText;

    public RequirementsSearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void navigateBackToHomePage() {
        homePageButton.click();
    }

    public String getNoRequirementsFoundText() {
        return noRequirementsFoundText.getText();
    }
}
