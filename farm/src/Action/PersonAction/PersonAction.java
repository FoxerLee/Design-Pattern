package src.Action.PersonAction;

import src.Base.Action;
import src.Base.Person;

/**
 * 人物动作类
 * @author  chenhui
 * @version  2017/10/28.
 */

public class PersonAction extends Action{
    /**
     * 绑定执行者
     */
    protected Person targetPerson;

    /**
     * 体力值改变值
     */
    protected int upVIT;

    /**
     * setter & getter
     * @param targetPerson
     */
    public void setTargetPerson(Person targetPerson){
        this.targetPerson = targetPerson;
    }
    public Person getTargetPerson(){
        return this.targetPerson;
    }

    /**
     * 构造函数
     * @param targetPerson
     */
    protected PersonAction(Person targetPerson){
        this.setTargetPerson(targetPerson);
    }


    @Override
    protected boolean doSomething() {
        return false;
    }

    @Override
    protected String getDescription() {
        return null;
    }
}
