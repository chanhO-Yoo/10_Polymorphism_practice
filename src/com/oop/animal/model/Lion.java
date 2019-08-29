package com.oop.animal.model;

public class Lion extends Animal {
	public Lion() {
		super("사자");
	}
	
	public void kick(Animal enemy) {
		int nowHp = enemy.getHp();
		enemy.setHp(nowHp-10);
		System.out.println(this.getName()+"이(가) "+enemy.getName()+"에게 킥을 날립니다!");
		printStatus(enemy);
	}
}
