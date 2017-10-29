package src.Item.FoodForPerson;

import src.Utility.FoodType;

/**
 * Prototype
 * @author YGH
 * @version 2017-10-29 02:10
 */
public abstract class FoodForPerson {
    private static final int MAX_FOODTYPE_AMOUNT = 10;
    private static int count = 0;
    private static FoodForPerson[] prototypes = new FoodForPerson[MAX_FOODTYPE_AMOUNT];

    protected abstract FoodType returnType();
    protected abstract FoodForPerson clone();
    protected static void addPrototype(FoodForPerson f) {
        prototypes[count++] = f;
    }

    public static FoodForPerson findAndClone(FoodType ft){
        for (int i = 0; i < count; ++i) {
            if (prototypes[i].returnType() == ft) return prototypes[i].clone();
        }
        return null;
    }
}
