package demoblaze.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Entonces;
import demoblaze.tasks.CartTask;
import demoblaze.tasks.MenuTask;
import net.thucydides.core.annotations.Steps;

public class CartStepDefinition {

	@Steps
	CartTask cartTask;

	@Steps
	MenuTask menuTask;

	@Cuando("^doy clic a realizar pedido$")
	public void selecciono_la_categoria() {
		cartTask.RealizarPedido();
	}

	@Cuando("ingreso el nombre '(.+)'")
	public void IngresarNombre(String name) {
		cartTask.IngresarNombre(name);
	}

	@Cuando("ingreso el country '(.+)'")
	public void IngresarCountry(String country) {
		cartTask.IngresarCountry(country);
	}

	@Cuando("ingreso el city '(.+)'")
	public void IngresarCity(String city) {
		cartTask.IngresarCity(city);
	}

	@Cuando("ingreso el card number '(.+)'")
	public void IngresarCardNumber(String cardNumber) {
		cartTask.IngresarCardNumber(cardNumber);
	}

	@Cuando("ingreso el month '(.+)'")
	public void IngresarMonth(String month) {
		cartTask.IngresarMonth(month);
	}

	@Cuando("ingreso el year '(.+)'")
	public void IngresarYear(String year) {
		cartTask.IngresarYear(year);
	}

	@Cuando("doy clic a purchase")
	public void DarClicAPurchase() {
		cartTask.DarClicAPurchase();
	}

	@Entonces("muestra mensaje '(.+)'")
	public void muestra_mensaje(String mensaje) {
		Assert.assertTrue("El mensaje de confirmación no es el esperado",
				cartTask.ObtenerMensajeDeConfirmacion().equals(mensaje));
	}

	@Entonces("valida que el monto total sea el correcto")
	public void valida_que_el_monto_total_sea_el_correcto() {
		int expected = cartTask.ObtenerPrecioTotalEnPantalla();
		int calculated = cartTask.ObtenerPrecioTotalCalculado();
		System.out.println("El monto visualizado en ux:" + expected);
		System.out.println("El monto calculado:" + calculated);
		
		Assert.assertTrue("El monto total es incorrecto: ux:" + expected + " - calculared:" + calculated,
				expected == calculated);
	}

	@Cuando("^completo los datos para realizar pedido$")
	public void completo_los_datos_para_realizar_pedido(List<Map<String, String>> dato) {
		menuTask.IrMenu("cart");
		cartTask.RealizarPedido();
		cartTask.IngresarNombre(dato.get(0).get("nombre"));
		cartTask.IngresarCountry(dato.get(0).get("country"));
		cartTask.IngresarCity(dato.get(0).get("city"));
		cartTask.IngresarCardNumber(dato.get(0).get("card_number"));
		cartTask.IngresarMonth(dato.get(0).get("month"));
		cartTask.IngresarYear(dato.get(0).get("year"));
		cartTask.DarClicAPurchase();
	}

}