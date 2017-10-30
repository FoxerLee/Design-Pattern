package src.Animal.ObserverAnimals;

import src.Action.ObserverAction.Operation;

/**
 * 鸡
 * 继承自抽象动物
 */
public class Chicken extends AbstractAnimal {
    public Chicken(int breeding, int health, Operation operation){
        super(breeding, health, operation);
        setName("Chicken");
    }
}
