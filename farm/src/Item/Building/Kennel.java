package src.Item.Building;


import src.Animal.Pet.Dog;
import src.Item.Facilities.Building;

/**
 * 狗舍类
 * @version 2017/10/26
 * @author bingjieyang
 **/
public class Kennel extends Building {


    /**
     *
     * @param name 名字
     *
     * @param capacity 容量
     */
    public Kennel(String name, int capacity){
        super(name, capacity);
    }

    /**
     *
     * @param name 名字
     */
    public Kennel(String name){
        super(name);
    }

    /**
     * 获取被装饰者用装饰类装饰后的被装饰者的描述
     */
    @Override
    public void getDescription(){
        super.getDescription();
        System.out.print(getName()+" is a kennel ");

    }


    /**
     * 添加狗
     *
     * @param dog 被添加的狗
     *
     * @return 返回true操作成功，返回false操作失败
     */
    public boolean addLodger(Dog dog){
        check(dog);
        return addLodger(dog);
    }

    /**
     * 移除狗
     *
     * @param dog 被移除的狗
     *
     * @return 返回true操作成功，返回false操作失败
     */
    public boolean removeLodger(Dog dog){
        return removeLodger(dog);
    }
}
