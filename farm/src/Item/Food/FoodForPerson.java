package src.Item.Food;

import src.Base.Item;
import src.Utility.FoodType;

/**
 * Abstraction of food for person (Prototype)
 * @author YGH
 * @version 2017-10-29 02:10
 */
public abstract class FoodForPerson extends Item {

    private static final int MAX_FOODTYPE_AMOUNT = 10;
    private static int count = 0;
    private static FoodForPerson[] prototypes = new FoodForPerson[MAX_FOODTYPE_AMOUNT];

    /**
     * Get food type of current instance; virtual method.
     * @return foodType
     */
    protected abstract FoodType returnType();

    /**
     * Get new food instance by clone; virtual method.
     * @return foodForPerson
     */
    protected abstract FoodForPerson clone();

    /**
     * Add new food prototype to prototype array.
     * @param f
     * New prototype of food.
     */
    protected static void addPrototype(FoodForPerson f) {
        prototypes[count++] = f;
    }

    /**
     * Find if param' ft is a new type of food. If not, get a clone.
     * @param ft
     * A food type.
     * @return foodForPerson
     */
    public static FoodForPerson findAndClone(FoodType ft){
        for (int i = 0; i < count; ++i) {
            if (prototypes[i].returnType() == ft) return prototypes[i].clone();
        }
        return null;
    }
}
