package headfirst.strategy;

public class DoubleQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack, Quack");
    }
}
