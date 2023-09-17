package com.example.demo;
import org.springframework.stereotype.Component;
@Component
public class Address {
	
	private String location;
	private int id;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void contactinfo()
	{
		System.out.println("Contact information....");
	}
	
	
}