package src.Item;
import src.Base.*;

import java.util.LinkedList;


/**
 * @version 2017/10/26
 * @auther bingjieyang
 *
 *
 * 具体基础设施实现
 */
public abstract class ConcreteFacility extends Item implements Facility {


    /**
     * 责任链模式中获取下一个处理者
     * @return 下一个处理者
     */
    public ConcreteFacility getSuccessor() {
        return successor;
    }

    /**
     * 责任链模式中设置下一个处理者
     * 下一个处理者
     * @param successor
     */
    public void setSuccessor(ConcreteFacility successor) {
        this.successor = successor;
    }


    /**
     * 具体基础设施名称
     * @param name
     * 容量
     * @param capacity
     */
    public ConcreteFacility(String name, int capacity) {
        super();
        this.capacity = capacity;
        this.usedCapacity = 0;
        this.setName(name);
    }

    /**
     * 具体基础设施名称
     * @param name
     */
    public ConcreteFacility(String name) {
        super();
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


    /**
     * 责任链模式中的Handler()方法
     * 总共需要抵押的金额
     * @param value
     */
    public void mortgage(int value) {
        //当前抵押列表中的基础设施总金额达到或超过总共需要抵押的金额
        if (this.getValue()>= value){
            System.out.println(this.getName() + " has been mortgaged,");
        }
        //当前抵押列表中的基础设施总金额不足总共需要抵押的金额，且责任链仍然未到末尾
        else if (getSuccessor()!=null){
            System.out.println(this.getName() + " has been mortgaged,");
            getSuccessor().mortgage(value-this.getValue());
        }
        //达到责任链末尾，但是仍然未达到总共需要抵押的金额
        else {
            System.out.println(this.getName() + " has been mortgaged,");
            System.out.println("Sorry, there is no such facility can handle the mortgaged request");
        }
    }

    //capacity容量
    private int capacity;
    //usedCapacity已用容量
    private int usedCapacity;
    //lodgerList设施所容纳的人或物的List
    private LinkedList lodgerList;
    //责任链中下一个处理者
    private ConcreteFacility successor;



}
