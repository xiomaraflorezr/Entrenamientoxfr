package co.com.proyectobase.screenplay.exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class HotelsPriceRequestExcep extends SerenityManagedException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public static final String HOTE_INQUIRY_MESSAGE = "Failure To Check Hotel";

    public HotelsPriceRequestExcep(String message, Throwable testErrorException) {
        super(message, testErrorException);
    }
}