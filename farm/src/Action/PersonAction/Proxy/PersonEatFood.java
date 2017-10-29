package src.Action.PersonAction.Proxy;

import src.Action.PersonAction.PersonAction;
import src.Base.Person;

/**
 * 代理模式 proxy modol
 * PersonEatFood的实体类
 * @author chenhui
 * @version 2017/10/29
 */

public class PersonEatFood extends PersonAction {
    public PersonEatFood(Person targetPerson){
        super(targetPerson);
        upVIT = 20;
    }

    @Override
    public boolean doSomething() {
        System.out.println("Action executing succeed.");
        System.out.println(getTargetPerson().getName() + " " + getDescription());
        getTargetPerson().addVIT(upVIT);
        getTargetPerson().getState().changePersonState();
        return true;
    }

    @Override
    public String getDescription() {
        String str = "eat some food";
        return str;
    }


}
