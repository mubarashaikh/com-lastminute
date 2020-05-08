package com.lastminute.stepDefinitions;

import com.lastminute.pages.BasePage;
import com.lastminute.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class SearchFlightsSteps extends BasePage {

    HomePage homePage = PageFactory.initElements(driver, HomePage.class);


    @Given("i navigate to lastmint homepage")
    public void i_navigate_to_lastmint_homepage() {
        launchUrl();
    }

    @When("i select return type as {string}")
    public void i_select_return_type_as(String frlyingFrom) {
        homePage.enterFlyFrom(frlyingFrom);
    }

    @When("i enter from location as {string}")
    public void i_enter_from_location_as(String string) {

    }

    @When("i enter destination as {string}")
    public void i_enter_destination_as(String string) {

    }

    @When("i select the leave on date as {string}")
    public void i_select_the_leave_on_date_as(String string) {

    }

    @When("i select the returning on as {string}")
    public void i_select_the_returning_on_as(String string) {

    }

    @When("i click  on findbutton")
    public void i_click_on_findbutton() {

    }

    @Then("the results base on above are displayed")
    public void the_results_base_on_above_are_displayed() {

    }





}
