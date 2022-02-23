package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student maria = new Student(
                    "Maria",
                    LocalDate.of(2000, Month.APRIL, 21),
                    "maria@gmail.com"

            );

            Student bob = new Student(
                    "Bob",
                    LocalDate.of(1987, Month.SEPTEMBER, 1),
                    "bob@gmail.com"

            );
            repository.saveAll(
                    List.of(maria, bob)
            );
        };
    }
}
