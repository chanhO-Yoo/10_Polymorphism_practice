package com.oop.animal.model;

public class Animal {
	//field
	private String name;
	private int hp = 100;
	
	//constructor
	public Animal() {
		
	}
	public Animal(String name) {
		this.name = name;
	}
	
	//getter & setter
	//getter
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void printStatus(Animal enemy) {
		System.out.println(name+" : "+hp+", "+enemy.getName()+" : "+enemy.getHp());
	}
}
