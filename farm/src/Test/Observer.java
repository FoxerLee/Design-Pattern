package src.Test;

import src.Action.Observer.Operation;
import src.Animal.ObserverAnimals.Chicken;
import src.Animal.ObserverAnimals.Rabbit;

public class Observer {
    public static void main(String[] args){
        Operation operation = new Operation();

        Chicken chicken = new Chicken(20, 50, operation);
        Rabbit rabbit = new Rabbit(30, 60, operation);

        System.out.println("Chicken's health: " + chicken.getHealth());
        System.out.println("rabbit's stamina" + rabbit.getBreeding());
        operation.showDetail();
        operation.exanmin();
        operation.takeFood();
        System.out.println("Chicken's health: " + chicken.getHealth());
        System.out.println("rabbit's stamina" + rabbit.getBreeding());
    }
}
