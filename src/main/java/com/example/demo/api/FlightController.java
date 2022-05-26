package com.example.demo.api;


import com.example.demo.model.Flight;
import com.example.demo.requestsandresponse.SaveFlightRequest;
import com.example.demo.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/flights")
public class FlightController {

    private final FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping
    public List<Flight> getFlight(){
        return flightService.getFlight();
    }

    @PostMapping
    public void addNewFlightInfo(@RequestBody SaveFlightRequest flight){
        flightService.addNewFlight(flight);
    }



}
