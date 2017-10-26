package src.Item;
import src.Base.*;

import java.util.LinkedList;


/**
 * @version 2017/10/26
 * @auther bingjieyang
 *
    *
 * 具体基础设施实现
 * capacity容量
 * usedCapacity已用容量
 * lodgerList设施所容纳的人或物的List
 */
public class ConcreteFacility extends Item implements Facility {

    private int capacity;
    private int usedCapacity;
    private LinkedList lodgerList;

    /**
     * 具体基础设施名称
     * @param name
     * 容量
     * @param capacity
     */
    public ConcreteFacility(String name, int capacity) {
        this.capacity = capacity;
        this.usedCapacity = 0;
        this.setName(name);
    }

    /**
     * 具体基础设施名称
     * @param name
     */
    public ConcreteFacility(String name) {
        this.capacity = 2;
        this.usedCapacity = 0;
        this.setName(name);
    }


    /**
     * 检查是否能装入lodgerList
     * 待装入的对象
     * @param e
     * true 表示可以装入
     * false 表示不可装入
     * @return
     */
    public boolean check(Entity e){
        if (e!=null)
            return true;
        else
            return false;
    }

    /**
     * 向基础设施添加一个成员
     * 待添加的成员
     * @param e
     * true 表示添加成功
     * false 表示添加失败
     * @return
     */
    protected boolean addLodger(Entity e){
        check(e);
        return lodgerList.add(e);
    }


    /**
     * 移除基础设施中的一个成员
     * 待移除的成员
     * @param e
     * true 表示移除成功
     * false 表示移除失败
     * @return
     */
    public boolean removeLodger(Entity e){
        return  lodgerList.remove(e);
    }


    /**
     * 获取被装饰者用装饰类装饰后的被装饰者的描述
     */
    @Override
    public void getDescription() {
        System.out.print(getName());
    }

    /**
     * lodgerList满时返回true
     * lodgerList未满时返回false
     * @return
     */
    public boolean isFull(){
        return lodgerList.size()>=capacity;
    }

    /**
     * lodgerList为空时返回true
     * 否则返回false
     * @return
     */
    public boolean isEmpty(){

        return lodgerList.isEmpty();
    }

    /**
     * 升级容量，容量升级为之前的两倍
     * 升级成功返回true，否则返回false
     * @return
     */
    public boolean upgrade(){
        if (capacity*2>Integer.MAX_VALUE){
            return false;
        }
        else {
            capacity=capacity*2;
            return true;
        }
    }

    /**
     * 降级容量，容量降级为之前的一半
     * 降级成功返回true，否则返回false
     * @return
     */
    public boolean degrade(){
        if (capacity/2<0||capacity/2<usedCapacity){
            return false;
        }
        else {
            capacity=capacity/2;
            return true;
        }

    }
}
