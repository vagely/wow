package com.igeek;

public class Dvd extends Item {
	
	private String director;

	
	public Dvd( String title,String director) {
		super(title);
	this.director = director;
		
	}
	public void print() {
		System.out.println(getTitle()+";"+director);
	}
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}

	
	
}
