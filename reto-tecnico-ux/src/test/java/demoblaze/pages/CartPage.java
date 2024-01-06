package demoblaze.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageObject {

    @FindBy(xpath = "//button[text()='Place Order']")
    public WebElement btnPlaceOrder;

    @FindBy(id = "name")
    public WebElement txtName;

    @FindBy(id = "country")
    public WebElement txtCountry;

    @FindBy(id = "city")
    public WebElement txtCity;

    @FindBy(id = "card")
    public WebElement txtCard;

    @FindBy(id = "month")
    public WebElement txtMonth;

    @FindBy(id = "year")
    public WebElement txtYear;

    @FindBy(xpath = "//button[text()='Purchase']")
    public WebElement btnPurchase;

    @FindBy(xpath = "//button[text()='Close']")
    public WebElement btnClose;

    @FindBy(xpath = "//div[contains(@class,'sweet-alert')]/h2")
    public WebElement lblSuccess;

    @FindBy(xpath = "//p[@class='lead text-muted ']")
    public WebElement lblInfoSuccess;

    @FindBy(xpath = "//button[text()='OK']")
    public WebElement btnOK;

}
