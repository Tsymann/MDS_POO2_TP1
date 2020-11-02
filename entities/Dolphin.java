package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Aquatic;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Carnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Herbivorus;

public class Dolphin extends Animal implements Aquatic, Carnivorus {

	public Dolphin() {
		super();
	}

	public Dolphin(Long id, String name, Float weight, Float height) {
		super(id, name, weight, height);
	}

	public void move() {
		this.swim();
	}

	public void swim() {
		System.out.println(
				"Your " + this.getClass().getSimpleName() + " named " + this.getName() + " just move swiming.");
	}

	public void eat(Eatable eatable) {
		if (eatable instanceof Animal) {
			this.eatAnimal((Animal) eatable);
		} else {
			System.out.println("Your " + this.getClass().getSimpleName() + " named " + this.getName() + " cannot eat "
					+ eatable.getClass().getSimpleName() + ".");
		}
	}

	public void eatAnimal(Animal animal) {
		System.out.println("Your " + this.getClass().getSimpleName() + " named " + this.getName() + " just eat "
				+ animal.getClass().getSimpleName() + ".");
	}
}
