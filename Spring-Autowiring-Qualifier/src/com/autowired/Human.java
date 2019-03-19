package com.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired
	@Qualifier("octpousHeart") 	// Hum dependancy k oper bhi anotations laga skhty hn or setter k oper bhi ak hi baat hy
	private Heart heart;
	
	/*public Human() {
	
	}
	
	@Autowired
	public Human(Heart heart) {
		this.heart = heart;
	}*/

	/*@Autowired
	@Qualifier("octpousHeart")*/	// hum @Qualifier("octpousHeart") annotation is liye use krty hn k ager hmare pass agr IOC container main same Type k 2 object pry hon to wo kis ko call kery is liye hm @Qualifier("octpousHeart") use krty hen;  
	/*public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("setter method called !!");
	}*/
	
	public void startPumping() {
		if (heart != null) {
			heart.pump();
			System.out.println("name of the animal is : " +heart.getNameOfAnimal() + 
					" no og heart is : " + heart.getNoOfHeart());
		} else {
			System.out.println("You are dead");
		}
		
	}
}
