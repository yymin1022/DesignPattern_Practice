package headfirst.strategy;

import headfirst.strategy.extend.SpawnEgg;
import headfirst.strategy.extend.SpawnNothing;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
		MallardDuck	mallard = new MallardDuck();
		RubberDuck	rubberDuckie = new RubberDuck();
		DecoyDuck	decoy = new DecoyDuck();
 
		ModelDuck	model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
   
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

		/*
		 * Practice #2
		 */
		model.quackBehavior.quack();

		BadDuck		bad = new BadDuck();
		for(int i = 0; i < 10; i++){
			bad.performQuack();
		}

		/*
		 * Practice #3
		 */
		Duck[] ducks = {mallard, rubberDuckie, decoy, model};
		for(int i = 0; i < ducks.length; i++){
			ducks[i].display();
			ducks[i].performEggBehavior();
		}

		mallard.setEggBehavior(new SpawnEgg());
		for(int i = 0; i < ducks.length; i++){
			ducks[i].display();
			ducks[i].performEggBehavior();
		}
	}
}
