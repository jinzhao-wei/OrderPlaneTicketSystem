package Interfaces;

import Message.Flight;

import java.util.Set;

public class FlightDaoimpl implements  IFlightDao{
    @Override
    public void insertFlight(Flight flight) {

    }

    @Override
    public Set<Flight> getAllFlight() {
        return null;
    }

    @Override
    public Flight getFlightByDepartureTime(String departure) {
        return null;
    }

    @Override
    public Flight getFlightBydepartureAirPort(String departureAirPort) {
        return null;
    }

    @Override
    public Flight getFlightByDestinationAirPort(String detinationAirPort) {
        return null;
    }

    @Override
    public void undateFlight(Flight flight) {

    }
}
