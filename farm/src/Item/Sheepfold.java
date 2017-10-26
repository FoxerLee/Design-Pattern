package src.Item;

import src.Animal.Sheep;

public class Sheepfold extends Building {


    public Sheepfold(String name, int capacity){
        super(name, capacity);
    }

    public String getDescription(){
        return getName();


    public Sheepfold(String name, int capacity) {
        super(name, capacity);

    }

    public boolean addLodger(Sheep sheep){
        check(sheep);
        return addLodger(sheep);
    }

    public boolean removeLodger(Sheep sheep){
        return removeLodger(sheep);
    }
}
