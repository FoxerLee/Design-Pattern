package src.Test;

/**
 * Created by chenhui on 2017/10/29.
 */

import src.Action.PersonAction.PersonAction;
import src.Action.PersonAction.PersonSleep;
import src.Action.PersonAction.PersonWateringPlant;
import src.Base.*;
import src.Person.*;

public class State {
    public static void main(String[] args){
        Person Jack = new Person("Jack", 1);
        PersonAction JackSleep = new PersonSleep(Jack);
        PersonAction JackWateringPlant = new PersonWateringPlant(Jack);
//        JackSleep.run();
//        JackSleep.run();
        JackWateringPlant.run();
        JackWateringPlant.run();
        JackSleep.run();
        JackWateringPlant.run();
        JackWateringPlant.run();
        JackSleep.run();
        JackSleep.run();
        JackSleep.run();
        JackWateringPlant.run();
//        for (int i = 0; i <= 10; ++i){
//            JackWateringPlant.run();
//        }

    }
}
