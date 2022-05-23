package com.example.demo.config;


import com.example.demo.model.Airport;
import com.example.demo.repository.AirportRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AirportConfig {

    @Bean
    CommandLineRunner airport_commandLineRunner(
            AirportRepository repository){
        return args -> {
            Airport saw = new Airport(
                "SAW",
                "LTFJ",
                "Sabiha Gokcen International Airport",
                "Istanbul",
                "40°53′54″N 29°18′33″E"
            );

            Airport adb = new Airport(
                    "ADB",
                    "LTBJ",
                    "Izmir Adnan Menderes International Airport",
                    "Izmir",
                    "38°17′21″N 27°09′18″E"
            );
            Airport ada = new Airport(
                    "ADA",
                    "LTAG",
                    "Adana Sakirpasa Airport",
                    "Adana",
                    "36°58′55″N 35°16′49″E"
            );



            repository.saveAll(
                    List.of(saw, adb, ada)
            );
        };
    }
}
