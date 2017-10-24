package Item;

import action.Entity;

public class Item extends Entity{
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private int value;
}
