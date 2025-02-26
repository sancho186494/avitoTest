package org.example;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class Test1 {

  @Test
    public  void test () {
        ChromeSetings chromeSetings = new ChromeSetings();
        WebDriver driver = chromeSetings.getDriver();
        AvitoHome avitoHome = new AvitoHome(driver);
        AvitoElectronic avitoElectronic = new AvitoElectronic(driver);
        AvitoPhone avitoPhone = new AvitoPhone(driver);


        avitoHome.clickElectronicButton();
        avitoElectronic.checkAndClick();
        avitoPhone.sendInputAndClickSearch();
        avitoPhone.checkProductCards();
        driver.quit();
    }
}
