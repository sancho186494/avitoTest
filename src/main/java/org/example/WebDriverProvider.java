package org.example;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;
import java.util.Objects;

public class WebDriverProvider {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (Objects.isNull(driver)) {
            WebDriver driver = new ChromeDriver(getChromeOptions());
            driver.manage().window().setSize(new Dimension(1600, 900));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            return driver;
        } else {
            return driver;
        }
    }

    private static ChromeOptions getChromeOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        return chromeOptions;
    }
}
