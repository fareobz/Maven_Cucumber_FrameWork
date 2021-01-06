package com.cucumber_maven.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "@target/failed.txt", 
		glue="com/cucumber_maven/steps", 
		monochrome = true
		,plugin= {
				"pretty",
				"html:target/cucumber-default-report",//create basic html report in specified location
		
		}
		)

public class FailedRunner {

}