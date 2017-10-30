package src.Item.Building;


import src.Base.Person;
import src.Item.Facilities.Building;

/**
 * 房屋类
 * @version 2017/10/26
 * @author bingjieyang
 **/
public class House extends Building {



    /**
     * 获取被装饰者用装饰类装饰后的被装饰者的描述
     */
    @Override
    public void getDescription() {
        System.out.print(getName()+" is a house");
    }


    /**
     *
     * @param name 名字
     *
     * @param capacity 容量
     */
    public House(String name, int capacity) {
        super(name, capacity);

    }

    /**
     *
     * @param name 名字
     */
    public House(String name) {
        super(name);

        this.setName(name);
    }

    /**
     * 添加人员
     *
     * @param person 被添加的人
     *
     * @return 返回true操作成功，返回false操作失败
     */
    public boolean addLodger(Person person){
        check(person);
        return addLodger(person);
    }

    /**
     *删除成员
     *
     * @param person 被删除的人
     *
     * @return 返回true操作成功，返回false操作失败
     */
    public boolean removeLodger(Person person){
        return removeLodger(person);
    }
}
