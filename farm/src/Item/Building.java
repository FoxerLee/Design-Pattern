package src.Item;

public class Building extends CurrentFacility {
    public Building(String name, int capacity){
        super(name, capacity);
    }


    public Building(String name, int capacity) {
        super(name, capacity);
    }

    public Building(String name) {
        super(name);
    }

    @Override
    public void getDescription() {
        System.out.print(getName());
    }

}
