package src.Item.FoodForPerson;

import src.Utility.FoodType;

/**
 * Strategy & Prototype
 * @author YGH
 * @version 2017-10-29 02:00
 */
public class SimpleFoodStrat implements CookStrategy {
    @Override
    public FoodForPerson cooking() {
        FoodForPerson f = SimpleFood.findAndClone(FoodType.SIMP);
        return f;
    }
    @Override
    public String toString() {
        return "Simple food is cooked.";
    }
}
