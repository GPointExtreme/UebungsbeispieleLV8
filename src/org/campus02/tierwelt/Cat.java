package org.campus02.tierwelt;

public class Cat extends Animal {
	
	private String name;

	public Cat(String color, int countEyes, String name) {
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
		System.out.println(name + " walks fabulouse");
	}
	
	@Override
	public void makeNoise() {
		System.out.println(name + " *meow*");
	}

}
