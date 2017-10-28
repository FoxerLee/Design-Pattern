package src.Item;

/**
 * 适配器模式中适配器类
 * @version 2017/10/26
 * @auther bingjieyang
 **/
public class Adapter implements Lamppost{
    /**
     * 适配器模式中Adapter中所拥有的Adaptee
     * @param desklamp
     */
    public Adapter(Desklamp desklamp) {
        this.desklamp = desklamp;
    }

    /**
     * 适配器模式中Adapter调用Adaptee中的函数
     * 当前使用适配器的基础设施
     * @param concreteFacility
     */
    @Override
    public void turnOn(ConcreteFacility concreteFacility) {
        desklamp.turnOn(concreteFacility);
    }

    /**
     * 适配器模式中Adapter调用Adaptee中的函数
     * 当前使用适配器的基础设施
     * @param concreteFacility
     */
    @Override
    public void turnOff(ConcreteFacility concreteFacility) {
        desklamp.turnOff(concreteFacility);
    }

    /**
     * 适配器模式中Adapter中所拥有的Adaptee
     */
    private Desklamp desklamp;
}
