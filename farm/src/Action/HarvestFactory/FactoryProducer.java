package src.Action.HarvestFactory;

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
