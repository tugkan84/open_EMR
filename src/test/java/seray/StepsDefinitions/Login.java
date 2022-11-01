package seray.StepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import seray.Pages.LoginPage;
import seray.Utils.BrowserUtils;
import seray.Utils.ConfigurationsReader;
import seray.Utils.Driver;

public class Login extends BrowserUtils {

    LoginPage loginPage = new LoginPage();

    @Given("User navigates to website")
    public void user_navigates_to_website() {
        System.out.println("We are in login page");
        Driver.getDriver().get(ConfigurationsReader.getProperties("url"));
        Assert.assertEquals("OpenEMR Login", Driver.getDriver().getTitle());
    }

    @When("User enters valid username")
    public void user_enters_valid_username() {
        loginPage.setUserName();

    }

    @Then("User enters valid password")
    public void user_enters_valid_password() {
        loginPage.setPassWord();
    }

    @Then("User select {string}")
    public void user_select(String language) {
        loginPage.setSelectLanguage(language);
    }

    @Then("User clicks login button")
    public void user_clicks_login_button() {
        loginPage.setLoginButton();
    }

    @Then("User verifies homes page title as {string}")
    public void user_verifies_homes_page_title_as(String title) {
    String actualHomePageTitle = loginPage.getTitle();
    Assert.assertEquals(title,actualHomePageTitle);
    }

    @When("User enters invalid username")
    public void user_enters_invalid_username() {
    loginPage.setInvalidUsername();
    }
    @Then("User gets error message as {string}")
    public void user_gets_error_message_as(String errorMessage) {
    String actualErrorMessage = loginPage.setErrorMessage();
    Assert.assertEquals(actualErrorMessage,errorMessage);
    }

    @Then("User enters invalid password")
    public void user_enters_invalid_password() {
        loginPage.setInvalidPassword();
    }

}
