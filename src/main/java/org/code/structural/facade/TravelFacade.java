package org.code.structural.facade;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class TravelFacade {
    private FlightBooker _flightBooker;
    private HotelBooker _hotelBooker;

    public TravelFacade() {
        _flightBooker = new FlightBooker();
        _hotelBooker = new HotelBooker();
    }

    public List<TravelRoute> getTravelRoutes(Date from, Date to) {
        List<Flight> flights = _flightBooker.getFlights(from, to);
        List<Hotel> hotels = _hotelBooker.getHotels(from, to);
        //process and return a list of travel routes
        return Collections.emptyList();
    }

    public void bookTravelRoute(TravelRoute route) {
        _flightBooker.bookFlight(route.get_flight());
        _hotelBooker.bookHotel(route.get_hotel());
    }
}
