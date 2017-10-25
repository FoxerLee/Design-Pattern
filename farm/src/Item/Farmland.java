package src.Item;

import src.Base.Plant;

public class Farmland extends CurrentFacility {
    public String getDescription(){
        return getName();
    }


    public boolean addLodger(Plant plant){
        check(plant);
        return addLodger(plant);
    }

    public boolean removeLodger(Plant plant){
        return removeLodger(plant);
    }


}
