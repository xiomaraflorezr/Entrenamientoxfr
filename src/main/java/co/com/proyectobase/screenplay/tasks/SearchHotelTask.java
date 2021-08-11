package co.com.proyectobase.screenplay.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

import co.com.proyectobase.screenplay.exceptions.HotelsPriceRequestExcep;
import co.com.proyectobase.screenplay.models.DataToReserveModel;
import co.com.proyectobase.screenplay.userinterface.DXHotelsHomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

public class SearchHotelTask implements Task {

    private DataToReserveModel data;

    public SearchHotelTask(DataToReserveModel data) {
        this.data = data;
    }

    @Step("Search Hotel For Reserve")
    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(
                    Click.on(DXHotelsHomeUI.SELECT_LOCATION),
                    Click.on(DXHotelsHomeUI.TEXT_FIELD_LOCATION.of(data.getLocation())),
                    Enter.theValue(data.getCheckIn()).into(DXHotelsHomeUI.TEXT_FIELD_CHECKIN),
                    WaitUntil.the(DXHotelsHomeUI.TEXT_FIELD_CHECKOUT, isEnabled()), Click.on(DXHotelsHomeUI.TEXT_FIELD_CHECKOUT),
                    Enter.theValue(data.getCheckOut()).into(DXHotelsHomeUI.TEXT_FIELD_CHECKOUT),
                    Click.on(DXHotelsHomeUI.BUTTON_SEARCH));
        } catch (Exception e) {
            throw new HotelsPriceRequestExcep(HotelsPriceRequestExcep.HOTE_INQUIRY_MESSAGE, e);
        }
    }

    public static SearchHotelTask forReserve(DataToReserveModel data) {
        return instrumented(SearchHotelTask.class, data);
    }
}