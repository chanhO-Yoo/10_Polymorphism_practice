package com.oop.animal.controller;

import com.oop.animal.model.Animal;
import com.oop.animal.model.Chicken;
import com.oop.animal.model.Lion;
import com.oop.animal.model.Tiger;

public class AnimalFight {
	public static void main(String[] args) {
		Tiger t = new Tiger();
		Lion l = new Lion();
		Chicken c = new Chicken();
		
		animalFight(t,l);
		animalFight(l,c);
		animalFight(c,t);
		
	}
	
	public static void animalFight(Animal a, Animal e) {
		if(a instanceof Tiger) {
			((Tiger) a).punch(e);
		}
		else if(a instanceof Lion) {
			((Lion) a).kick(e);
		}
		else if(a instanceof Chicken) {
			((Chicken) a).peck(e);
		}
	}
	
	
}
