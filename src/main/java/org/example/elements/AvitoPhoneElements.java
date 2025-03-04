package org.example.elements;

import lombok.Getter;
import org.openqa.selenium.By;

@Getter
public class AvitoPhoneElements {

    private By input = By.xpath("//input[@type='text']");
    private By buttonSearch = By.xpath("//button[@type = 'button'][@data-marker = 'search-filters/submit-button']");
    private By productCards = By.xpath("//div[@class = 'iva-item-body-GQomw']");

}
