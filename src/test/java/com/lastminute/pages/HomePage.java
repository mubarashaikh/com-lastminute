package com.lastminute.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

   @FindBy(css = "body > div.as-oil.light > div > div > div.as-oil-l-row.as-oil-l-buttons > div:nth-child(1) > button")
    private WebElement acceptButtonOfPopup;


    @FindBy(css = "#input-33gs6")
    private WebElement flightFrom;


    public void enterFlyFrom(String flyingFrom){
        acceptButtonOfPopup.click();
        flightFrom.clear();
        flightFrom.sendKeys(flyingFrom);
    }

}
