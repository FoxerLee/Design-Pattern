package src.Person;

import src.Base.Person;
import src.Item.Food.*;
import src.Item.Food.Strategy.CookStrategy;
import src.Item.Food.Strategy.ExquisiteFood.ExquisiteFoodStrat;
import src.Item.Food.Strategy.LuxuryFood.LuxuryFoodStrat;
import src.Item.Food.Strategy.SimpleFood.SimpleFoodStrat;
import src.Utility.FoodType;

/**
 * Using Strategy DP
 * @author YGH
 * @version 2017-10-29 01:30
 */
public class Cook extends Person {
    private CookStrategy ckstr;

    public Cook() {
    }
    public Cook(String name, int gender) {
        super(name, gender);
    }

    protected void setCookStrat(FoodType foodType) {
        if (foodType == FoodType.SIMP) {
            ckstr = new SimpleFoodStrat();
        } else if (foodType == FoodType.EXQU) {
            ckstr = new ExquisiteFoodStrat();
        } else if (foodType == FoodType.LUXU) {
            ckstr = new LuxuryFoodStrat();
        }
    }
    public FoodForPerson doCooking(FoodType foodType) {
        setCookStrat(foodType);
        return ckstr.cooking();
    };

}
