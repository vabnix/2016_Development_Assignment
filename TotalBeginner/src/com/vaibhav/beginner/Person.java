package com.vaibhav.beginner;

public class Person {
	//fields
	private String name;
	private int maximumBooks;
	
	//constructor
	public Person(){
		name = "unknown name";
		maximumBooks = 3;
	}
	
	//method to get name
	public String getName(){
		return name;
	}
	
	//method to set the name
	public void setName(String anyName){	
		this.name = anyName;
	}

	public int getMaximumBooks() {
		return maximumBooks;
	}

	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}
	
}
