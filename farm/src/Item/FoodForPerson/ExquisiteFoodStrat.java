package src.Item.FoodForPerson;

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
}
