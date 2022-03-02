package com.thoughtworks.com.PracticeProject;

import org.springframework.stereotype.Component;


//when c=context.getBean(Customers.class) the compiler will check if the customers bean is available in the container or not. If available then the spring framework will inject the bean in the application


@Component
public class Customers {
    private String name;
    private int age;

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

    public void display(){
        System.out.println("Customers Object Returned Successfully");
    }
}
