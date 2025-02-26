package org.example;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeSetings {
    WebDriver driver;
    ChromeOptions chromeOptions;

    public WebDriver getDriver() {
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        this.driver = new ChromeDriver(chromeOptions);
        driver.manage().window().setSize(new Dimension(1600, 900));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.avito.ru/");
        return driver;
    }


}
