package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfigurations;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example6 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfigurations.class);

        Vehicle volkswagen = new Vehicle();
        volkswagen.setName("Volkswagen");
        Supplier<Vehicle> volkswagenSupplier = () -> volkswagen;

        Supplier<Vehicle> audiSupplier = () -> {
            Vehicle audiVehicle = new Vehicle();
            audiVehicle.setName("Audi");
            return audiVehicle;
        };

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("randomNumber: " + randomNumber);

        if ((randomNumber % 2) == 0) {
            context.registerBean("volkswagenBean", Vehicle.class, volkswagenSupplier);
        } else {
            context.registerBean("audiBean", Vehicle.class, audiSupplier);
        }

        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle: " + vehicle.getName());
    }
}
