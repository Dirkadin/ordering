package com.dirkadin.ordering;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(OrderRepository orderRepository) {
        return args -> {
            log.info("Preloading" + orderRepository.save(new Order("Laptop", Status.COMPLETED)));
            log.info("Preloading" + orderRepository.save(new Order("iPhone", Status.IN_PROGRESS)));
        };
    }
}
