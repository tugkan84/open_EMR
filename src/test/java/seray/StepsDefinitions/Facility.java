package seray.StepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import seray.Pages.FacilityPage;
import seray.Utils.BrowserUtils;

public class Facility extends BrowserUtils {

    FacilityPage facilityPage = new FacilityPage();
    @Given("User navigates to facilities")
    public void user_navigates_to_facilities() {
        BrowserUtils.staticWait(2);
    facilityPage.setFacilities();
    }
    @Given("User validates that user can see text as {string}")
    public void user_validates_that_user_can_see_text_as(String facilityText) {
        Assert.assertEquals(facilityText,facilityPage.setFacilitiesText());
    }
    @Then("User clicks Add facilities button")
    public void user_clicks_add_facilities_button() {
    facilityPage.setAddFacilityButton();
    }
    @Then("User add required facilities {string},{string},{string},{string},{string},{string}")
    public void user_add_required_facilities(String name, String taxid, String address, String posCode, String phone, String color) {
    facilityPage.setRequiredFields(name,taxid,address,posCode,phone,color);
    }
    @Then("User clicks the save button")
    public void user_clicks_the_save_button() {
        facilityPage.setSaveButton();

    }


}
