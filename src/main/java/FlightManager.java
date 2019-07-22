public class FlightManager {


    public int showWeightAllowance(Flight flight) {
        return (flight.getPlane().getWeight()/flight.getPlane().getCapacity())/2;
    }

    public int showWTotalBaggageWeight(Flight flight) {
        return ((flight.getPlane().getWeight()/flight.getPlane().getCapacity())/2) * flight.countPassengers();
    }

    public int showWTotalBaggageWeightAllowanceLeft(Flight flight) {
        return ((flight.getPlane().getWeight()/2) - showWTotalBaggageWeight(flight));
    }
}
