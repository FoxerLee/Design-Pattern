package src.Action.HarvestAction;

/**
 * 这个类可以产生不同类型的抽象工厂：生产种子的或者生产化肥的
 * 若param为1， 则返回化肥工厂；若为2，返回种子工厂
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(int choice){
        if(choice == 1){
            return new FertilizerAbstractFactory();
        }
        else if(choice == 2){
            return new SeedAbstractFactory();
        }
        else
            return null;
    }
}
