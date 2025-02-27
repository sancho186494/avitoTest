package org.example.pages;

import org.aeonbits.owner.ConfigFactory;
import org.example.ProjectConfig;
import org.example.WebDriverProvider;
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
        driver.get(config.baseUrl());
    }

    public void closeWebDriver() {
        driver.quit();
    }

}
