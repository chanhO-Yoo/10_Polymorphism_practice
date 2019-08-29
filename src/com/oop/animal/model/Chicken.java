package com.oop.animal.model;

public class Chicken extends Animal{
	public Chicken() {
		super("치킨");
	}
	
	public void peck(Animal enemy) {
		int nowHp = enemy.getHp();
		enemy.setHp(nowHp-3);
		System.out.println(this.getName()+"이(가) "+enemy.getName()+"을(를) 쫍니다!");
		printStatus(enemy);
	}
}
