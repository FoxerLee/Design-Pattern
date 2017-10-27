package src.Item;

import src.Animal.Sheep;

/**
 * @version 2017/10/26
 * @auther bingjieyang
 **/
public class Sheepfold extends Building {


    public Sheepfold(String name, int capacity){
        super(name, capacity);
    }

    public void getDescription() {
        super.getDescription();
        System.out.print(getName()+" is a sheepfold ");
    }

    public Sheepfold(String name) {
        super(name);

    }

    public boolean addLodger(Sheep sheep){
        check(sheep);
        return addLodger(sheep);
    }

    public boolean removeLodger(Sheep sheep){
        return removeLodger(sheep);
    }
}
