package src.Item;

import src.Base.Item;

public class Decorator extends Item implements Facility {
    public Decorator(CurrentFacility currentfacility) {
        this.currentfacility = currentfacility;
    }


    @Override
    public String getDescription() {
        return currentfacility.getDescription()+ " is a " + currentfacility.getClass() + " with " +getDescription();
    }

    private CurrentFacility currentfacility;

}
