package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AvitoPhone {
    private WebDriver driver;
    private WebDriverWait wait;
    private By input = By.xpath("//input[@type='text']");
    private By buttonSearch = By.xpath("//button[@type = 'button'][@data-marker = 'search-filters/submit-button']");
    private By prodectCards = By.xpath("//div[@class = 'iva-item-body-GQomw']");

    public AvitoPhone(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void sendInputAndClickSearch() {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(this.input));
        WebElement button = driver.findElement(this.buttonSearch);
        input.click();
        input.sendKeys("Apple");
        button.click();
    }

    public void checkProductCards() {
        List<WebElement> elements = driver.findElements(this.prodectCards);
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
        if (!elements.isEmpty()) {
            System.out.println("Товары присутствуют");
        }
    }
}
