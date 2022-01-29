package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        monochrome = true,
        glue = "stepDefs",
        plugin = {"pretty", "com.epam.reportportal.cucumber.StepReporter"},
        tags = "@Regression"
)
public class TestRunner {

}
