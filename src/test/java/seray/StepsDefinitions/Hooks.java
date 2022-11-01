package seray.StepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import seray.Utils.BrowserUtils;
import seray.Utils.Driver;

public class Hooks extends BrowserUtils {
    //testng = baseclass >>> before after class/method
    private static final Logger logger = Logger.getLogger(Hooks.class);

    //cucumber = hooks >>
    @Before
    public void setup(){
        Driver.getDriver();
        logger.info("Driver is successfully started");
        //setWaitTime();
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().deleteAllCookies();

    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            byte[] data=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data, "image/png", scenario.getName());
        }

        //Driver.closeDriver();


    }

}
