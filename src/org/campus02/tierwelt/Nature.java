package org.campus02.tierwelt;

import java.util.ArrayList;

public class Nature {
	
	ArrayList<Animal> list = new ArrayList<>();
	
	public Nature(ArrayList<Animal> list) {
		super();
		this.list = list;
	}

	public void addAnimal(Animal a) {
		list.add(a);
	}
	
	public int countColor(String color) {
		int counter = 0;
		for (Animal animal : list) {
			if (animal.getColor().equals(color)) {
				counter++;
			}
		}
		return counter;
	}

}
