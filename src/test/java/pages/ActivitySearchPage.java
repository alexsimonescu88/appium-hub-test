package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivitySearchPage {

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"My hub\"]")
    private WebElement homePageButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"No Activities Found\"]")
    private WebElement noActivitiesFoundText;

    public ActivitySearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void navigateBackToHomePage() {
        homePageButton.click();
    }

    public String getNoActivitiesFoundText() {
        return noActivitiesFoundText.getText();
    }
}
