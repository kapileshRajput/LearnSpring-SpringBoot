package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
Spring @Configuration annotation is part of the Spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So, spring container can process the class and generate spring Beans to be
used in the application.
*/
@Configuration
public class ProjectConfigurations {

    /*
    NOTE:
    The methods names will determine the name of the spring bean in the IOC context.

    @Bean annotation, which lets spring know that it needs to call this method when
    it initializes its context and adds the returned value to the context.
    */
    @Bean(name = "audiVehicle")
    Vehicle vehicle1() {
        var vehicle = new Vehicle();
        vehicle.setName("Audi");
        return vehicle;
    }

    @Bean(value = "hondaVehicle")
    Vehicle vehicle2() {
        var vehicle = new Vehicle();
        vehicle.setName("Honda");
        return vehicle;
    }

    @Bean("ferrariVehicle")
    Vehicle vehicle3() {
        var vehicle = new Vehicle();
        vehicle.setName("Ferrari");
        return vehicle;
    }
}
