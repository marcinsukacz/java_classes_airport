import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Flight flight2;
    Plane plane1;
    Plane plane2;
    Passenger passenger1;

    @Before
    public void before(){

        plane1 = new Plane(PlaneType.AIRBUSS_A380);
        plane2 = new Plane(PlaneType.ATR666);
        flight1 = new Flight(plane1, "WZ352", Airport.POZNAN, Airport.GLASGOW, "22:15");
        flight2 = new Flight(plane2, "JA221", Airport.GLASGOW, Airport.BARRA, "08:15");
        passenger1 = new Passenger("Marcin", 1);

    }

    @Test
    public void flightHasPlaneAssigned(){
        assertEquals(plane1, flight1.getPlane());
    }

    @Test
    public void flightHasNumber(){
        assertEquals("WZ352", flight1.getFlightNumber());
    }

    @Test
    public void flightHasDestination(){
        assertEquals(Airport.POZNAN, flight1.getDestination());
    }

    @Test
    public void flightHasDeparture(){
        assertEquals(Airport.GLASGOW, flight1.getDeparture());
    }

    @Test
    public void flightHasDepartureTime(){
        assertEquals("22:15", flight1.getDepartureTime());
    }

    @Test
    public void flightIsEmptyInitially(){
        assertEquals(0, flight1.countPassengers());
    }

    @Test
    public void flightCanAddPassenger(){
        flight1.addPassenger(passenger1);
        assertEquals(1, flight1.countPassengers());
    }

    @Test
    public void flightCannotAddPassenger(){
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger1);
        assertEquals(12, flight2.countPassengers());
    }

    @Test
    public void flightShowsAvailableSeats(){
        flight1.addPassenger(passenger1);
        assertEquals(849, flight1.showAvailableSeats());
    }


}


//   Your task is to model a system for the world renowned online travel booking agent TravelJava. You should use the tools you have learnt this week where appropriate and useful. Remember to TDD!
//
//        TravelJava doesn't really exist (sadly) - don't stress about how a "real" example of this would work differently. This is just an exercise to practice some different concepts.
//
//        Assumptions:
//
//        Each passenger bag weighs the same
//        Planes reserve half of their total weight for passenger bags
//        The weight of bag per person is the weight reserved for passenger bags divided by the capacity
//        Passengers exist for a single flight only
//        MVP
//        Create a Passenger class which has:
//
//        a name
//        a number of bags
//        Create a Plane class which has:
//
//        an enum PlaneType (e.g. BOEING747) which stores capacity and total weight
//        Create a Flight class which has:
//
//        an empty list of booked Passenger's
//        a Plane
//        flight number (i.e. "FR756")
//        destination (i.e. GLA, EDI)
//        departure airport (i.e. GLA, EDI)
//        departure time (use a String)
//        The Flight class should have methods to:
//
//        return the number of available seats
//        book a passenger (if there are remaining seats)
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