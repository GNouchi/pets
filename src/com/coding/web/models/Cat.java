package com.coding.web.models;

public class Cat extends Animal implements Pet{

	public Cat(String name, String breed, int weight) {
		super(name, breed, weight);
	}

	public String showAffection() {
		String str = this.getName() +" looked at you.";
		return str;
	}

}
