import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import stepdefs.CommonStepObjects;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","json:target/cucumber.json"},
        features = {"src/test/resource"},
        tags = {"@SmokeTest"},
        glue = "stepdefs"
)

public class RunCukesTest {

    @AfterClass
    public static void TearDown() {
        CommonStepObjects.closeDriver();
    }
}
