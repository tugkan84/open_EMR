package seray.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import seray.Utils.BrowserUtils;
import seray.Utils.Driver;

public class FacilityPage extends BrowserUtils {
    @FindBy(xpath = "(//div[contains(text(),'Admin')])[1]")
    private WebElement Admin;

    @FindBy(xpath = "(//div[contains(text(),'Clinic')])[1]")
    private WebElement Clinic;

    @FindBy(xpath = "(//div[contains(text(),'Facilities')])[1]")
    private WebElement Facilities;

    @FindBy(xpath = "(//h2[contains(text(),'Facilities')])[1]")
    private WebElement FacilitiesText;

    @FindBy(tagName = "a")
    private WebElement AddFacilityButton;

    @FindBy(name = "adm")
    private WebElement facilityTextFrame;

    @FindBy(name = "facility")
    private WebElement name;

    @FindBy(name = "street")
    private WebElement address;

    @FindBy(name = "federal_ein")
    private WebElement taxId;

    @FindBy(name = "pos_code")
    private WebElement posCode;

    @FindBy(name = "phone")
    private WebElement phone;

    @FindBy(name = "ncolor")
    private WebElement color;

    @FindBy(xpath = "//iframe[@id='modalframe']")
    private WebElement iFrameFacilities;

    @FindBy(xpath = "(//button[@class='btn btn-primary btn-save'])[1]")
    private WebElement Savebutton;

    public void setFacilities(){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(Admin).click(Clinic).click(Facilities).build().perform();

    }
    public String setFacilitiesText(){
        Driver.getDriver().switchTo().frame(facilityTextFrame);
        return FacilitiesText.getText();

    }
    public void setAddFacilityButton(){
        AddFacilityButton.click();
        Driver.getDriver().switchTo().window(Driver.getDriver().getWindowHandle());
        Driver.getDriver().switchTo().frame(iFrameFacilities);
    }
    public void setRequiredFields(String name, String taxID,String posCode,String address, String phone,String color){
        this.name.sendKeys(name);
        this.taxId.sendKeys(taxID);
        Select select = new Select(this.posCode);
        select.selectByVisibleText(posCode);
        this.address.sendKeys(address);
        this.phone.sendKeys(phone);
        this.color.sendKeys(color);
    }
    public void setSaveButton(){
        BrowserUtils.staticWait(2);
        Savebutton.click();
    }
}
