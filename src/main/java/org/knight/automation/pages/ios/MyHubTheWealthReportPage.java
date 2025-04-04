package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyHubTheWealthReportPage extends BasePage {

    @FindBy(id = "My hub")
    private WebElement myHubButton;

    public MyHubTheWealthReportPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getMyHubButton() {
        return waitForVisibility(myHubButton, 20);
    }
}
