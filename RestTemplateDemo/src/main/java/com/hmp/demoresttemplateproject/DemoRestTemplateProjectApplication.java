package com.hmp.demoresttemplateproject;

import com.hmp.demoresttemplateproject.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoRestTemplateProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoRestTemplateProjectApplication.class, args);
    }

}
