package org.campus02.tierwelt;

public class Frog extends Animal {

	public Frog(String color, int countEyes) {
		super(color, countEyes);
	}
	
	@Override
	public void walk() {
		System.out.println("Frog walks");
	}
	
	@Override
	public void makeNoise() {
		System.out.println("*ribbit*");
	}

}
