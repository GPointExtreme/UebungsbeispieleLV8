package org.campus02.tierwelt;

public class Dog extends Animal {
	
	private String name;

	public Dog(String color, int countEyes, String name) {
		super(color, countEyes);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void walk() {
		System.out.println(name + " walks with a bone");
	}
	
	@Override
	public void makeNoise() {
		System.out.println(name + "*woof*");
	}

}
