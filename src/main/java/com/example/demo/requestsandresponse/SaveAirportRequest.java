package com.example.demo.requestsandresponse;

public class SaveAirportRequest {

    private String IATA_code;
    private String ICAO_code;
    private String name;
    private String city;
    private String coordinates;

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

    @Override
    public String toString() {
        return "SaveAirportRequest{" +
                "IATA_code='" + IATA_code + '\'' +
                ", ICAO_code='" + ICAO_code + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", coordinates='" + coordinates + '\'' +
                '}';
    }
}
