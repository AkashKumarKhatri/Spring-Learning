package com.autowired;

public class Heart {

	private String nameOfAnimal;	// hum perimitive or string type datatype k liye autowiring nhn use kr skhty
	private int noOfHeart;
	
	public String getNameOfAnimal() {
		return nameOfAnimal;
	}

	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}

	public int getNoOfHeart() {
		return noOfHeart;
	}

	public void setNoOfHeart(int noOfHeart) {
		this.noOfHeart = noOfHeart;
	}

	public void pump() {
		System.out.println("Your heart is pumping");
		System.out.println("Alive");
	}

}
