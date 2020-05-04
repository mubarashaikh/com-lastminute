package com.lastminute.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/com/lastminute/features"},

        glue = {"com/lastminute/hooks","com/lastminute/stepDefinitions"},

        plugin = {"pretty","json:target/report.json",
                "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"}
        )
public class TestRunner {
}
