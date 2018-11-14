package com.china3h.edison;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan("com.china3h")
@PropertySource({"classpath:application.properties"})
public class WebApplication {


    public static void main(String[] args) throws Exception {

        SpringApplication.run(new Object[]{WebApplication.class}, args);

    }
}
