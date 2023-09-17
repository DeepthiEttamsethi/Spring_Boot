package com.example.Home;

import org.springframework.stereotype.Component;

@Component("abc")
class InterConnection {

	private int ipAddress;
    private int speed;

    public int getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(int ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void switchOn() {
        System.out.println("Switching on connection");
    }
} 

