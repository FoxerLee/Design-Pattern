package src.Item;


import src.Base.Person;

/**
 * 房屋类
 */
public class House extends Building {


    /**
     * 获取被装饰者用装饰类装饰后的被装饰者的描述
     */
    @Override
    public void getDescription() {
        System.out.print(getName()+" is a house");
    }

    /**
     * 房屋名称
     * @param name
     */
    public House(String name) {
        super(name);
        this.setName(name);
    }

    /**
     * 添加人员
     *被添加的人
     * @param person
     * 返回true操作成功，返回false操作失败
     * @return
     */
    public boolean addLodger(Person person){
        check(person);
        return addLodger(person);
    }

    /**
     *删除成员
     * 被删除的人
     * @param person
     * 返回true操作成功，返回false操作失败
     * @return
     */
    public boolean removeLodger(Person person){
        return removeLodger(person);
    }
}
