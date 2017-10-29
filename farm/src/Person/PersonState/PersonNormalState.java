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
    private static PersonNormalState instance = new PersonNormalState();

    public static PersonNormalState getInstance(){
        return instance;
    }

    public PersonNormalState(){};

    public PersonNormalState(Person person){
        this.person = person;
    }

    public PersonNormalState(PersonState state){
        this.person = state.person;
    }

    @Override
    public boolean doSomeAction(){
        /**
         *
         */

        return true;
    }

    @Override
    public String getDescription(){
        String str = "is healthy ^_^";
        return str;
    }
}
