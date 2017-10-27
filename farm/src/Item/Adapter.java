package src.Item;

/**
 * @version 2017/10/26
 * @auther bingjieyang
 **/
public class Adapter implements Lamppost{

    public Adapter(Desklamp desklamp) {
        this.desklamp = desklamp;
    }

    @Override
    public void turnOn(ConcreteFacility concreteFacility) {
        desklamp.turnOn(concreteFacility);
    }

    @Override
    public void turnOff(ConcreteFacility concreteFacility) {
        desklamp.turnOff(concreteFacility);
    }

    private Desklamp desklamp;
}
