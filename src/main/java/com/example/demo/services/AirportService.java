package com.example.demo.services;


import com.example.demo.model.Airport;
import com.example.demo.model.SaveAirportRequest;
import com.example.demo.repository.AirportRepository;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirportService {

    private final AirportRepository airportRepository;

    @Autowired
    public AirportService(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    public List<Airport> getAirport(){
        return airportRepository.findAll();

    }

    public void addNewAirport(SaveAirportRequest airportRequest) {
        Optional<Airport> airportByName = airportRepository
                .findAirportByName(airportRequest.getName());

        if(airportByName.isPresent()){
            throw new IllegalStateException(
                    "Airport information is already exist in table!");
        }

        System.out.println(airportRequest);
        Airport airport = new Airport(airportRequest);
        airportRepository.save(airport);
    }
}
