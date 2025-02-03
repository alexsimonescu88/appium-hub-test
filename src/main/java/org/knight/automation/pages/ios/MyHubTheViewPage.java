package org.knight.automation.pages.ios;


import org.knight.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyHubTheViewPage extends BasePage {

    @FindBy(xpath = "//XCUIElementTypeOther[@name=\"SafariWindow?View=Narrow&BarsKeptMinimized=false&UUID=87DADE45-515C-4684-A7B3-F6419240B56D&SupportsTabBar=true&UsingLoweredBar=true&UsingUnifiedBar=false\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther")
    private WebElement hubUatButton;

    @FindBy(xpath = "(//XCUIElementTypeLink[@name=\"The View Home\"])[1]")
    private WebElement theViewLabel;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"The contemporary appeal of the Cotswolds\"]")
    private WebElement articleTitle;

    public MyHubTheViewPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getHubUatButton() {
        return waitForVisibility(hubUatButton, 20);
    }

    public WebElement getTheViewLabel() {
        return waitForVisibility(theViewLabel, 20);
    }

    public WebElement getArticleTitle() {
        return waitForVisibility(articleTitle, 20);
    }
}
