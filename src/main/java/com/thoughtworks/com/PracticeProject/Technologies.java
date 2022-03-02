package com.thoughtworks.com.PracticeProject;

import org.springframework.stereotype.Component;

@Component
public class Technologies {

    private int techID;
    private String techName;

    public int getTechID() {
        return techID;
    }

    public void setTechID(int techID) {
        this.techID = techID;
    }

    public String getTechName() {
        return techName;
    }

    public void setTechName(String techName) {
        this.techName = techName;
    }

    public void tech(){
        System.out.println("Completed");
    }
}
