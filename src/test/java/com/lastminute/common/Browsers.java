package com.lastminute.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;


import java.util.concurrent.TimeUnit;

public class Browsers extends Driver {
    private WebDriver initChrome() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    private WebDriver initHeadlessChrome() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable--gpu", "--headless");
        return new ChromeDriver(options);
    }

    private WebDriver initFirefox() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    private FirefoxDriver initHeadlessFirefox() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--disable--gpu", "--headless");
        return new FirefoxDriver(options);
    }

    private InternetExplorerDriver initInternetExplorer() {
        WebDriverManager.iedriver().setup();
        return new InternetExplorerDriver();
    }

    public void launchBrowser(String browser) {
        switch (browser) {
            case "Chrome":
                driver = initChrome();
                break;
            case "HeadlessChrome":
                driver = initHeadlessChrome();
                break;
            case "Firefox":
                driver = initFirefox();
                break;
            case "HeadlessFirefox":
                driver = initHeadlessFirefox();
                break;
            case "InternetExplorer":
            case "ie":
            case "IE":
                driver = initInternetExplorer();
                break;
            default:
                driver = initChrome();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }
    public void closeBrowser() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}