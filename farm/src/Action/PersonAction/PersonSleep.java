package src.Action.PersonAction;

import src.Base.Action;
import src.Base.Person;

/**
 * 人物睡觉动作
 * @author chenhui
 * @version 2017/10/28.
 */

public class PersonSleep extends PersonAction {

    /**
     * 构造函数
     * @param targetPerson
     */

    public PersonSleep(Person targetPerson){
        super(targetPerson);
        upVIT = 10;  //体力值改变值
    };

    /**
     * 输出结果，增加人物体力值，同时检测人物状态是否改变
     * @return 执行情况
     */
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
