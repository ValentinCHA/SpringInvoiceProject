package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"org.example.controller.douchette", "org.example.service.prefix", "org.example.repository.memory"})
@PropertySource("classpath:application.properties")

public class AppConfig {

}
