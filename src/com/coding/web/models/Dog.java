package com.coding.web.models;

public class Dog extends Animal implements Pet{

	public Dog(String name, String breed, int weight) {
		super(name, breed, weight);
		System.out.println(name + " " + breed + " "+weight);
	}

	public String showAffection() {
		String str;	
		if(this.getWeight()< 30) {
			str = this.getName() + " hopped into your lap!";
		}
		else{
			str = this.getName() + " curled up next to you.";
		}
		
		return str;
	}

}
