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
        upVIT = -50;  //体力值改变值
//        this.targetPlant = targetPlant;
    };

    /**
     * 根据人物状态判断执行结果，输出结果
     * 改变体力值，检测状态
     * @return
     */
    @Override
    public boolean doSomething() {
        if (getTargetPerson().getState().doSomeAction()){
            System.out.println("Action executing succeed.");
            System.out.println(getTargetPerson().getName() + " " + getDescription() + " now.");
            getTargetPerson().addVIT(upVIT);  //体力值改变
            getTargetPerson().getState().changePersonState();   //状态改变
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
