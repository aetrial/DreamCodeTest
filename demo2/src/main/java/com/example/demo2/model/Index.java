package com.example.demo2.model;

public class Index {
	int Id;
	String name;
	
	public Index(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
