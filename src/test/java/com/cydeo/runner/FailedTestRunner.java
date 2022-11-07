package com.cydeo.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/return.txt",
        glue = "com/cydeo/step_definitions"
// we don't need to plug because we don't create any file
)
public class FailedTestRunner {

}
// this runner class will be running only failed scenarios