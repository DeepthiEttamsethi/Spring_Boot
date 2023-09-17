package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private int id;
    private String name;
    private Address address;

    @Autowired
    public Student(Address address) {
        this.address = address;
    }

    public Address getAddress() {
    	System.out.println(address.getDoorno()+" "+address.getCity());
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
