package src.Animal;

import src.Base.Item;
import src.Item.AnimalProduct.Wool;

/**
 * @version 2017/10/29 13:00
 * @author bingjieyang, YGH
 **/
public class Sheep extends Livestock {
    private final int producingInterval = 180;  //days
    private final int producingAmount = 75;
    private Wool sheepProduct;
    @Override
    public Item createProduct(int interval) {
        //Should get system time here... interval changes with time
        if (0 == interval)
            return new Wool(producingAmount);
        else
            return null;
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
