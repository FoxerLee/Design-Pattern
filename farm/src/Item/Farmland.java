package src.Item;

import src.Base.Plant;

/**
 * 土地类
 */
public class Farmland extends CurrentFacility {

    /**
     * 土地名称
     * @param name
     * 土地容量
     * @param capacity
     */
    public Farmland(String name, int capacity) {
        super(name, capacity);
    }

    /**
     * 土地名称
     * @param name
     */
    public Farmland(String name) {
        super(name,10);
    }

    /**
     * 获取被装饰者用装饰类装饰后的被装饰者的描述
     */
    @Override
    public void getDescription() {

        System.out.print(getName());
    }

    /**
     *种植植物
     * 被种植的植物
     * @param plant
     * 返回true表示种植成功，false表示失败
     * @return
     */
    public boolean addLodger(Plant plant){
        check(plant);
        return addLodger(plant);
    }

    /**
     *移除植物
     * 被移除的植物
     * @param plant
     * 返回true表示移除成功，false表示移除失败
     * @return
     */
    public boolean removeLodger(Plant plant){
        return removeLodger(plant);
    }


}
