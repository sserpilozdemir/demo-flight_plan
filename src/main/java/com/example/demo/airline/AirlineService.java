package com.example.demo.airline;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirlineService {

    private final AirlineRepository airlineRepository;

    @Autowired
    public AirlineService(AirlineRepository airlineRepository) {
        this.airlineRepository = airlineRepository;
    }

    public List<Airline> getAirline(){
        return airlineRepository.findAll();
    }
}
