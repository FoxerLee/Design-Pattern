package src.Action.PersonAction;

import src.Base.Action;
import src.Base.Person;

/**
 * 人物睡觉动作
 * @author chenhui
 * @version 2017/10/28.
 */

public class PersonSleep extends PersonAction {

    public PersonSleep(Person targetPerson){
        super(targetPerson);
        upVIT = 10;
    };

    @Override
    public boolean doSomething() {
        System.out.println("Action executing succeed.");
        System.out.println(getTargetPerson().getName() + " " + getDescription() + " now.");
        getTargetPerson().addVIT(upVIT);
        getTargetPerson().getState().changePersonState();
        return true;
    }

    @Override
    public String getDescription() {
        String str = "is sleeping";
        return str;
    }

}
