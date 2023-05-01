package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\luis_\\eclipse-workspace\\UITesting\\src\\test\\resources\\Features\\NormalSearchFlight.feature",
		glue={"StepDefinitions"},
		tags = "@test2luis",
		monochrome=true,
		strict=true,
		dryRun=false
		)

public class TestRunner {

}
