package src.Animal.ObserverAnimals;

import src.Action.Observer.Operation;
import src.Action.Observer.Operation;
import src.Base.Animal;

import java.util.ArrayList;
import java.util.Observable;

public class AbstractAnimal extends Animal{

    private Operation operation;

    public  AbstractAnimal(int breeding, int health, Operation operation){
        setBreeding(breeding);
        setHealth(health);
        setMarketValue((float)(breeding * 0.5 + health * 0.5));
        operation.addAnimal(this);
    }

    @Override
    public void move() {
    }

    @Override
    public void eat() {
    }

    @Override
    public void sleep() {
    }

}
