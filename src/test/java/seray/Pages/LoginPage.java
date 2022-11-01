package seray.Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import seray.Utils.BrowserUtils;
import seray.Utils.ConfigurationsReader;
import seray.Utils.Driver;

public class LoginPage extends BrowserUtils {
    @FindBy(id = "authUser")
    private WebElement userName;

    @FindBy(id = "clearPass")
    private WebElement passWord;

    @FindBy(css = "[name='languageChoice']:nth-child(1)")
    private WebElement selectLanguage;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(xpath = "//div[contains(text(),'Invalid username or password')]")
    private WebElement errorMessage;

    public void setUserName() {
        userName.sendKeys(ConfigurationsReader.getProperties("userName"));
    }
    public void setInvalidUsername(){
        userName.sendKeys("");
    }

    public void setPassWord() {
        passWord.sendKeys(ConfigurationsReader.getProperties("password"));
    }
    public void setInvalidPassword(){
        passWord.sendKeys("");
    }

    public void setSelectLanguage(String Language) {
        Select select = new Select(selectLanguage);
        select.selectByVisibleText(Language);
    }

    public void setLoginButton() {
        loginButton.click();
    }
    public String getTitle(){
        return Driver.getDriver().getTitle();
    }

    public String setErrorMessage() {
        return errorMessage.getText();
    }
}
