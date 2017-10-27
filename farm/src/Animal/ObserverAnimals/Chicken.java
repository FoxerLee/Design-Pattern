package src.Animal.ObserverAnimals;

import src.Action.Observer.Operation;

public class Chicken extends AbstractAnimal {
    public Chicken(int breeding, int health, Operation operation){
        super(breeding, health, operation);
        setName("Chicken");
    }
}
