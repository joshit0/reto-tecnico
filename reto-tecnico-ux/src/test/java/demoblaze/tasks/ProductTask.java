package demoblaze.tasks;

import net.thucydides.core.annotations.Step;
import demoblaze.pages.ProductPage;

public class ProductTask extends BaseTask {

	ProductPage productPage;
	
	@Step("Selecciono la categoria: {0}")
	public void SeleccionarCategoria(String categoryName) {
		String strXpathElement = productPage.xpathCategory.replace("[CATEGORY_NAME]",categoryName);
		ClickElementByXpath(strXpathElement);
	}

	@Step("Selecciono el producto: {0}")
	public void SeleccionarProducto(String productName) {
		String strXpathElement = productPage.xpathProduct.replace("[PRODUCT_NAME]",productName);
		ClickElementByXpath(strXpathElement);
	}

}
