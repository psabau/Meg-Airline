
package v3;

public class Flights_Class implements Flight_Interface{
    private String FlightCode, Places;

    public Flights_Class(String FlightCode, String places){
        this.FlightCode = FlightCode;
        this.Places = places;
    }

    public String getPlaces() {
        return Places;
    }

    public String getFlightCode() {
        return FlightCode;
    }
}
