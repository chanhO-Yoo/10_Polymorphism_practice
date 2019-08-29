package com.oop.body.model;

public class Head extends Body{
	//field
	private String hairColor;
	
	//consturctor
	public Head() {
		
	}
	public Head(String hairColor) {
		super();
		this.hairColor = hairColor;
	}
	
	//getter & setter
	public String getHairColor() {
		return hairColor;
	}
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	
	public void headBang() {
		System.out.println(hairColor+"색 머리를 돌립니다.");
	}
	
	
	
}
