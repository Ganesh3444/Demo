package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Sid;
	
	private String Sname;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address Saddress;

	public int getSid() {
		return Sid;
	}

	public void setSid(int sid) {
		Sid = sid;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public Address getSaddress() {
		return Saddress;
	}

	public void setSaddress(Address saddress) {
		Saddress = saddress;
	}

	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Saddress=" + Saddress + "]";
	}

	
	
	
}
