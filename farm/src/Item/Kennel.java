package src.Item;


import src.Animal.Dog;

/**
 * @version 2017/10/26
 * @auther bingjieyang
 **/
public class Kennel extends Building {


    /**
     * 名字
     * @param name
     * 容量
     * @param capacity
     */
    public Kennel(String name, int capacity){
        super(name, capacity);
    }

    /**
     * 名字
     * @param name
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
     * 被添加的狗
     * @param dog
     * 返回true操作成功，返回false操作失败
     * @return
     */
    public boolean addLodger(Dog dog){
        check(dog);
        return addLodger(dog);
    }

    /**
     * 移除狗
     * 被移除的狗
     * @param dog
     * 返回true操作成功，返回false操作失败
     * @return
     */
    public boolean removeLodger(Dog dog){
        return removeLodger(dog);
    }
}
