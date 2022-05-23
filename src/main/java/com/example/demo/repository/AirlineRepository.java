package com.example.demo.repository;

import com.example.demo.model.Airline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AirlineRepository extends JpaRepository<Airline, Long> {
}
