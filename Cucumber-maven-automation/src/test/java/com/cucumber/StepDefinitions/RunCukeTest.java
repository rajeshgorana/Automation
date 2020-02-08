package com.cucumber.StepDefinitions;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = false, format = { "pretty", "json:target/cucumber-report.json"}, tags = {"@login"},
features = "src/test/java/com/cucumber/features",
glue = "com.cucumber.StepDefinitions")
public class RunCukeTest {
	
} 