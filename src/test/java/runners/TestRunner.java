package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features" , glue = "steps", tags = "@Sanity", plugin = {"pretty", "html:target/reports/report.html", "json:target/reports/report.json"}, monochrome = true)
public class TestRunner {

}