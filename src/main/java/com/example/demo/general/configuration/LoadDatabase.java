package com.example.demo.general.configuration;

import com.example.demo.model.Employee;
import com.example.demo.model.repositories.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepo){
        return args -> {
            log.info("Preloading " + employeeRepo.save(new Employee("Bilbo Baggins", "burglar")));
            log.info("Preloading " + employeeRepo.save(new Employee("Frodo Baggins", "thief")));
        };
    }
}
