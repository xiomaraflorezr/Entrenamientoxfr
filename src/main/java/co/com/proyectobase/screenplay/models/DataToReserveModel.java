package co.com.proyectobase.screenplay.models;

public class DataToReserveModel {
    private String location = "";
    private String checkIn = "";
    private String checkOut = "";
    private String price = "";

    public DataToReserveModel(String location, String checkIn, String checkOut, String price) {
        this.location = location;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.price = price;

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getTotal() {
        return price;
    }

    public void setTotal(String total) {
        this.price = price;
    }
}

