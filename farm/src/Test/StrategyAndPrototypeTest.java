package src.Test;

import src.Item.FoodForPerson.FoodForPerson;
import src.Person.Cook;
import src.Utility.FoodType;

public class StrategyAndPrototypeTest {
    public static void main(String[] args) {
        Cook Tim = new Cook("Tim", 1);
        FoodForPerson food = Tim.doCooking(FoodType.SIMP);
        System.out.println(food);
    }
}
