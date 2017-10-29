package src.Person.PersonState;

import src.Action.PersonAction.PersonAction;
import src.Base.Person;

/**
 * 状态模式
 * 管理人物身体状态
 * 正常状态
 * @author  chenhui
 * @version  2017/10/28.
 */

public class PersonNormalState extends PersonState{
    /**
     * 具体状态为单例模式
     *
     */
    private static PersonNormalState instance = new PersonNormalState();
    public static PersonNormalState getInstance(){
        return instance;
    }

    /**
     * 构造函数
     */
    public PersonNormalState(){};
    public PersonNormalState(Person person){
        this.person = person;
    }
    public PersonNormalState(PersonState state){
        this.person = state.person;
    }


    /**
     * 执行该状态对应操作
     * @return
     */
    @Override
    public boolean doSomeAction(){
        /**
         * 可补充
         */

        return true;
    }

    /**
     *
     * @return 状态描述
     */
    @Override
    public String getDescription(){
        String str = "is healthy ^_^";
        return str;
    }
}
