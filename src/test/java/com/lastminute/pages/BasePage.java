package com.lastminute.pages;



// here 1. here we create a common method to navigate via web-pages throughout the applications (launchUrl)
// 2. Create common webElements identifiers (Select, Actions, JavaExecutors)


import com.lastminute.common.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends Driver {

    public String BASE_URL = "https://www.lastminute.com/";
    public Select select;

    public void launchUrl(){

        driver.navigate().to(BASE_URL);
    }


    public void selectBytext(WebElement element, String text){
        select = new Select(element);
        select.selectByVisibleText(text);
    }
    public void selectByValue(WebElement element, String value){
        select = new Select(element);
        select.selectByValue(value);
    }
    public void selectByIndex(WebElement element, int index){
        select = new Select(element);
        select.selectByIndex(index);
    }

}
