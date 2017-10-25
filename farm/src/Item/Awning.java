package src.Item;

/**
 *
 */
public class Awning extends Decorator {
<<<<<<< HEAD

    public Awning(CurrentFacility currentfacility){
        super(currentfacility);
    }

=======
    /**
     *维持一个指向Facility对象的引
     * @param facility
     */
    public Awning(Facility facility) {
        super(facility);

    }

    /**
     * 获取Facility用装饰类装饰后的Facility的描述
     */
>>>>>>> 9321d2157c5bce5239e8db195b09a3dbe0b6da0c
    @Override
    public void getDescription() {

        super.getDescription();
        System.out.print(", awning");
    }
}
