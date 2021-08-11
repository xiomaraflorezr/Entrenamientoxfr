package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.DXHotelsHomeUI;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ConfirmChildrenTask implements Task {
    public ConfirmChildrenTask(String children) {
        super();
        this.Children = children;

    }

    private String Children;
    private DXHotelsHomeUI dxhotelsHomePage;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(DXHotelsHomeUI.BOTTON_CHILDREN_PTION));
        actor.attemptsTo(Click.on(Target.the("Muestra listado de destinos").located(By.xpath("//div[@class='dx-item-content dx-list-item-content'][contains(text(), '" + Children + "')]"))));
    }

    public static ConfirmChildrenTask PaginaDXHotelsChildren(String Children) {
        return Tasks.instrumented(ConfirmChildrenTask.class, Children);
    }
}
