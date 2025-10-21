package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfigurations;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example5 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfigurations.class);

        Vehicle vehicle1 = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring context is: " + vehicle1.getName());
    }
}
