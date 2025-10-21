package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfigurations;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle name from non spring context is: " + vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfigurations.class);

        Vehicle vehicle1 = context.getBean("audiVehicle", Vehicle.class);
        System.out.println("Vehicle name from spring context is: " + vehicle1.getName());

        Vehicle vehicle2 = context.getBean("hondaVehicle", Vehicle.class);
        System.out.println("Vehicle name from spring context is: " + vehicle2.getName());

        /*
        NOTE: have not provided any name for the bean but, still because we have added @Primary annotation
        we can do this.
        */
        Vehicle vehicle3 = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring context is: " + vehicle3.getName());
    }
}
