package src.Item.AnimalProduct;

import src.Base.Item;

/**
 * Customer-defined animal product: Wool (Factory Method)
 * @author YGH
 * @version 2017-10-29 13:00
 */
public class Wool extends Item {
    private final int value = 10; //for each
    private int amount;

    /**
     * Default Constructor (constructor chain)
     */
    public Wool() {
        this(0);
    }

    /**
     * Constructor. Initialize product value while constructing.
     * @param amount
     * Wool amount
     */
    public Wool(int amount) {
        this.setValue(value * amount);
        this.setAmount(amount);
    }

    /**
     * Amount Setter
     * @param amount
     * Wool amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
