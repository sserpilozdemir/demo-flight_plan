package com.example.demo.services;


import com.example.demo.model.Flight;
import com.example.demo.repository.FlightRepository;
import com.example.demo.model.SaveFlightRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class FlightService {

    private final FlightRepository flightRepository;

    @Autowired
    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> getFlight(){
        return flightRepository.findAll();
    }

    public void addNewFlight(SaveFlightRequest flightRequest) {
        Integer flightCount = flightRepository
                .countByDepAndArrPort(
                        flightRequest.getDep_port(),
                        flightRequest.getArr_port(),
                        flightRequest.getFlight_date(),
                        flightRequest.getAirline_code());

        if (flightCount >= 3 ){
            throw new IllegalStateException(
                    "There must be daily at most 3 flights for an airline between 2 destinations."
            );
        }
        System.out.println(flightRequest);
        Flight flight = new Flight(flightRequest);
        flightRepository.save(flight);

    }

    public void deleteFlight(Long flightId) {
        boolean exists = flightRepository.existsById(flightId);

        if (!exists) {
            throw  new IllegalStateException(
                    " flight with this id "  + flightId + " does not exist! "
            );
        }
        flightRepository.deleteById(flightId);
    }


    @Transactional
    public void updateFlight(Long flightId,
                             String dep_port,
                             String arr_port) {
        Flight flight = flightRepository.findById(flightId)
                .orElseThrow(() -> new IllegalStateException(
                        " flight with id " + flightId + " does not exist! "
                ));

        if (dep_port != null &&
                dep_port.length() > 0 &&
                !Objects.equals(flight.getDep_port(), dep_port)) {
            flight.setDep_port(dep_port);
        }

        if (arr_port != null &&
                arr_port.length() > 0 &&
                !Objects.equals(flight.getArr_port(), arr_port)) {

        flight.setArr_port(arr_port);
    }
    }
}
