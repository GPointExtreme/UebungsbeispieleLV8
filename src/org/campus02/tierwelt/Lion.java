package org.campus02.tierwelt;

public class Lion extends Animal {

	public Lion(String color, int countEyes) {
		super(color, countEyes);
	}
	
	@Override
	public void walk() {
		System.out.println("*walks majestically");
	}
	
	@Override
	public void makeNoise() {
		System.out.println("*grrr*");
	}
	
	public void roar() {
		System.out.println("*roar*");
	}

}
