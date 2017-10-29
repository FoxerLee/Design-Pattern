package src.Item;

/**
 * 台灯类 适配器模式中的Adaptee
 * @version 2017/10/26
 * @author bingjieyang
 *
 **/
public class Desklamp extends Props {
    /**
     * 开灯
     *
     * @param concreteFacility 调用开灯的建筑
     */
    public void turnOn(ConcreteFacility concreteFacility){
        System.out.println("The light of "+concreteFacility.getName()+" is on.");
    }

    /**
     * 关灯
     *
     * @param concreteFacility 调用关灯的建筑
     */
    public void turnOff(ConcreteFacility concreteFacility){
        System.out.println("The light of "+concreteFacility.getName()+" is off.");

    }
}
