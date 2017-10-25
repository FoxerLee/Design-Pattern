package src.Item;

import src.Base.Plant;

public class Farmland extends CurrentFacility {

    public Farmland(String name, int capacity) {
        super(name, capacity);
    }

    public Farmland(String name) {
        super(name);
    }

    @Override

    public void getDescription() {
        System.out.print(getName());
    }

    public boolean addLodger(Plant plant){
        check(plant);
        return addLodger(plant);
    }

    public boolean removeLodger(Plant plant){
        return removeLodger(plant);
    }


}
