package com.example.demo.student;

import java.util.List;
import java.time.LocalDate;
import java.time.Month;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student kevin = new Student(
                "Kevin",
                "kkretz17@gmail.com",
                LocalDate.of(1994, Month.JANUARY, 1)
            );

            Student kelly = new Student(
                "Kelly",
                "kretz.kellly@gmail.com",
                LocalDate.of(1994, Month.JANUARY, 1)
            );

            repository.saveAll(
                List.of(kevin, kelly)
            );
        };
    }
}
