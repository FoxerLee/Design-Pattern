package src.Item.FarmLandFlyweight;

import src.Item.Farmland;

import java.util.HashMap;

/**
 * Flyweight
 * @author YGH
 * @version 2017-10-29 11:30
 */
public class FarmLandFactory {
    private HashMap pool = new HashMap();
    private static FarmLandFactory singleton;

    private FarmLandFactory() {
    }

    public static FarmLandFactory getInstance() {
        singleton = new FarmLandFactory();
        return singleton;
    }

    public synchronized Farmland getFarmLand(String name, int capacity) {
        Farmland fl = (Farmland)pool.get(name);
        if (null == fl) {
            fl = new Farmland(name, capacity);
            pool.put(name, fl);
        }
        return fl;
    }
}
