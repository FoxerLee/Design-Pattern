package src.Person.PersonState;

import src.Action.PersonAction.PersonAction;
import src.Base.*;

/**
 * 状态模式
 * 管理人物身体状态
 * @author  chenhui
 * @version  2017/10/28.
 */

abstract public class PersonState {
    /**
     * 绑定人物对象
     */
    protected Person person;

    public abstract boolean doSomeAction();
    public abstract String getDescription();

    /**
     * person setter
     * @param person
     */
    public void setPerson(Person person){
        this.person = person;
    }

    /**
     * 打印人物当前状态和体力值情况
     */
    public void printPersonState(){
        System.out.println(person.getName() + "'s VIT:" + person.getVIT() + "/" + person.getMaxVIT());
        System.out.println(person.getName() + " " + person.getState().getDescription() + "\n");
    }

    /**
     * 人物状态转换函数
     */
    public void changePersonState(){
        if (person.getVIT() <= 0){
            person.setVIT(0);
            person.setState(PersonSickState.getInstance());
        }
        else {
            person.setState(PersonNormalState.getInstance());
        }

        person.getState().printPersonState();
    }
}


