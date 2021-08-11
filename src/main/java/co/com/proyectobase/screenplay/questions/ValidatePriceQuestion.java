package co.com.proyectobase.screenplay.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;

import static co.com.proyectobase.screenplay.userinterface.ReservationUI.TOTAL_TO_PAY_NOW;

public class ValidatePriceQuestion implements Question<String> {

    private String total;

    @Step("Validate Price")
    @Override
    public String answeredBy(Actor actor) {

        total = Text.of(TOTAL_TO_PAY_NOW).viewedBy(actor).asString();
        System.out.println(total);
        return Text.of(TOTAL_TO_PAY_NOW).viewedBy(actor).asString();

    }

    public static ValidatePriceQuestion BuscarHotel() {
        return new ValidatePriceQuestion();
    }
}
