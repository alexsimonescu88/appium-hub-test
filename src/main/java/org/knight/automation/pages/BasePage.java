package org.knight.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Waits for a WebElement to be visible.
     *
     * @param element The WebElement to wait for.
     * @param timeoutInSeconds The timeout duration in seconds.
     * @return The visible WebElement.
     */
    protected WebElement waitForVisibility(WebElement element, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * Waits for a WebElement to be clickable.
     *
     * @param element The WebElement to wait for.
     * @param timeoutInSeconds The timeout duration in seconds.
     * @return The clickable WebElement.
     */
    protected WebElement waitForClickability(WebElement element, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
