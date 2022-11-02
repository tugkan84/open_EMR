package seray.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import seray.Utils.BrowserUtils;
import seray.Utils.Driver;

public class LogOutPage extends BrowserUtils {

    @FindBy(id = "userData")
    private WebElement userData;

    @FindBy(css = "[data-bind='click: logout']")
    private WebElement logOutButton;

    public void setUserData(){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(userData).click(logOutButton).build().perform();

    }
    public String getTitle(){
        return Driver.getDriver().getTitle();
    }
}
