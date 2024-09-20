package headfirst.strategy.extend;

public class SpawnEgg implements EggBehavior{
    @Override
    public void spawn() {
        System.out.println("Spawned Egg !!");
    }
}
