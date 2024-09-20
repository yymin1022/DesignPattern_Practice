package headfirst.strategy;

import headfirst.strategy.extend.EggBehavior;
import headfirst.strategy.extend.SpawnNothing;

public abstract class Duck {
	EggBehavior eggBehavior;
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
 
	public Duck() {
		eggBehavior = new SpawnNothing();
	}

	public void setEggBehavior(EggBehavior eb) {
		eggBehavior = eb;
	}

	public void setFlyBehavior (FlyBehavior fb) {
		flyBehavior = fb;
	}
 
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
 
	abstract void display();

	public void performEggBehavior() {
		eggBehavior.spawn();
	}
 
	public void performFly() {
		flyBehavior.fly();
	}
 
	public void performQuack() {
		quackBehavior.quack();
	}
 
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
