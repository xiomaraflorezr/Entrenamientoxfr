package co.com.proyectobase.screenplay.interactions;

import co.com.proyectobase.screenplay.userinterface.DXHotelsHomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class PaginationDataInteractions implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DXHotelsHomeUI.BOTTON_SEARCH));
        actor.attemptsTo(WaitInteractions.theNext(10));
    }

    public static PaginationDataInteractions PaginaDXHotels() {
        return Tasks.instrumented(PaginationDataInteractions.class);
    }
}
