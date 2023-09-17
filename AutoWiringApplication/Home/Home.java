package com.example.Home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
class Home {
	private String houseOwner;
    private int id;

    @Autowired
    @Qualifier("abc")
    private InterConnection connect;

    public String getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(String houseOwner) {
        this.houseOwner = houseOwner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void connect() {
        System.out.println("Connecting to the internet");
        connect.switchOn();
    }

    public Home() {
        super();
        System.out.println("Constructor Called");
    }

}
