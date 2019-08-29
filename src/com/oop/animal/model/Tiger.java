package com.oop.animal.model;

public class Tiger extends Animal{
	public Tiger() {
//		this.setName("호랑이");
		super("호랑이");
	}
	
	public void punch(Animal enemy) {
		int nowHp= enemy.getHp();
		enemy.setHp(nowHp-5);
		System.out.println(this.getName()+"이(가) "+enemy.getName()+"에게 펀치를 날립니다!");
		printStatus(enemy);
	}
}
