package org.example.elements;

import org.openqa.selenium.By;

public class AvitoElectronicElements {

    private By phoneButton = By.xpath("//div//img[@alt = 'Телефоны']");
    private By appliances = By.xpath("//div//img[@alt = 'Бытовая техника'][not(@data-index = '0')]");
    private By laptop = By.xpath("//div//a//img[@alt = 'Ноутбуки']");

    public By getPhoneButton() {
        return phoneButton;
    }

    public By getAppliances() {
        return appliances;
    }

    public By getLaptop() {
        return laptop;
    }
}
