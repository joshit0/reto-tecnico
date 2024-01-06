package demoblaze.stepdefinitions;

import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Cuando;
import demoblaze.tasks.LoginTask;
import demoblaze.tasks.MenuTask;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinition {

	@Steps
	LoginTask loginTask;
	
	@Steps
	MenuTask menuTask;

	@Dado("^ingreso al sistema con las credenciales '(.+)', '(.+)'$")
	public void realizar_login(String username, String password)  {
		loginTask.IngresarUsuario(username);
		loginTask.IngresarPassword(password);
		loginTask.ClicLogin();
	}

	@Dado("^ingreso usuario '(.+)'$")
	public void ingreso_usuario(String username)  {
		loginTask.IngresarUsuario(username);
	}

	@Dado("ingreso clave '(.+)'")
	public void ingreso_password(String password)  {
		loginTask.IngresarPassword(password);
	}

	@Cuando("^doy clic a login$")
	public void doy_clic_a_login()  {
		loginTask.ClicLogin();
	}

	
}