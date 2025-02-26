package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AvitoHome {
    private WebDriver driver;
    Actions actions;
    private By electronicButton = By.xpath("//img[@alt = 'Электроника']");

    public AvitoHome(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
    }

    public void clickElectronicButton() {
        WebElement element = driver.findElement(electronicButton);
        element.click();
    }
}
