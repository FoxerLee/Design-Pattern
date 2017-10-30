package src.Item.Food.Strategy.LuxuryFood;

import src.Item.Food.FoodForPerson;
import src.Item.Food.Strategy.CookStrategy;
import src.Item.Food.Strategy.LuxuryFood.LuxuryFood;
import src.Utility.FoodType;

/**
 * Strategy & Prototype
 * @author YGH
 * @version 2017-10-29 02:00
 */
public class LuxuryFoodStrat implements CookStrategy {
    @Override
    public FoodForPerson cooking() {
        FoodForPerson f = LuxuryFood.findAndClone(FoodType.LUXU);
        return f;
    }
    @Override
    public String toString() {
        return "Luxury food is cooked.";
    }
}
