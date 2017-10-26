package src.Item;

/**
 * @version 2017/10/26
 * @auther bingjieyang
 **/

public class Fence extends Decorator {
    public Fence(Facility facility) {
        super(facility);
    }

    @Override
    public void getDescription() {

        super.getDescription();
        System.out.print(", fence");
    }

}
