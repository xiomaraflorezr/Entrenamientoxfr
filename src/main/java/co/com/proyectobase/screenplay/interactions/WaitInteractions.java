package co.com.proyectobase.screenplay.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WaitInteractions implements Interaction {

    private int timeWait;

    public WaitInteractions(int timeWait) {
        this.timeWait = timeWait;
    }

    public int getTimeWait() {
        return timeWait;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int length = getTimeWait() * 1000;
        try {
            Thread.sleep(length);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static WaitInteractions theNext(int time) {
        return instrumented(WaitInteractions.class, time);
    }
}