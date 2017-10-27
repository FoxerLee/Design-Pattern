package src.Action.Observer;

import src.Animal.ObserverAnimals.AbstractAnimal;
import src.Base.Action;
import src.Base.Animal;

import java.util.ArrayList;

public class Operation extends Action{

    protected ArrayList<AbstractAnimal> animals;

    public Operation(){
        super();
        animals = new ArrayList<>();
    }

    public void addAnimal(AbstractAnimal animal){
        animals.add(animal);
    }

    public boolean clearAnimals(){
        animals.clear();
        return true;
    }

    @Override
    protected boolean doSomething() {
        return false;
    }

    @Override
    protected String getDescription() {
        String response = new String();
        for(AbstractAnimal abstractAnimal : animals){
            response += "Name: " + abstractAnimal.getName() +
                    ", Health: " + abstractAnimal.getHealth() +
                    ", Breeding: " + abstractAnimal.getBreeding() +
                    ", Value: " + abstractAnimal.getMarketValue() + "\n";
        }
        return response;
    }

    public boolean exanmin() {
        System.out.println("Examine the animals, and their health value will be improved by 5");
        for(Animal a : animals)
            if(a.getHealth() < 95)
                a.setHealth(a.getHealth() + 5);
            else
                a.setHealth(100);
        return true;
    }

    public boolean sell() {
        System.out.println("Now you want to sell them. Their value will be evaluated by their health and breeding.");
        for(Animal a : animals)
            a.setMarketValue((float)(a.getHealth() * 0.5 + a.getBreeding() * 0.5));
        return true;
    }

    public boolean takeFood() {
        System.out.println("Take Food! and animals will be energetic !");
        for(Animal a : animals){
            if(a.getBreeding() < 95)
                a.setBreeding(a.getBreeding() + 5);
            else
                a.setBreeding(100);
        }
        return true;
    }

    public void showDetail(){
        System.out.println(getDescription());
    }
}
