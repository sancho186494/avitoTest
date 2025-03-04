package org.example.pages;

import io.qameta.allure.Step;
import org.example.elements.AvitoHomeElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AvitoHomePage extends BasePage {

    private AvitoHomeElements elements;

    public AvitoHomePage(WebDriver driver) {
        super(driver);
        this.elements = new AvitoHomeElements();
    }

    @Step("Нажать кнопку 'Электроника'")
    public void clickElectronicButton() {
        driver.findElement(elements.getElectronicButton()).click();
    }
}
