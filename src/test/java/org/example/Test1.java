package org.example;

import org.example.pages.AvitoElectronicPage;
import org.example.pages.AvitoHomePage;
import org.example.pages.AvitoPhonePage;
import org.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {

    private AvitoHomePage avitoHomePage;
    private AvitoElectronicPage avitoElectronicPage;
    private AvitoPhonePage avitoPhonePage;
    private BasePage basePage;
    private WebDriver driver = WebDriverProvider.getDriver();

    @BeforeClass
    public void beforeClass() {
        basePage = new BasePage(driver);
        avitoHomePage = new AvitoHomePage(driver);
        avitoElectronicPage = new AvitoElectronicPage(driver);
        avitoPhonePage = new AvitoPhonePage(driver);
        basePage.openBasePage();
    }

    @Test
    public void test() {
        avitoHomePage.clickElectronicButton();
        avitoElectronicPage.checkCardsVisibility();
        avitoElectronicPage.clickPhonesCard();
        avitoPhonePage.fillInput("Apple");
        avitoPhonePage.clickSearchButton();
        avitoPhonePage.checkProductCards();
    }

    @AfterClass
    public void afterClass() {
        basePage.closeWebDriver();
    }
}
