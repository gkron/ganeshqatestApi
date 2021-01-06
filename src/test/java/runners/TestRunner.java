package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
 

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/functionalTests",
        glue = {"stepDefinitions"},
        plugin= {"html:target/cucumber-reports/advanced-reports"},
        monochrome = true,
        strict = true
)
public class TestRunner {
}