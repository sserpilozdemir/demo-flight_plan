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
    private String code;
    private String name;
    private String country;

    public Airline() {
    }

    public Airline(Long id, String code, String name, String country) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.country = country;
    }

    public Airline(String code, String name, String country) {
        this.code = code;
        this.name = name;
        this.country = country;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}



