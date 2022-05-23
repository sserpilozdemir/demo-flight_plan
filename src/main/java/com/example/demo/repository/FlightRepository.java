package com.example.demo.repository;

import com.example.demo.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FlightRepository extends JpaRepository<Flight, Long> {

    @Query("SELECT COUNT (s) FROM Flight s WHERE s.dep_port = ?1 AND s.arr_port = ?2")
    Integer countByDepAndArrPort(String dep_port, String arr_port);
/*

    @Query("SELECT s FROM Flight s WHERE s.arr_port = ?1")
    Optional<Flight> countByArr_port(String arr_port);
*/

}