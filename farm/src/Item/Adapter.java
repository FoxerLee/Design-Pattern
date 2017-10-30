package src.Item;

import src.Item.Facilities.*;
import src.Item.Props.Desklamp;

/**
 * 适配器模式中适配器类
 * @version 2017/10/26
 * @author bingjieyang
 **/
public class Adapter implements Lamppost{
    /**
     * 构造函数
     * @param desklamp 适配器模式中Adapter中所拥有的Adaptee
     */
    public Adapter(Desklamp desklamp) {
        this.desklamp = desklamp;
    }

    /**
     * 适配器模式中Adapter调用Adaptee中的函数
     *
     * @param concreteFacility 当前使用适配器的基础设施
     */
    @Override
    public void turnOn(ConcreteFacility concreteFacility) {
        desklamp.turnOn(concreteFacility);
    }

    /**
     * 适配器模式中Adapter调用Adaptee中的函数
     *
     * @param concreteFacility 当前使用适配器的基础设施
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
