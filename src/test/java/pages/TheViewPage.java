package pages;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TheViewPage extends BaseTest {

    @FindBy(xpath = "//XCUIElementTypeOther[@name=\"SafariWindow?View=Narrow&BarsKeptMinimized=false&UUID=87DADE45-515C-4684-A7B3-F6419240B56D&SupportsTabBar=true&UsingLoweredBar=true&UsingUnifiedBar=false\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther")
    private WebElement backToApp;

    public TheViewPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
