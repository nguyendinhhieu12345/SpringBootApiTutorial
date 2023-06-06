package com.example.demo.database;

import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Configurable
public class Database {
    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository)
    {

    }
}
