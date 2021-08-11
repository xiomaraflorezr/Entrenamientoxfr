package co.com.proyectobase.screenplay.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/Searchhotelexit.feature",
        tags= "@tag",
        glue = "co.com.proyectobase.screenplay.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTagsExit {

}
