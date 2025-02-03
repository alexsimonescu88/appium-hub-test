package org.knight.automation.pages.ios;

import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HubNotificationsFilterPage extends BasePage {

    @FindBy()
    private WebElement notificationsButton;

    public HubNotificationsFilterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
