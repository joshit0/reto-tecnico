package demoblaze.tasks;

import demoblaze.pages.MenuPage;
import net.serenitybdd.core.annotations.findby.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTask {

	MenuPage menuPage;
	private WebDriverWait wait;

	public void ClickElement(WebElement element) {
		wait = new WebDriverWait(menuPage.getDriver(), 30);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	public void ClickElementByXpath(String xpathString) {
		wait = new WebDriverWait(menuPage.getDriver(), 30);
		wait.until(ExpectedConditions.elementToBeClickable(menuPage.getDriver().findElement(By.xpath(xpathString))))
				.click();

	}

	public void SendKeys(WebElement element, String text) {
		wait = new WebDriverWait(menuPage.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
	}

	public String GetTextFromElement(WebElement element) {
		wait = new WebDriverWait(menuPage.getDriver(), 30);
		return wait.until(ExpectedConditions.visibilityOf(element)).getText();
	}

	public void WaitForElement(WebElement element) {
		wait = new WebDriverWait(menuPage.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public String GetUrl() {
		return menuPage.getDriver().getCurrentUrl();
	}

	public void AcceptAlert() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		menuPage.getDriver().switchTo().alert().accept();
	}
}
