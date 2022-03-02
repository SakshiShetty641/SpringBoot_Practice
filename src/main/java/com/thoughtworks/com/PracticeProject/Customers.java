package com.thoughtworks.com.PracticeProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//when c=context.getBean(Customers.class) the compiler will check if the customers bean is available in the container or not. If available then the spring framework will inject the bean in the application


@Component
public class Customers {
    private String name;
    private int age;

    @Autowired
    private Technologies techDetails;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Technologies getTechDetails() {
        return techDetails;
    }

    public void setTechDetails(Technologies techDetails) {
        this.techDetails = techDetails;
    }

    public void display() {
        System.out.println("Customers Object Returned Successfully");
        techDetails.tech();
    }
}

