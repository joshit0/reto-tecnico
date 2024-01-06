package demoblaze.pages;

import net.thucydides.core.pages.PageObject;

public class ProductPage extends PageObject {


    public String xpathCategory = "//a[@id='cat']/../a[text()='[CATEGORY_NAME]']";
    public String xpathProduct = "//div[@class='card-block']/h4/a[text()='[PRODUCT_NAME]']";
}
