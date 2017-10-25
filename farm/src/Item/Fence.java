package src.Item;

public class Fence extends Decorator {
    public Fence(CurrentFacility currentfacility) {
        super(currentfacility);
    }

    @Override
    public String getDescription() {
        return getName();
    }

}
