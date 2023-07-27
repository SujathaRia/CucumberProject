package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		monochrome = true,
		plugin = {"pretty","html:target/html-cucumber","json:target/cucumber.json"},
		features = "src/test/java/features", 
		glue = "stepdefs",
		//tags = {"@WIP"} 
		//tags = {"@Regression or @Sanity"}
		//tags = {"@Calculator"}
		//tags = {"not @WIP"}
		tags = {"@Browser and not @WIP"}
		)


public class TestRunner {
	

}

