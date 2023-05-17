package StepDefinitions;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features" ,
        glue = "StepDefinitions",
        monochrome = false,
        plugin = {"pretty", "html:target/reports"},
        dryRun = false,
        tags = "@scenario1 or @scenario2 or @outline"
)
public class TestRunner2 {

    public WebDriver driver;
}
