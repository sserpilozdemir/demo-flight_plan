package com.example.demo.model;


import javax.persistence.*;

@Entity
@Table
public class Airline {

    @Id
    @SequenceGenerator(
            name = "airline_sequence",
            sequenceName = "airline_sequence",
            initialValue = 1,
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "airline_sequence"
    )
    private Long id;
    private String iata_code;
    private String icao_code;
    private String name;
    private String country;

    public Airline() {
    }

    public Airline(Long id, String iata_code, String icao_code, String name, String country) {
        this.id = id;
        this.iata_code = iata_code;
        this.icao_code = icao_code;
        this.name = name;
        this.country = country;
    }

    public Airline(String iata_code, String icao_code, String name, String country) {
        this.iata_code = iata_code;
        this.icao_code = icao_code;
        this.name = name;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public String getIata_code() {
        return iata_code;
    }

    public String getIcao_code() {
        return icao_code;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIata_code(String iata_code) {
        this.iata_code = iata_code;
    }

    public void setIcao_code(String icao_code) {
        this.icao_code = icao_code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "id=" + id +
                ", iata_code='" + iata_code + '\'' +
                ", icao_code='" + icao_code + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

}



