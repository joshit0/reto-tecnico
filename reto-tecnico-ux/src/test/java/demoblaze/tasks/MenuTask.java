package demoblaze.tasks;

import net.thucydides.core.annotations.Step;
import demoblaze.pages.MenuPage;

public class MenuTask extends BaseTask {

	MenuPage menuPage;

	@Step("Abrir URL")
	public void AbrirUrl() {
		menuPage.open();
	}

	@Step("Ir a menu: {0}")
	public void IrMenu(String option) {
		switch (option.toLowerCase()) {
			case "login":
				ClickElement(menuPage.lnkLogin);
				break;
			case "signin":
				ClickElement(menuPage.lnkSingin);
				break;
			case "cart":
				ClickElement(menuPage.lnkCart);
				break;
			case "about us":
				ClickElement(menuPage.lnkAboutUs);
				break;
			case "contact":
				ClickElement(menuPage.lnkContact);
				break;
			case "home":
				ClickElement(menuPage.lnkHome);
				break;
		}
	}
}
