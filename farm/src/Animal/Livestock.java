package src.Animal;

import src.Base.Animal;
import src.Base.Item;

/**
 * @author YGH
 * @version 2017-10-25
 */
public class Livestock extends Animal {

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
     * @param interval
     * Prodution interval.
     * @return animalProduct
     * Animal product like egg, milk, wool, etc.
     */
    public Item produce(float interval) {
        return animalProduct;
    }
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
