package demoblaze.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.thucydides.core.pages.PageObject;

public class LoginPage extends PageObject {

    @FindBy(id = "loginusername")
    public WebElement txtUsername;

    @FindBy(id = "loginpassword")
    public WebElement txtPassword;

    @FindBy(xpath = "//button[text()='Log in']")
    public WebElement btnLogin;


    @FindBy(xpath = "//button[text()='Close']")
    public WebElement btnClose;
}
