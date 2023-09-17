package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Stu {
	
	private String sname;
	private int sid;
	@Autowired
	private Address address;
	public Stu() {
		super();
		System.out.println("Student object create....");
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public void show()
	{
			
		System.out.println("Student Record created");
		address.contactinfo();
		
	}
}