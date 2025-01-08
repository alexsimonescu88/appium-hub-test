package org.knight.automation.pages.ios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IphoneHomeScreenPage {

    @FindBy(id = "hub Uat")
    private WebElement hubUatApp;

    @FindBy(id = "Home screen icons")
    private WebElement homeScreenIcons;

    public IphoneHomeScreenPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getHubUatApp() {
        return hubUatApp;
    }

    public WebElement getHomeScreenIcons() {
        return homeScreenIcons;
    }
}
