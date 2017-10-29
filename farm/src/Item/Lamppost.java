package src.Item;

/**
 * 适配器模式中提供的接口
 * @version 2017/10/26
 * @author bingjieyang
 *
 **/
public interface  Lamppost {
    /**
     * 开灯
     *
     * @param concreteFacility 调用开灯的基础设施
     */
    public void turnOn(ConcreteFacility concreteFacility);

    /**
     * 关灯
     *
     * @param concreteFacility 调用关灯的基础设施
     */
    public void turnOff(ConcreteFacility concreteFacility);
}
