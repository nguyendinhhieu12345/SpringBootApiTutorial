package com.example.demo.database;

import com.example.demo.model.Product;
import com.example.demo.repositories.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Database {
    private static final Logger logger = LoggerFactory.getLogger(Database.class);
    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository)
    {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Product productA = new Product("test1",2020,2000.0,"");
                Product productB = new Product("test2",2020,2000.0,"");
                logger.info("insert data: "+ productRepository.save(productA));
                logger.info("insert data: "+ productRepository.save(productB));
            }
        };
    }
}
