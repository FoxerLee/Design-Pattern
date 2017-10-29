package src.Item.AnimalProduct;

import src.Base.Item;

/**
 * Factory Method
 * @author YGH
 * @version 2017-10-29 13:00
 */
public class Wool extends Item {
    private final int value = 10; //for each
    private int amount;
    public Wool() {
        this(0);
    }
    public Wool(int amount) {
        this.setValue(value * amount);
        this.setAmount(amount);
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
