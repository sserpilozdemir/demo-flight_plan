package com.example.demo.services;


import com.example.demo.model.Airport;
import com.example.demo.requestsandresponse.SaveAirportRequest;
import com.example.demo.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
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

    public void deleteAirportInfo(Long airportId) {
        boolean exists = airportRepository.existsById(airportId);
        if (!exists) {
            throw new IllegalStateException(
                    " airport with id " + airportId + " does not exist! "
            );
        }
        airportRepository.deleteById(airportId);
    }

    @Transactional
    public void updateAirport(Long airportId,
                              String name,
                              String city) {
        Airport airport = airportRepository.findById(airportId)
                .orElseThrow(() -> new IllegalStateException(
                        " airport with id " + airportId + " does not exist! "
                ));
        if (name != null &&
                name.length() > 0 &&
                !Objects.equals(airport.getName(), name)) {
            airport.setName(name);
        }

        if(city != null &&
                city.length() > 0 &&
                !Objects.equals(airport.getCity(), city)) {
            //optional type for not null while updating
            Optional<Airport> airportOptional = airportRepository.findAirportByCity(city);

            if (airportOptional.isPresent()) {
                throw new IllegalStateException(
                        "city is already exist!");
            }
            airport.setCity(city);

        }
    }
}
