package src.Animal;

import src.Base.Animal;
import src.Base.Item;

/**
 * @author YGH
 * @version 2017-10-29 13:00
 */
public abstract class Livestock extends Animal {

    private int meatAmount;
    private int leatherAmount;

    private Item animalProduct;

    /*
     * Getters & Setters
     */
    public int getMeatAmount() {
        return meatAmount;
    }

    public void setMeatAmount(int meatAmount) {
        this.meatAmount = meatAmount;
    }

    public int getLeatherAmount() {
        return leatherAmount;
    }

    public void setLeatherAmount(int leatherAmount) {
        this.leatherAmount = leatherAmount;
    }

    public Item getAnimalProduct() {
        return animalProduct;
    }

    public void setAnimalProduct(Item animalProduct) {
        this.animalProduct = animalProduct;
    }

    /**
     * Livestock produces item (Factory Method)
     * @param interval
     * Production interval.
     * @return animalProduct
     * Animal product like egg, milk, wool, etc.
     */
    public Item produce(int interval) {
        animalProduct = createProduct(interval);
        return animalProduct;
    }

    /**
     * Virtual Constructor (Factory Method)
     * @param interval
     * Production interval.
     * @return Item
     * Return Custom-defined product.
     */
    public abstract Item createProduct(int interval);

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public void sleep() {

    }
}
