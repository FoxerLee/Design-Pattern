package src.Item;

/**
 * @version 2017/10/26
 * @auther bingjieyang
 * 适配器模式中提供的接口
 **/
public interface  Lamppost {
    /**
     * 开灯
     * 调用开灯的基础设施
     * @param concreteFacility
     */
    public void turnOn(ConcreteFacility concreteFacility);

    /**
     * 关灯
     * 调用关灯的基础设施
     * @param concreteFacility
     */
    public void turnOff(ConcreteFacility concreteFacility);
}
