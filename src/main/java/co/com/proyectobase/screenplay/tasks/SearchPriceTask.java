package co.com.proyectobase.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SearchPriceTask implements Task {

    public SearchPriceTask(String palabra) {
        super();
        this.palabra = palabra;
    }

    private String palabra;

    @Override
    public <T extends Actor> void performAs(T actor) {


    }


    public static SearchPriceTask MenorPrecio() {
        return Tasks.instrumented(SearchPriceTask.class);
    }


}
