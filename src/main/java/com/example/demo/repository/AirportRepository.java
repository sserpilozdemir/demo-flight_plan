package com.example.demo.repository;

import com.example.demo.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface AirportRepository extends JpaRepository<Airport, Long> {

    @Query("SELECT s FROM Airport s WHERE s.name = ?1")
    Optional<Airport> findAirportByName(String name);
}
