package src.Item.Building;

import src.Animal.Livestock.Sheep;
import src.Item.Facilities.Building;

/**
 * 羊圈类
 * @version 2017/10/26
 * @author bingjieyang
 **/
public class Sheepfold extends Building {


    /**
     *
     * @param name 名字
     *
     * @param capacity 容量
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
     *
     * @param name 名字
     *
     */
    public Sheepfold(String name) {
        super(name);

    }


    /**
     * 添加羊
     *
     * @param sheep 被添加的羊
     *
     * @return  返回true操作成功，返回false操作失败
     */
    public boolean addLodger(Sheep sheep){
        check(sheep);
        return addLodger(sheep);
    }


    /**
     * 移除羊
     *
     * @param sheep 被添加的羊
     *
     * @return 返回true操作成功，返回false操作失败
     */
    public boolean removeLodger(Sheep sheep){
        return removeLodger(sheep);
    }
}
