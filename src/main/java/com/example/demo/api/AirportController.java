package com.example.demo.api;

import com.example.demo.model.Airport;
import com.example.demo.model.SaveAirportRequest;
import com.example.demo.services.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/airports")
public class AirportController {

    private final AirportService airportService;

    @Autowired
    public AirportController(AirportService airportService) {
        this.airportService = airportService;
    }

    @GetMapping
    public List<Airport> getAirports(){
        return airportService.getAirport();
    }

    @PostMapping
    public void addNewAirportInfo(@RequestBody SaveAirportRequest airport){
        airportService.addNewAirport(airport);
    }


}
