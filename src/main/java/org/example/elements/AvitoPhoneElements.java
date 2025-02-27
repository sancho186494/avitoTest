package org.example.elements;

import org.openqa.selenium.By;

public class AvitoPhoneElements {

    private By input = By.xpath("//input[@type='text']");
    private By buttonSearch = By.xpath("//button[@type = 'button'][@data-marker = 'search-filters/submit-button']");
    private By productCards = By.xpath("//div[@class = 'iva-item-body-GQomw']");

    public By getInput() {
        return input;
    }

    public By getButtonSearch() {
        return buttonSearch;
    }

    public By getProductCards() {
        return productCards;
    }
}
