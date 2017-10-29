package src.Person.PersonState;


import src.Base.Person;

/**
 * 状态模式
 * 管理人物身体状态
 * 生病状态
 * @author  chenhui
 * @version  2017/10/28.
 */

public class PersonSickState extends PersonState {
    private static PersonSickState instance = new PersonSickState();

    public static PersonSickState getInstance(){
        return instance;
    }
    public PersonSickState(){};


    public PersonSickState(Person person){
        this.person = person;
    }

    public PersonSickState(PersonState state){
        this.person = state.person;
    }

    @Override
    public boolean doSomeAction(){
        /**
         *
         */

        return false;
    }

    @Override
    public String getDescription(){
        String str = "is sick QAQ";
        return str;
    }
}
