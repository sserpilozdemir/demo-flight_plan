package com.example.demo.config;

import com.example.demo.model.Airline;
import com.example.demo.repository.AirlineRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AirlineConfig {

    @Bean
    CommandLineRunner airline_commandLineRunner(
            AirlineRepository repository) {
        return args -> {
            Airline pegasus = new Airline(
                1L,
                "PGS",
                "Pegasus Airlines",
                "Turkey"
            );
            repository.saveAll(
                    List.of(pegasus)
            );
        };
    }
}
