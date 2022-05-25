package com.example.demo.model;


import com.example.demo.requestsandresponse.SaveAirportRequest;

import javax.persistence.*;

@Entity
@Table
public class Airport {

    @Id
    @SequenceGenerator(
            name = "airport_sequence",
            sequenceName = "airport_sequence",
            initialValue = 1,
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "airport_sequence"
    )
    private Long id;
    private String IATA_code;
    private String ICAO_code;
    private String name;
    private String city;
    private String coordinates;

    public Airport() {
    }

    public Airport(Long id, String IATA_code, String ICAO_code, String name, String city, String coordinates) {
        this.id = id;
        this.IATA_code = IATA_code;
        this.ICAO_code = ICAO_code;
        this.name = name;
        this.city = city;
        this.coordinates = coordinates;
    }

    public Airport(String IATA_code, String ICAO_code, String name, String city, String coordinates) {
        this.IATA_code = IATA_code;
        this.ICAO_code = ICAO_code;
        this.name = name;
        this.city = city;
        this.coordinates = coordinates;
    }

    public Airport(SaveAirportRequest airportRequest) {
        this.IATA_code = airportRequest.getIATA_code();
        this.ICAO_code = airportRequest.getICAO_code();
        this.name = airportRequest.getName();
        this.city = airportRequest.getCity();
        this.coordinates = airportRequest.getCoordinates();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIATA_code(String IATA_code) {
        this.IATA_code = IATA_code;
    }

    public void setICAO_code(String ICAO_code) {
        this.ICAO_code = ICAO_code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public Long getId() {
        return id;
    }

    public String getIATA_code() {
        return IATA_code;
    }

    public String getICAO_code() {
        return ICAO_code;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "id=" + id +
                ", IATA_code='" + IATA_code + '\'' +
                ", ICAO_code='" + ICAO_code + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", coordinates='" + coordinates + '\'' +
                '}';
    }
}
