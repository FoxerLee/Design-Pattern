package src.Action.PersonAction.Proxy;

import src.Base.Person;

/**
 * 代理模式 proxy modol
 * 检验器类,执行检验操作
 * @author chenhui
 * @version 2017/10/29
 */
public class Validator {
    Validator(){}
    public boolean validator(Person person){
        if (person.getVIT() == person.getMaxVIT()) {
            return false;
        }
        else {
            return true;
        }
    }
}
