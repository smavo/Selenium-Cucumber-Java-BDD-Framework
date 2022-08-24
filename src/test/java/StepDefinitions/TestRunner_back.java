package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Background/BackgroundTest.feature",  
		glue={"StepsBackground"},
		monochrome = true,
		plugin = {"pretty","html:target/HtmlReports", "json:target/JsonReports/report.json", "junit:target/JUnitReports/report.xml"}, 
		tags="@testing", 
		strict = true)

public class TestRunner_back {

}
