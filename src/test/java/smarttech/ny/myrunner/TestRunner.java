package smarttech.ny.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		plugin= {"pretty","json:target/cucumber.json" }, 	
		features = { ".//Features/" },
		glue = { "smarttech.ny.stepdefinition","smarttech.ny.hooks" }
		)


public class TestRunner extends AbstractTestNGCucumberTests {




}
