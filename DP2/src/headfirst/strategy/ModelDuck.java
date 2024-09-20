package headfirst.strategy;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new DoubleQuack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}

	public void CopyBehavior(Duck source) {
		this.eggBehavior = source.eggBehavior;
		this.flyBehavior = source.flyBehavior;
		this.quackBehavior = source.quackBehavior;
	}
}
