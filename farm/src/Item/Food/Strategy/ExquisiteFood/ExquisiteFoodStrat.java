package src.Item.Food.Strategy.ExquisiteFood;

import src.Item.Food.FoodForPerson;
import src.Item.Food.Strategy.CookStrategy;
import src.Item.Food.Strategy.ExquisiteFood.ExquisiteFood;
import src.Utility.FoodType;

/**
 * Strategy & Prototype
 * @author YGH
 * @version 2017-10-29 02:00
 */
public class ExquisiteFoodStrat implements CookStrategy {
    @Override
    public FoodForPerson cooking() {
        FoodForPerson f = ExquisiteFood.findAndClone(FoodType.EXQU);
        return f;
    }

    @Override
    public String toString() {
        return "Exquisite food is cooked.";
    }
}
