package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Omnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Dog extends Animal implements Terrestrial, Omnivorus {

	public Dog() {
		super();
	}

	public Dog(Long id, String name, Float weight, Float height) {
		super(id, name, weight, height);
	}
  
	public void move() {
		this.walk();
	}

	public void walk() {
		System.out.println("Your " + this.getClass().getSimpleName() + " named " + this.getName() + " just move walking.");
	}

	public void eat(Eatable eatable) {
		if(eatable instanceof Vegetable) {
			this.eatVegetable((Vegetable)eatable);
		}else if(eatable instanceof Animal){
			this.eatAnimal((Animal)eatable);
		}
	}
	  
	public void eatVegetable(Vegetable vegetable) {
		System.out.println("Your " + this.getClass().getSimpleName() + " named " + this.getName() + " just eat " + vegetable.getClass().getSimpleName() + ".");
	}
	  
	public void eatAnimal(Animal animal) {
		System.out.println("Your " + this.getClass().getSimpleName() + " named " + this.getName() + " just eat " + animal.getClass().getSimpleName() + ".");
	}
}
