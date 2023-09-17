package com.example.home;

import org.springframework.stereotype.Component;

@Component("abc")
public class InternateConnection {

    private int IpAddress;
	private int speed;

    public int getIpAddress() {
        return IpAddress;
    }

    public void setIpAddress(int ipAddress) {
        IpAddress = ipAddress;
    }

    public int getSpeed() {
        return getSpeed();
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void switchOn() {
        System.out.println("Switching on Airtel Internet Connection");
    }
}
