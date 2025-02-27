package org.example.elements;

import org.openqa.selenium.By;

public class AvitoHomeElements {

    private By electronicButton = By.xpath("//img[@alt = 'Электроника']");

    public By getElectronicButton() {
        return electronicButton;
    }
}
