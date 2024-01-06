package demoblaze.stepdefinitions;

import cucumber.api.java.es.Dado;
import demoblaze.models.PricesModel;
import demoblaze.tasks.MenuTask;
import net.thucydides.core.annotations.Steps;

public class MenuStepDefinition {

	@Steps
	MenuTask menuTask;

	@Dado("^abro pagina de demoblaze$")
	public void abro_pagina_de_login_de_herokuapp() {
		menuTask.AbrirUrl();
		PricesModel.setPrecioTotal(0);
	}

	@Dado("^voy al menu '(.+)'$")
	public void voy_al_menu(String menuOption) {
		menuTask.IrMenu(menuOption);
	}

}