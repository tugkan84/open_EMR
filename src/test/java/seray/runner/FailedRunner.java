package seray.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt", // features>>> path from content  >>> content root
        glue = "code/stepsDefinitions" , //step definitions                 >> source root

        dryRun = false ,// without open browser >> true   | false opens browser
        plugin ={
                "pretty",    // this is to have more understandable console logs
                "rerun:target/rerun.txt" , // store failed scenarios in rerun.txt file so that we can run them from
                //FailedRunner class
                //rerun logic is failed runner will help us to store failed scanrios
                "html:target/default-cucumber-reports.html",
                "json:target/cucumber.json",
        }
)

public class FailedRunner {
}
