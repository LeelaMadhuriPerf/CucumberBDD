package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureWithTags",
glue= {"StepDefinitions"},
tags= {"@mustRun"}

)

public class TestRunner_RunWithSingleTag {

} 
