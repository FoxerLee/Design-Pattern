package src.Animal.ObserverAnimals;

import src.Action.Observer.Operation;

public class Rabbit extends AbstractAnimal {
    public Rabbit(int breeding, int health, Operation operation){
        super(breeding, health, operation);
        setName("Rabbit");
    }
}
