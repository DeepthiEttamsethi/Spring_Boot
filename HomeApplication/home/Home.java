package com.example.home;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Home {

    private String HouseOwner;
    private int id;

    @Autowired
    @Qualifier("abc")
    private InternateConnection connect;

    public void connect() {
        System.out.println("Connecting to the Internet");
        connect.switchOn();
    }

	public String getHouseOwner() {
		return HouseOwner;
	}

	public void setHouseOwner(String houseOwner) {
		HouseOwner = houseOwner;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public InternateConnection getConnect() {
		return connect;
	}

	public void setConnect(InternateConnection connect) {
		this.connect = connect;
	}

   
}
