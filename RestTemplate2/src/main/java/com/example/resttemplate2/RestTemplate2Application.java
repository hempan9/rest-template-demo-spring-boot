package com.example.resttemplate2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplate2Application {

    public static void main(String[] args) {
        SpringApplication.run(RestTemplate2Application.class, args);

    }
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
