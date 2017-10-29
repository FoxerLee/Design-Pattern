package src.Item.FoodForPerson;

import src.Utility.FoodType;

/**
 * Exquisite food. (Prototype)
 * @author YGH
 * @version 2017-10-29 02:20
 */
public class ExquisiteFood extends FoodForPerson {
    private static int refs = 1;
    private int id;
    private static ExquisiteFood ef;

    private ExquisiteFood() {
        addPrototype(this);
    }
    protected ExquisiteFood(int d) {
        id = refs++;
    }
    @Override
    protected FoodType returnType() {
        return FoodType.EXQU;
    }

    @Override
    protected FoodForPerson clone() {
        return new ExquisiteFood(1);
    }
}
