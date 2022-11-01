package seray.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources", // features>>> path from content  >>> content root
        glue = "seray/StepsDefinitions", //step definitions                 >> source root
        tags = "@TC1",
        dryRun = false,// without open browser >> true   | false opens browser
        plugin = {
                "pretty",
                "rerun:target/rerun.txt",
                "html:target/default-cucumber-reports.html",
                "json:target/cucumber.json",


        }
)


public class TestRunner {

}
