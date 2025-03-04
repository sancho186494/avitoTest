package org.example.pages;

import io.qameta.allure.Step;
import org.example.elements.AvitoElectronicElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class AvitoElectronicPage extends BasePage {

    private WebDriverWait wait;
    private AvitoElectronicElements elements;

    public AvitoElectronicPage(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elements = new AvitoElectronicElements();
    }

    @Step("Проверить видимость карточек 'Телефоны', 'Бытовая техника', 'Ноутбуки'")
    public void checkCardsVisibility() {
        wait.until(visibilityOfAllElements(
                driver.findElement(elements.getPhoneButton()),
                driver.findElement(elements.getAppliances()),
                driver.findElement(elements.getLaptop())
        ));
    }

    @Step("Нажать карточку 'Телефоны'")
    public void clickPhonesCard() {
        actions.moveToElement(driver.findElement(elements.getPhoneButton())).click().perform();
    }
}
