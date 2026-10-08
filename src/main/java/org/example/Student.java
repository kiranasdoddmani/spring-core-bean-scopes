package org.example;

public class Student {
    private String name;

    public Student(){
        System.out.println("Student Object is Created");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void ShowName(){
        System.out.println("Name of a Student is "+name);
    }
}
