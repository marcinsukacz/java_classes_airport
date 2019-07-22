import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {


    Flight flight1;
    Flight flight2;
    Plane plane1;
    Plane plane2;
    Passenger passenger1;
    Passenger passenger2;
    FlightManager flightManager;

    @Before
    public void before(){

        plane1 = new Plane(PlaneType.AIRBUSS_A380);
        plane2 = new Plane(PlaneType.ATR666);
        flight1 = new Flight(plane1, "WZ352", Airport.POZNAN, Airport.GLASGOW, "22:15");
        flight2 = new Flight(plane2, "JA221", Airport.GLASGOW, Airport.BARRA, "08:15");
        passenger1 = new Passenger("Marcin", 1);
        passenger2 = new Passenger("Marianna", 1);
        flightManager = new FlightManager();

    }


    @Test
    public void showPassengerBaggageWeightAllowance(){
        assertEquals(162, flightManager.showWeightAllowance(flight1));
    }

    @Test
    public void showPassengersTotalBaggageWeight(){
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        assertEquals(324, flightManager.showWTotalBaggageWeight(flight1));
    }

    @Test
    public void showTotalRemainingBaggageAllowance(){
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        assertEquals(138176, flightManager.showWTotalBaggageWeightAllowanceLeft(flight1));
    }

}


//        Extensions
//        Create a FlightManager class which has methods to:
//
//        calculate how much baggage weight should be reserved for each passenger for a flight
//        calculate how much baggage weight is booked by passengers of a flight
//        calculate how much overall weight reserved for baggage remains for a flight
//        More Extensions
//        Refactor the Flight's departure time to use the Date class (HINT: Look into Type Migration in IntelliJ to refactor faster)
//        Add a 'flight' property to the Passenger class which is assigned when a passenger is added to a flight
//        Add a 'seat number' property to the Passenger class as an integer. Set it to a random number which is assigned when a Passenger is booked on a flight
//        Make sure the flight doesn't double book the same seat number to more than one passenger