package src.Item;

import src.Animal.Sheep;

/**
 * @version 2017/10/26
 * @auther bingjieyang
 **/
public class Sheepfold extends Building {


    /**
     * 名字
     * @param name
     * 容量
     * @param capacity
     */
    public Sheepfold(String name, int capacity){
        super(name, capacity);
    }

    /**
     * 获取被装饰者用装饰类装饰后的被装饰者的描述
     */
    @Override
    public void getDescription() {
        super.getDescription();
        System.out.print(getName()+" is a sheepfold ");
    }

    /**
     * 名字
     * @param name
     *
     */
    public Sheepfold(String name) {
        super(name);

    }


    /**
     * 添加羊
     * 被添加的羊
     * @param sheep
     * 返回true操作成功，返回false操作失败
     * @return
     */
    public boolean addLodger(Sheep sheep){
        check(sheep);
        return addLodger(sheep);
    }


    /**
     * 移除羊
     * 被添加的羊
     * @param sheep
     * 返回true操作成功，返回false操作失败
     * @return
     */
    public boolean removeLodger(Sheep sheep){
        return removeLodger(sheep);
    }
}
