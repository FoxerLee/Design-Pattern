package src.Animal.ObserverAnimals;

import src.Action.Observer.Operation;

/**
 * 兔子
 * 继承自抽象动物
 */
public class Rabbit extends AbstractAnimal {
    public Rabbit(int breeding, int health, Operation operation){
        super(breeding, health, operation);
        setName("Rabbit");
    }
}
