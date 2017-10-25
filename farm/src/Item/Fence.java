package src.Item;

public class Fence extends Decorator {
    public Fence(CurrentFacility currentfacility) {
        super(currentfacility);
    }

    public Fence(Facility facility) {
        super(facility);

    }

    @Override
    public void getDescription() {

        super.getDescription();
        System.out.print(", fence");
    }

}
