package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.interactions.PaginationDataInteractions;
import co.com.proyectobase.screenplay.models.DataToReserveModel;
import co.com.proyectobase.screenplay.questions.ValidatePriceQuestion;
import co.com.proyectobase.screenplay.tasks.ConfirmChildrenTask;
import co.com.proyectobase.screenplay.tasks.EnterDataTask;
import co.com.proyectobase.screenplay.tasks.SearchHotelTask;
import co.com.proyectobase.screenplay.tasks.SelectTheHotelTask;
import co.com.proyectobase.screenplay.userinterface.DXHotelsHomeUI;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class HotelStepDefintions {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor user = Actor.named("ProductOwer");
    private DXHotelsHomeUI page;

  /*  @Managed(driver = "firefox")
    private WebDriver herBrowser;
    private Actor user = Actor.named("usuario");
    private HomePage homePage;*/

    @Before
    public void configuracionInicial() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^the user enters the dx hotels application$")
    public void theUserEntersTheDxHotelsApplication() {
        user.wasAbleTo(Open.browserOn(page));
    }


    @And("^that the user select the destination (.*) in date range between (.*) and (.*)$")
    public void thatTheUserSelectTheDestinationLosAngelesInDateRangeBetweenAnd(String location, String CheckIn, String CheckOut) {
        user.attemptsTo((EnterDataTask.PaginaDXHotels(location, CheckIn, CheckOut)));
    }

    @And("^select rooms (.*) for people (.*) and children (.*)$")
    public void selectRoomsForPeopleAndChildren(String Rooms, String Adults, String Children) {
        user.attemptsTo((ConfirmChildrenTask.PaginaDXHotelsChildren(Children)));
    }

    @When("^to select the most economical hotel$")
    public void toselectthemosteconomicalhotel() {

        user.wasAbleTo(PaginationDataInteractions.PaginaDXHotels());
        user.attemptsTo(SelectTheHotelTask.withLowestCost());
       }

    @Then("^verify that the total price (.*) is correct$")
    public void verifythatthetotalpriceiscorrect(String price) {
        user.should(seeThat(ValidatePriceQuestion.BuscarHotel(), containsString(price)));

    }


    @When("^the user selects the options$")
    public void theUserSelectsTheOptions(List<DataToReserveModel> data) {
        user.attemptsTo(SearchHotelTask.forReserve(data.get(0)));

    }

    @And("^choose the cheapest hotel$")
    public void chooseTheCheapestHotel() {
        user.attemptsTo(SelectTheHotelTask.withLowestCost());


    }

    @Then("^validate that the total (.*) is correct$")
    public void validateThatTheTotalIsCorrect(String price) {
        user.should(seeThat(ValidatePriceQuestion.BuscarHotel(), containsString(price)));
    }

}
