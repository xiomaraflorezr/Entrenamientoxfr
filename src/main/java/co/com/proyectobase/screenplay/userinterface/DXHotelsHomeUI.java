package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://js.devexpress.com/Demos/DXHotels/#home")

public class DXHotelsHomeUI extends PageObject {

    public static final Target BOTTON_LOCATION = Target.the("El boton que muestra listado de lugares").located(By.xpath("//span[contains(text(),'Location')]"));
    public static final Target BOTTON_CHECKIN_PTION = Target.the("Posicion campo checkIn ").located(By.xpath("//input[contains(@id, '_checkIn')]"));
    public static final Target BOTTON_CHECKIN_TEXT = Target.the("Ingresar fecha campo checkIn ").located(By.xpath("//input[contains(@id, '_checkIn')]"));
    public static final Target BOTTON_CHECKOUT_PTION = Target.the("Posicion campo checkOut").located(By.xpath("//input[contains(@id, '_checkOut')]"));
    public static final Target BOTTON_CHECKOUT_TEXT = Target.the("Ingresar fecha campo checkOut").located(By.xpath("//input[contains(@id, '_checkOut')]"));
    public static final Target BOTTON_CHILDREN_PTION = Target.the("Ingresar fecha campo checkOut").located(By.xpath("//input[@autocomplete='off'][contains(@id,'children')]"));
    public static final Target BOTTON_SEARCH = Target.the("Boton Search").located(By.xpath("//span[contains(text(),'SEARCH')]"));

    public static final Target SELECT_LOCATION= Target.the("Select Location").locatedBy("(//input[@class='dx-texteditor-input'])[1]");
    public static final Target TEXT_FIELD_LOCATION= Target.the("Input text location").locatedBy("//div[@class='dx-item-content dx-list-item-content'][contains(text(),'{0}')]");
    public static final Target TEXT_FIELD_CHECKIN= Target.the("Field Text CheckIn").locatedBy("(//input[@class='dx-texteditor-input'])[2]");
    public static final Target TEXT_FIELD_CHECKOUT= Target.the("Field Text CheckOut").locatedBy("(//input[@class='dx-texteditor-input'])[3]");
    public static final Target BUTTON_SEARCH= Target.the("Button Search").locatedBy("//span[@class='dx-button-text'][contains(text(),'SEARCH')]");



}



