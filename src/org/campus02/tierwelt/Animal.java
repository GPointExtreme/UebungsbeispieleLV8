package org.campus02.tierwelt;

public abstract class Animal {
	
	private String color;
	private int countEyes;
	
	public Animal(String color, int countEyes) {
		super();
		this.color = color;
		this.countEyes = countEyes;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCountEyes() {
		return countEyes;
	}

	public void setCountEyes(int countEyes) {
		this.countEyes = countEyes;
	}
	
	public abstract void walk();
	
	public abstract void makeNoise();

}
