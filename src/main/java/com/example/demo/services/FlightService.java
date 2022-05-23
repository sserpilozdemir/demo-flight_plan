package com.example.demo.services;


import com.example.demo.model.Flight;
import com.example.demo.repository.FlightRepository;
import com.example.demo.model.SaveFlightRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
                .countByDepAndArrPort(flightRequest.getDep_port(), flightRequest.getArr_port());

        System.out.println("\n\nThis is flight count!!!" + flightCount);

        if (flightCount >= 3 ){
            throw new IllegalStateException(
                    "There must be daily at most 3 flights for an airline between 2 destinations."
            );
        }
        System.out.println(flightRequest);
        Flight flight = new Flight(flightRequest);
        flightRepository.save(flight);

    }
}
