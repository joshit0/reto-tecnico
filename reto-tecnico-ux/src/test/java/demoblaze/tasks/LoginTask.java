package demoblaze.tasks;

import net.thucydides.core.annotations.Step;
import demoblaze.pages.LoginPage;
import demoblaze.pages.MenuPage;

public class LoginTask extends BaseTask {

	LoginPage loginPage;
	MenuPage menuPage;
	
	@Step("Ingreso usuario")
	public void IngresarUsuario(String user) {
		SendKeys(loginPage.txtUsername,user);
	}

	@Step("Ingreso password")
	public void IngresarPassword(String password) {
		SendKeys(loginPage.txtPassword,password);
	}

	@Step("Doy click a Login")
	public void ClicLogin() {
		ClickElement(loginPage.btnLogin);
	}

}
