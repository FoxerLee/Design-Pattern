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
    /**
     * 所代理的实体对象
     */
    private PersonEatFood action;

    /**
     * 效验器
     */
    private Validator validator;

    /**
     * 构造函数
     * @param person 执行者
     */
    public ProxyPersonEatFood(Person person){
        super(person);
    }

    /**
     * 体力值为满时（效验器生效），提示人物无需进食
     * 体力值未满时，执行实体对象动作
     * @return
     */
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

    /**
     * 检验器调用函数
     * @param person 执行对象
     * @return
     */
    public boolean validator(Person person){
        validator = new Validator();
        return validator.validator(person);
    }

}
