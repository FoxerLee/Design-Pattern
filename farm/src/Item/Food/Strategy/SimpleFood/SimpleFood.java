package src.Item.Food.Strategy.SimpleFood;

import src.Item.Food.FoodForPerson;
import src.Utility.FoodType;

/**
 * Prototype
 * @author YGH
 * @version 2017-10-29 02:20
 */
public class SimpleFood extends FoodForPerson {
    private static int refs = 1;
    private int id;
    private static SimpleFood sf;
    private SimpleFood() {
        addPrototype(this);
    }
    protected SimpleFood(int d) {
        id = refs++;
    }

    @Override
    protected FoodType returnType() {
        return FoodType.SIMP;
    }

    @Override
    protected FoodForPerson clone() {
        return new SimpleFood(1);
    }

    @Override
    public String toString() {
        return "Here is a simple food.";
    }
}
