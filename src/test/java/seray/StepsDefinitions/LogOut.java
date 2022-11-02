package seray.StepsDefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import seray.Pages.LogOutPage;
import seray.Utils.BrowserUtils;

public class LogOut extends BrowserUtils {
    LogOutPage logOutPage = new LogOutPage();

    @When("User clicks to log out button")
    public void user_clicks_to_log_out_button() {
        logOutPage.setUserData();
    }

    @When("User navigates to login page with title {string}")
    public void user_navigates_to_login_page_with_title(String string) {
        Assert.assertEquals(logOutPage.getTitle(), string);
    }

}
