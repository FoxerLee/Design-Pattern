package src.Item;

import src.Base.Item;

public class Decorator extends Item implements Facility {
    public Decorator(Facility facility) {
        this.facility = facility;
    }


    @Override
    public void getDescription() {
        facility.getDescription();

    }

    private Facility facility;

}
