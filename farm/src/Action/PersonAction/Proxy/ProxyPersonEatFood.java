package src.Action.PersonAction.Proxy;

import src.Action.PersonAction.PersonAction;
import src.Action.PersonAction.Proxy.PersonEatFood;
import src.Base.Person;

/**
 * 代理模式 proxy modol
 * PersonEatfood的代理类
 * @author chenhui
 * @version 2017/10/29
 */

public class ProxyPersonEatFood extends PersonAction {
    private PersonEatFood action;
    private Validator validator;

    public ProxyPersonEatFood(Person person){
        super(person);
    }

    @Override
    public boolean doSomething() {
        Person TarPerson = this.getTargetPerson();
        if (this.action == null){
            action = new PersonEatFood(TarPerson);
        }
        if (!validator(TarPerson)) {
            System.out.println(TarPerson.getName() + " is full, can not eat anymore.");
            return true;
        }
        else {
            action.doSomething(); //实体类的真实操作
            return true;
        }
    }

    public boolean validator(Person person){
        validator = new Validator();
        return validator.validator(person);
    }

}
