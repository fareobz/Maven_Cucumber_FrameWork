package com.cucumber_maven.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/amazon.feature", 
glue = "com/cucumber_maven/steps",
dryRun = false,
tags = "@maro",
plugin = {
		"pretty", // prints gherkin steps in console
		"html:target/cucumber-default-report", // create basic html report in specified location
		"json:target/cucumber.json"
		// how to handle concurancy in java
		// extend the thread, implement runable.
})
public class SmokeRunner {

}
