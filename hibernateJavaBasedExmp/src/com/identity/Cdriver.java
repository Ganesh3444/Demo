package com.identity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cdriver {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //give there own values in sequence.
	private int id;
	private String cdriverName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCdriverName() {
		return cdriverName;
	}
	public void setCdriverName(String cdriverName) {
		this.cdriverName = cdriverName;
	}
	@Override
	public String toString() {
		return "Cdriver [id=" + id + ", cdriverName=" + cdriverName + "]";
	}
	
	
}
