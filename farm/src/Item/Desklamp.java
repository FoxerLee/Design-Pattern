package src.Item;

/**
 * @version 2017/10/26
 * @auther bingjieyang
 * 适配器模式中的Adaptee
 **/
public class Desklamp extends Props {
    /**
     * 开灯
     * 调用开灯的建筑
     * @param concreteFacility
     */
    public void turnOn(ConcreteFacility concreteFacility){
        System.out.println("The light of "+concreteFacility.getName()+" is on.");
    }

    /**
     * 关灯
     * 调用关灯的建筑
     * @param concreteFacility
     */
    public void turnOff(ConcreteFacility concreteFacility){
        System.out.println("The light of "+concreteFacility.getName()+" is off.");

    }
}
