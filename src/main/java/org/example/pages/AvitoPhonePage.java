package org.example.pages;

import io.qameta.allure.Step;
import org.example.elements.AvitoPhoneElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class AvitoPhonePage extends BasePage {

    private WebDriverWait wait;
    private AvitoPhoneElements elements;

    public AvitoPhonePage(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        this.elements = new AvitoPhoneElements();
    }

    @Step("Заполнить поле поиск значением '{0}'")
    public void fillInput(String input) {
        WebElement inputElement = wait.until(visibilityOfElementLocated(elements.getInput()));
        inputElement.click();
        inputElement.sendKeys(input);
    }

    @Step("Нажать кнопку поиск")
    public void clickSearchButton() {
        driver.findElement(elements.getButtonSearch()).click();
    }

    @Step("Проверить наличие списка товаров")
    public void checkProductCards() {
        List<WebElement> productCards = driver.findElements(elements.getProductCards());
        wait.until(visibilityOfAllElements(productCards));
        assertThat("Список товаров пустой", !productCards.isEmpty());
    }
}
