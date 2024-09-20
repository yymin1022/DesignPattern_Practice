package headfirst.strategy;

public class BadDuck extends ModelDuck {
    int counter = 0;

    @Override
    public void display() {
        System.out.println("I'm a bad duck");
    }

    @Override
    public void performQuack() {
        counter++;
        if(counter % 2 != 0) {
            quackBehavior.quack();
        }
    }
}
