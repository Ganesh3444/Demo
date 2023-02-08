package com.employeeEx;

import javax.persistence.Entity;
import javax.persistence.Id;

//@entity is used for to generate table with using the default pojo class name.
// in simple = using poja class name making the table use @entity  with same name table create.
// this class level
@Entity      
public class Employee {

	// this(@id, @entity) two entitys is overcome our (hbm.xml) file code.
	// this is field level
	
	// @ID id use for decleared for making or set column as primary key.
	@Id
	private int id;
	private String name;
	private String address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
