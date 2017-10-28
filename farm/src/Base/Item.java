package src.Base;

import src.Base.Entity;

public class Item extends Entity{
    public Item() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private int value;
}
