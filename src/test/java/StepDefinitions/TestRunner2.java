package StepDefinitions;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features" ,
        glue = "StepDefinitions",
        monochrome = false,
        plugin = {"pretty", "html:target/reports"},
        dryRun = false,
        tags = "@outline"
)
public class TestRunner2 {
}
