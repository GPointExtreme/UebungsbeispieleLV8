package org.campus02.tierwelt;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		Frog quaxi = new Frog("Blue", 2);
		quaxi.makeNoise();
		Cat micki = new Cat("Brown", 2, "Micki");
		
		Animal quaxiAsAnimal = quaxi;
		quaxiAsAnimal.makeNoise();
		quaxiAsAnimal = micki;
		quaxiAsAnimal.makeNoise();
		
		quaxiAsAnimal = new Frog("Blue", 2);
		quaxiAsAnimal.makeNoise();
		
		ArrayList<Animal> list = new ArrayList<>();
		
		Nature myNature = new Nature(list);
		
		myNature.addAnimal(quaxiAsAnimal);
		myNature.addAnimal(quaxi);
		myNature.addAnimal(micki);
		
		System.out.println(myNature.countColor("Blue"));
		
		
		

	}

}
