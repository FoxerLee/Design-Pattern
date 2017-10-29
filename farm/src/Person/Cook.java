package src.Person;

import src.Base.Person;
import src.Item.FoodForPerson.*;
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
    public Cook(String ID) {
        super(ID);
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
