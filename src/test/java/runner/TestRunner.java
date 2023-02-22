package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
plugin = {"pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features = "src/test/resources/features/login.feature",
glue = {"stepDefinitions"},
dryRun = false,
monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests{

}

