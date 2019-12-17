package com.cucumber.StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/cucumber/features",
        glue = { "com.cucumber.StepDefinitions" },
        tags = {"@Login"},
        plugin = { 
                    "pretty",
                    "json:target/cucumber.json",
                    "html:target/cucumber-html-reports"
                } 

        )
public class RunCukeTest {
	
}