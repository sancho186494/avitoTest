package org.example.elements;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;

@Getter
@Setter
@EqualsAndHashCode
public class AvitoElectronicElements {

    private By phoneButton = By.xpath("//div//img[@alt = 'Телефоны']");
    private By appliances = By.xpath("//div//img[@alt = 'Бытовая техника'][not(@data-index = '0')]");
    private By laptop = By.xpath("//div//a//img[@alt = 'Ноутбуки']");

}
