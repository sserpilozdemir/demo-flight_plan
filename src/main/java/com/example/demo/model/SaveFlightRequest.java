package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class SaveFlightRequest {
    private LocalDate flight_date;
    private String aircraft_type;
    private String dep_port;
    private String dep_city;
    private LocalTime est_dep_time;
    private String arr_port;
    private String arr_city;
    private LocalTime est_arr_time;

    public LocalDate getFlight_date() {
        return flight_date;
    }

    public String getAircraft_type() {
        return aircraft_type;
    }

    public String getDep_port() {
        return dep_port;
    }

    public String getDep_city() {
        return dep_city;
    }

    public LocalTime getEst_dep_time() {
        return est_dep_time;
    }

    public String getArr_port() {
        return arr_port;
    }

    public String getArr_city() {
        return arr_city;
    }

    public LocalTime getEst_arr_time() {
        return est_arr_time;
    }

    public void setFlight_date(LocalDate flight_date) {
        this.flight_date = flight_date;
    }

    public void setAircraft_type(String aircraft_type) {
        this.aircraft_type = aircraft_type;
    }

    public void setDep_port(String dep_port) {
        this.dep_port = dep_port;
    }

    public void setDep_city(String dep_city) {
        this.dep_city = dep_city;
    }

    public void setEst_dep_time(LocalTime est_dep_time) {
        this.est_dep_time = est_dep_time;
    }

    public void setArr_port(String arr_port) {
        this.arr_port = arr_port;
    }

    public void setArr_city(String arr_city) {
        this.arr_city = arr_city;
    }

    public void setEst_arr_time(LocalTime est_arr_time) {
        this.est_arr_time = est_arr_time;
    }

    @Override
    public String toString() {
        return "SaveFlightRequest{" +
                "flight_date=" + flight_date +
                ", aircraft_type='" + aircraft_type + '\'' +
                ", dep_port='" + dep_port + '\'' +
                ", dep_city='" + dep_city + '\'' +
                ", est_dep_time=" + est_dep_time +
                ", arr_port='" + arr_port + '\'' +
                ", arr_city='" + arr_city + '\'' +
                ", est_arr_time=" + est_arr_time +
                '}';
    }
}
