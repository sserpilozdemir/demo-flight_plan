package com.example.demo.config;


import com.example.demo.model.Flight;
import com.example.demo.repository.FlightRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Configuration
public class FlightConfig {

    @Bean
    CommandLineRunner flight_commandLineRunner(
            FlightRepository repository) {
        return args -> {
            Flight flight_1 =  new Flight(
                    "PC1121",
                LocalDate.of(2022, 11, 1),
                "Boeing 747",
                "SAW",
                "Istanbul",
                LocalTime.of(20, 0,0,0),
                "ADB",
                "Izmir",
                LocalTime.of(21, 0, 0,0)

            );
            Flight flight_2 =  new Flight(
                    "PC2344",
                    LocalDate.of(2022, 5, 1),
                    "Boeing 737",
                    "TZX",
                    "Trabzon",
                    LocalTime.of(13, 0,0,0),
                    "ADB",
                    "Izmir",
                    LocalTime.of(15, 0, 0,0)

            );
            Flight flight_3 =  new Flight(
                    "PC9991",
                    LocalDate.of(2022, 6, 1),
                    "Boeing 737",
                    "SAW",
                    "Istanbul",
                    LocalTime.of(13, 0,0,0),
                    "TXZ",
                    "Trabzon",
                    LocalTime.of(15, 0, 0,0)

            );
            Flight flight_4 =  new Flight(
                    "PC3323",
                    LocalDate.of(2022, 6, 11),
                    "Boeing 737",
                    "IST",
                    "Istanbul",
                    LocalTime.of(14, 30,0,0),
                    "ADA",
                    "Adana",
                    LocalTime.of(16, 45, 0,0)

            );
            repository.saveAll(
                    List.of(flight_1, flight_2, flight_3, flight_4)
            );
        };
    }
}
