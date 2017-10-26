package src.Item;

public class Building extends CurrentFacility {
    public Building(String name, int capacity){
        super(name, capacity);
    }

    @Override
    public String getDescription() {
        return this.getName();
    }

}
