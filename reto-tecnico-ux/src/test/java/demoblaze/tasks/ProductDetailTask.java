package demoblaze.tasks;

import net.thucydides.core.annotations.Step;
import demoblaze.models.PricesModel;
import demoblaze.pages.ProductDetailPage;

public class ProductDetailTask extends BaseTask {

	ProductDetailPage productDetailPage;

	@Step("Agregar al carrito")
	public void AgregarAlCarrito() {
		PricesModel.addPrecioProducto(
				Integer.parseInt(
						GetTextFromElement(productDetailPage.lblPrice)
								.replace("$", "")
								.replace("*includes tax", "")
								.trim()));
		ClickElement(productDetailPage.btnAddToCart);
		AcceptAlert();
	}

}
