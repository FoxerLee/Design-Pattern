package src.Item;

public class Building extends CurrentFacility {



    /**
     * 建筑的名称
     * @param name
     * 容量
     * @param capacity
     */
    public Building(String name, int capacity) {
        super(name, capacity);
    }

    /**
     * 建筑的名称
     * @param name
     */
    public Building(String name) {
        super(name);
    }


    @Override
    public String getDescription() {
        return this.getName();
    }

}
