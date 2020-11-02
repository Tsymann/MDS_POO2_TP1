package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Herbivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Caribou extends Animal implements Terrestrial, Herbivorus {

	public Caribou() {
		super();
	}

	public Caribou(Long id, String name, Float weight, Float height) {
		super(id, name, weight, height);
	}

	public void move() {
		this.walk();
	}

	public void walk() {
		System.out.println(
				"Your " + this.getClass().getSimpleName() + " named " + this.getName() + " just move walking.");
	}

	public void eat(Eatable eatable) {
		if (eatable instanceof Vegetable) {
			this.eatVegetable((Vegetable) eatable);
		} else {
			System.out.println("Your " + this.getClass().getSimpleName() + " named " + this.getName() + " cannot eat "
					+ eatable.getClass().getSimpleName() + ".");
		}
	}

	public void eatVegetable(Vegetable vegetable) {
		System.out.println("Your " + this.getClass().getSimpleName() + " named " + this.getName() + " just eat "
				+ vegetable.getClass().getSimpleName() + ".");
	}
}
