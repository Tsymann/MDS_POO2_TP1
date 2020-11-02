package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Omnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Tetrapoda;

public class Turtle extends Animal implements Tetrapoda, Omnivorus {

	public Turtle() {
		super();
	}

	public Turtle(Long id, String name, Float weight, Float height) {
		super(id, name, weight, height);
	}

	public void move() {
		this.walk();
		this.swim();
	}

	public void walk() {
		System.out.println(
				"Your " + this.getClass().getSimpleName() + " named " + this.getName() + " just move walking.");
	}

	public void swim() {
		System.out.println(
				"Your " + this.getClass().getSimpleName() + " named " + this.getName() + " just move swiming.");
	}

	public void eat(Eatable eatable) {
		if (eatable instanceof Vegetable) {
			this.eatVegetable((Vegetable) eatable);
		} else if (eatable instanceof Animal) {
			this.eatAnimal((Animal) eatable);
		}
	}

	public void eatVegetable(Vegetable vegetable) {
		System.out.println("Your " + this.getClass().getSimpleName() + " named " + this.getName() + " just eat "
				+ vegetable.getClass().getSimpleName() + ".");
	}

	public void eatAnimal(Animal animal) {
		System.out.println("Your " + this.getClass().getSimpleName() + " named " + this.getName() + " just eat "
				+ animal.getClass().getSimpleName() + ".");
	}
}
