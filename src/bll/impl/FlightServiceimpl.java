package bll.impl;

import bean.Flight;
import bll.IFlightService;
import dao.IFlightDao;
import dao.impl.FlightDaoimpl;

import java.sql.SQLException;
import java.util.Set;

public class FlightServiceimpl implements IFlightService {

    IFlightDao iFlightDao;
    public FlightServiceimpl(){//dao层接口
        iFlightDao=new FlightDaoimpl();
    }//构造方法

    @Override
    public void insertFlight(Flight flight) throws SQLException {
       iFlightDao.insertFlight(flight);

    }

    @Override
    public Set<Flight> getAllFlight() throws SQLException {

        return iFlightDao.getAllFlight();
    }

    @Override
    public Flight getFlightByDepartureTime(String departureTime) throws SQLException {

        return iFlightDao.getFlightByDepartureTime(departureTime);
    }

    @Override
    public Flight getFlightBydepartureAirPort(String departureAirPort) throws SQLException {
        return iFlightDao.getFlightBydepartureAirPort(departureAirPort);
    }

    @Override
    public Flight getFlightByDestinationAirPort(String destinationAirPort) throws SQLException {

        return iFlightDao.getFlightByDestinationAirPort(destinationAirPort);
    }

    @Override
    public void undateFlight(Flight flight) {

    }

    public IFlightDao getiFlightDao() {
        return iFlightDao;
    }

    public void setiFlightDao(IFlightDao iFlightDao) {
        this.iFlightDao = iFlightDao;
    }
}
