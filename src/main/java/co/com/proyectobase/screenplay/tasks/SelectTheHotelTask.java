package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.interactions.LowerPriceInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectTheHotelTask implements Task {


    @Step("Select The Hotel With Lowest Cost")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(LowerPriceInteractions.theHotel());
    }

    public static SelectTheHotelTask withLowestCost() {
        return instrumented(SelectTheHotelTask.class);
    }
}
