package com.example;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private int doorno;
    private String city;
    private String mobileno;

    public int getDoorno() {
        return doorno;
    }

    public void setDoorno(int doorno) {
        this.doorno = doorno;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
