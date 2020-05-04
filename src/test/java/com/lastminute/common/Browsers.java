package com.lastminute.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import sun.tools.java.IdentifierToken;

import java.util.concurrent.TimeUnit;

public class Browsers extends Driver {
//1. initDriver methods(private, 2. launch Browsers method. 3. closeBrowser methods

    private WebDriver initChrome(){

        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
    private WebDriver initHeadlessChrome(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable--gpu","--headless");
        return new ChromeDriver(options);
    }

    private WebDriver initFirefox(){
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
    private WebDriver initHeadlessFirefox(){
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--disable--gpu","--headless");
        return new FirefoxDriver(options);
    }

    private WebDriver initInternetExplorer(){
        WebDriverManager.iedriver().setup();
        return new InternetExplorerDriver();
    }

    public void launchBrowser(String browser){
        //1. switch statement, 2. set the pages properties here
        switch (browser){
            case"Chrome":
                driver  = initChrome();
                break;
            case"HeadlessChrome":
                driver= initHeadlessChrome();
                break;
            case"Firefox":
                driver = initFirefox();
                break;
            case"HeadlessFirefox":
                driver= initHeadlessFirefox();
                break;
            case"ie":
            case"IE":
            case"InternetExplorer":
                driver= initInternetExplorer();
                break;
            default:
                driver = initChrome();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
    }

    public void closeBrowser(){
        driver.manage().deleteAllCookies();
        driver.quit();
    }


}
