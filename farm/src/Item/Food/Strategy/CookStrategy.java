package src.Item.Food.Strategy;

import src.Item.Food.FoodForPerson;

/**
 * Cook strategy(Strategy & Prototype)
 * @author YGH
 * @version 2017-10-29 02:00
 */
public interface CookStrategy {
    /**
     * Virtual method (for polymorphism).
     * @return foodForPerson
     *
     */
    public abstract FoodForPerson cooking();
}
