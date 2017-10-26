package src.Item;

/**
 * @version 2017/10/26
 * @auther bingjieyang
 **/
public class Desklamp extends Props {
    public void turnOn(ConcreteFacility concreteFacility){
        System.out.println("The light of "+concreteFacility.getName()+" is on.");
    }

    public void turnOff(ConcreteFacility concreteFacility){
        System.out.println("The light of "+concreteFacility.getName()+" is off.");

    }
}
