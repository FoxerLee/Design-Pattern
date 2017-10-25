package src.Item;

public class Awning extends Decorator {

    public Awning(CurrentFacility currentfacility){
        super(currentfacility);
    }

    @Override
    public String getDescription() {
        return getName();
    }
}
