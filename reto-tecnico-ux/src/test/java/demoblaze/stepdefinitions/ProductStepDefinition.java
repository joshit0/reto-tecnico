package demoblaze.stepdefinitions;

import java.util.List;
import java.util.Map;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import demoblaze.tasks.MenuTask;
import demoblaze.tasks.ProductDetailTask;
import demoblaze.tasks.ProductTask;
import net.thucydides.core.annotations.Steps;

public class ProductStepDefinition {

	@Steps
	ProductTask productTask;

	@Steps
	ProductDetailTask productDetailTask;

	@Steps
	MenuTask menuTask;

	@Dado("^selecciono la categoria '(.+)'$")
	public void selecciono_la_categoria(String categoryName) {
		productTask.SeleccionarCategoria(categoryName);
	}

	@Dado("^selecciono el producto '(.+)'$")
	public void selecciono_el_producto(String productName) {
		productTask.SeleccionarProducto(productName);
	}

	@Cuando("^agrego el producto al carrito$")
	public void agrego_el_producto_al_carrito() {
		productDetailTask.AgregarAlCarrito();
	}

	@Dado("^agrego productos al carrito$")
	public void agrego_productos_al_carrito(List<Map<String, String>> productos) {
		for (Map<String, String> producto : productos) {
			productTask.SeleccionarCategoria(producto.get("category"));
			productTask.SeleccionarProducto(producto.get("product"));
			productDetailTask.AgregarAlCarrito();
			menuTask.IrMenu("home");
		}
	}

}