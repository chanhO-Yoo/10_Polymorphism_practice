package com.oop.body.controller;

import com.oop.body.model.Arm;
import com.oop.body.model.Body;
import com.oop.body.model.Head;
import com.oop.body.model.Leg;

public class ActionBody {
	public static void main(String[] args) {
		Body[] b = new Body[5];
		b[0]=new Head("빨간");
		b[1]=new Arm();
		b[2]=new Leg();
		b[3]=new Arm();
		b[4]=new Head("파란");
		
		for(int i=0; i<b.length;i++) {
			action(b[i]);
		}
	}
	
	public static void action(Body body) {
		if(body instanceof Head) {
			((Head)body).headBang();
		}
		else if(body instanceof Arm) {
			((Arm)body).armSwing();
		}
		else if(body instanceof Leg) {
			((Leg)body).run();
		}
	}
}
