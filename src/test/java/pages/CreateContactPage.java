package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage {

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"My hub\"]")
    private WebElement homePageButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Duplicate check\"]")
    private WebElement duplicateCheckText;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Search\"]")
    private WebElement searchTitle;

    public CreateContactPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void navigateBackToHomePage() {
        homePageButton.click();
    }

    public String getDuplicateCheckText() {
        return duplicateCheckText.getText();
    }

    public String getSearchTitleText() {
        return searchTitle.getText();
    }
}
