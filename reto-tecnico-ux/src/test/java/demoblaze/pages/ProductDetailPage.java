package demoblaze.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends PageObject {

    @FindBy(xpath = "//a[text()='Add to cart']")
    public WebElement btnAddToCart;

    @FindBy(xpath = "//h3[@class='price-container']")
    public WebElement lblPrice;
}
