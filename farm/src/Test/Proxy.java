package src.Test;

import src.Action.PersonAction.PersonAction;
import src.Action.PersonAction.PersonSleep;
import src.Action.PersonAction.PersonWateringPlant;
import src.Action.PersonAction.Proxy.*;
import src.Base.Person;

/**
 * Created by chenhui on 2017/10/29.
 */
public class Proxy {
    public static void main(String[] args){
        Person Jack = new Person("Jack", 1);
        PersonAction JackEatFood = new ProxyPersonEatFood(Jack);
        PersonAction JackWatering = new PersonWateringPlant(Jack);
        JackWatering.run();
        JackEatFood.run();
        JackEatFood.run();
        JackEatFood.run();
        JackEatFood.run();
    }
}
