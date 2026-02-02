package com.hospital.hms;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.hospital.hms.*")
@ComponentScan("com.hospital.common.*")
public class HmsApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(HmsApiApplication.class, args);
    }
}