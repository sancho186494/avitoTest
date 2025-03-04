package org.example.pages;

import io.qameta.allure.Step;
import org.aeonbits.owner.ConfigFactory;
import org.example.ProjectConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BasePage {

    private ProjectConfig config;
    protected Actions actions;
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.config = ConfigFactory.create(ProjectConfig.class);
        this.driver = driver;
        this.actions = new Actions(driver);
    }

    public void openBasePage() {
        openUrl(config.baseUrl());
    }

    @Step("Открыть страницу '{0}'")
    public void openUrl(String url) {
        driver.get(url);
    }

    @Step("Закрыть браузер")
    public void closeWebDriver() {
        driver.quit();
    }

}
