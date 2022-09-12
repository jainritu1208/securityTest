package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
(
		features="src/test/resources/Features",
		glue="stepDefination",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty", "html:test-output"}
		)
public class testRunner {

}

/*
The Options tag is a part of the TestRunner file in the Cucumber framework, and it takes the form of an annotation named @CucumberOptions. 

It has two parameters: glue and feature:

Feature: The path to the feature file is specified by the feature option.
Glue: The glue argument is used to provide the step definition file's location.

*/