package src.Item;

import src.Base.Plant;

public class Farmland extends CurrentFacility {

<<<<<<< HEAD
    public Farmland(String name,int capacity){
        super(name, capacity);
    }

    public String getDescription(){
        return getName();
=======
    public Farmland(String name, int capacity) {
        super(name, capacity);
    }

    public Farmland(String name) {
        super(name);
>>>>>>> 9321d2157c5bce5239e8db195b09a3dbe0b6da0c
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
