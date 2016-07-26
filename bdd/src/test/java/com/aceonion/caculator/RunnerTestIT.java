package com.aceonion.caculator;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "bdd/src/test/resources"
)
public class RunnerTestIT {
}
