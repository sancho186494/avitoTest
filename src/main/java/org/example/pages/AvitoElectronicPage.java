package org.example.pages;

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

    public void checkCardsVisibility() {
        wait.until(visibilityOfAllElements(
                driver.findElement(elements.getPhoneButton()),
                driver.findElement(elements.getAppliances()),
                driver.findElement(elements.getLaptop())
        ));
    }

    public void clickPhonesCard() {
        actions.moveToElement(driver.findElement(elements.getPhoneButton())).click().perform();
    }
}
