package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AvitoElectronic {
    private WebDriver driver;
    private WebDriverWait wait;
    Actions actions;
    private By phoneButton = By.xpath("//div//img[@alt = 'Телефоны']");
    private By appliances = By.xpath("//div//img[@alt = 'Бытовая техника'][not(@data-index = '0')]");
    private By laptop = By.xpath("//div//a//img[@alt = 'Ноутбуки']");

    public AvitoElectronic(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions = new Actions(driver);
    }

    public void checkAndClick() {
        WebElement button = driver.findElement(phoneButton);
        WebElement appli = driver.findElement(appliances);
        WebElement lap = driver.findElement(laptop);
        wait.until(ExpectedConditions.visibilityOfAllElements(button, appli, lap));
        actions.moveToElement(button).click().perform();
    }
}
