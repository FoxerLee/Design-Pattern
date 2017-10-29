package src.Action.PersonAction;

import src.Base.Person;
import src.Base.Plant;

/**
 * 人物浇水动作
 * @author  chenhui
 * @version  2017/10/28.
 */

public class PersonWateringPlant extends PersonAction{
//    private Plant targetPlant;

    public PersonWateringPlant(Person targetPerson){
        super(targetPerson);
        upVIT = -50;
//        this.targetPlant = targetPlant;
    };

    @Override
    public boolean doSomething() {
        if (getTargetPerson().getState().doSomeAction()){
            System.out.println("Action executing succeed.");
            System.out.println(getTargetPerson().getName() + " " + getDescription() + " now.");
            getTargetPerson().addVIT(upVIT);
            getTargetPerson().getState().changePersonState();
        }
        else {
            System.out.println("Action executing failed.");
            System.out.println(getTargetPerson().getName() + " is sick now. He can't do anything.\n");
        }
        return true;
    }

    @Override
    public String getDescription() {
        String str = "is watering plant";
        return str;
    }

}
