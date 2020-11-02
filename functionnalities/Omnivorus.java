package com.tactfactory.javaniveau2.tps.tp1.functionnalities;

import com.tactfactory.javaniveau2.tps.tp1.entities.Vegetable;
import com.tactfactory.javaniveau2.tps.tp1.entities.Animal;

public interface Omnivorus extends Herbivorus, Carnivorus {
	void eatVegetable(Vegetable vegetable);
	void eatAnimal(Animal animal);
	
}
