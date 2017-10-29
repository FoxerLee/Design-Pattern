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

    /**
     * 具体状态为单例模式
     *
     */
    private static PersonSickState instance = new PersonSickState();
    public static PersonSickState getInstance(){
        return instance;
    }

    /**
     * 构造函数
     */
    public PersonSickState(){};
    public PersonSickState(Person person){
        this.person = person;
    }
    public PersonSickState(PersonState state){
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

        return false;
    }

    /**
     *
     * @return 状态描述
     */
    @Override
    public String getDescription(){
        String str = "is sick QAQ";
        return str;
    }
}
