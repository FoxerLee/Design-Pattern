package src.Item.Food.Strategy.LuxuryFood;

import src.Item.Food.FoodForPerson;
import src.Utility.FoodType;

/**
 * Prototype
 * @author YGH
 * @version 2017-10-29 02:20
 */
public class LuxuryFood extends FoodForPerson {
    private static int refs = 1;
    private int id;
    private static LuxuryFood lf;
    private LuxuryFood() {
        addPrototype(this);
    }
    protected LuxuryFood(int d) {
        id = refs++;
    }
    @Override
    protected FoodType returnType() {
        return FoodType.LUXU;
    }

    @Override
    protected FoodForPerson clone() {
        return new LuxuryFood(1);
    }
    @Override
    public String toString() {
        return "Here is a luxury food.";
    }
}
