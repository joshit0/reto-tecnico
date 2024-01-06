package demoblaze.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends PageObject {

    @FindBy(id = "login2")
    public WebElement lnkLogin;

    @FindBy(id = "logout2")
    public WebElement lnkLogout;

    @FindBy(id = "signin2")
    public WebElement lnkSingin;

    @FindBy(id = "cartur")
    public WebElement lnkCart;

    @FindBy(xpath = "//li/a[text()='About us']")
    public WebElement lnkAboutUs;

    @FindBy(xpath = "//li/a[text()='Contact']")
    public WebElement lnkContact;

    @FindBy(xpath = "//li/a[text()='Home ']")
    public WebElement lnkHome;
}
