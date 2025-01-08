package org.knight.automation.pages.ios;


import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TheViewPage extends BasePage {

    @FindBy(xpath = "//XCUIElementTypeOther[@name=\"SafariWindow?View=Narrow&BarsKeptMinimized=false&UUID=87DADE45-515C-4684-A7B3-F6419240B56D&SupportsTabBar=true&UsingLoweredBar=true&UsingUnifiedBar=false\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther")
    private WebElement backToApp;

    public TheViewPage(WebDriver driver) {
        super(driver);
    }
}