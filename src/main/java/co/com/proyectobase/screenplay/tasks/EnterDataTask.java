package co.com.proyectobase.screenplay.tasks;


import co.com.proyectobase.screenplay.userinterface.DXHotelsHomeUI;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class EnterDataTask implements Task {

    public EnterDataTask(String location, String checkIn, String checkOut) {
        super();
        this.location = location;
        this.CheckIn = checkIn;
        this.CheckOut = checkOut;

    }

    private String location;
    private String CheckIn;
    private String CheckOut;

    private DXHotelsHomeUI dxhotelsHomePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        //actor.attemptsTo(Open.browserOn(dxhotelsHomePage));

        actor.attemptsTo(Click.on(DXHotelsHomeUI.BOTTON_LOCATION));
        actor.attemptsTo(Click.on(Target.the("Muestra listado de destinos").located(By.xpath("//div[@class='dx-item-content dx-list-item-content'][contains(text(), '" + location + "')]"))));

        actor.attemptsTo(Click.on(DXHotelsHomeUI.BOTTON_CHECKIN_PTION));
        actor.attemptsTo(Enter.theValue(CheckIn).into(DXHotelsHomeUI.BOTTON_CHECKIN_TEXT));

        actor.attemptsTo(Click.on(DXHotelsHomeUI.BOTTON_CHECKOUT_PTION));
        actor.attemptsTo(Enter.theValue(CheckOut).into(DXHotelsHomeUI.BOTTON_CHECKOUT_TEXT));


    }

    public static EnterDataTask PaginaDXHotels(String location, String CheckIn, String CheckOut) {
        return Tasks.instrumented(EnterDataTask.class, location, CheckIn, CheckOut);
    }
}
