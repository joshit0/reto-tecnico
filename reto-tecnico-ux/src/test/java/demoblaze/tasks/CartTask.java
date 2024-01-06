package demoblaze.tasks;

import net.thucydides.core.annotations.Step;
import demoblaze.models.PricesModel;
import demoblaze.pages.CartPage;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CartTask extends BaseTask {

	CartPage cartPage;

	@Step("Realizar pedido")
	public void RealizarPedido() {
		ClickElement(cartPage.btnPlaceOrder);
	}

	@Step("Ingresar nombre: {0}")
	public void IngresarNombre(String name) {
		SendKeys(cartPage.txtName, name);
	}

	@Step("Ingresar country: {0}")
	public void IngresarCountry(String country) {
		SendKeys(cartPage.txtCountry, country);
	}

	@Step("Ingresar city: {0}")
	public void IngresarCity(String city) {
		SendKeys(cartPage.txtCity, city);
	}

	@Step("Ingresar card number: {0}")
	public void IngresarCardNumber(String cardNumber) {
		SendKeys(cartPage.txtCard, cardNumber);
	}

	@Step("Ingresar month: {0}")
	public void IngresarMonth(String month) {
		SendKeys(cartPage.txtMonth, month);
	}

	@Step("Ingresar year: {0}")
	public void IngresarYear(String year) {
		SendKeys(cartPage.txtYear, year);
	}

	@Step("Dar clic a purchase")
	public void DarClicAPurchase() {
		ClickElement(cartPage.btnPurchase);
	}

	@Step("Obtener mensaje de confirmación")
	public String ObtenerMensajeDeConfirmacion() {
		return GetTextFromElement(cartPage.lblSuccess);
	}

	@Step("Obtener precio total en pantalla")
	public Integer ObtenerPrecioTotalEnPantalla() {
		Pattern pattern = Pattern.compile("Amount: (\\d+) USD");
		Matcher matcher = pattern.matcher(GetTextFromElement(cartPage.lblInfoSuccess));
		if (matcher.find()) {
			return Integer.parseInt(matcher.group(1));
		}
		return null;
	}

	@Step("Obtener precio total calculado")
	public Integer ObtenerPrecioTotalCalculado() {
		return PricesModel.getPrecioTotal();
	}

}
