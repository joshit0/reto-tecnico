package demoblaze.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = { "html:target/build/cucumber-html-report",
		"pretty:target/build/cucumber-pretty.txt",
		"json:target/build/cucumber.json" },
		features = "src/test/java/demoblaze/features/",
		glue = { "demoblaze.stepdefinitions" })

public class SerenityRunner {
	/*
	 * Para ejecutar los test en maven utilizar este comando: mvn clean verify
	 * mvn clean verify -Dcucumber.options="--tags @login"
	 */
}
