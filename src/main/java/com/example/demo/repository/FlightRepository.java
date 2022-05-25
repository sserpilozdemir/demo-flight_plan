package com.example.demo.repository;

import com.example.demo.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.Optional;

public interface FlightRepository extends JpaRepository<Flight, Long> {

    @Query("SELECT COUNT (s) FROM Flight s WHERE s.dep_port = ?1 AND s.arr_port = ?2 AND s.flight_date = ?3 AND s.airline_code= ?4")
    Integer countByDepAndArrPort(String dep_port, String arr_port, LocalDate flight_date, String airline);

}