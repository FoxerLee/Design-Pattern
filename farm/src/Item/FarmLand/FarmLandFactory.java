package src.Item.FarmLand;

import src.Item.Facilities.Farmland;

import java.util.HashMap;

/**
 * Farmland factory.(Singleton & Flyweight)
 * @author YGH
 * @version 2017-10-29 11:30
 */
public class FarmLandFactory {
    private HashMap pool = new HashMap();
    private static FarmLandFactory singleton;

    /**
     * Default Constructor.
     */
    private FarmLandFactory() {
    }

    /**
     * Get farmland factory singleton.
     * @return farmLandFactory
     * Singleton instance.
     */
    public static FarmLandFactory getInstance() {
        singleton = new FarmLandFactory();
        return singleton;
    }

    /**
     * Farmland pool management; Thread-safe.
     * @param name
     * Name of one single farmland.
     * @param capacity
     * Capacity of one single farmland.
     * @return farmLand
     *
     */
    public synchronized Farmland getFarmLand(String name, int capacity) {
        Farmland fl = (Farmland)pool.get(name);
        if (null == fl) {
            fl = new Farmland(name, capacity);
            pool.put(name, fl);
        }
        return fl;
    }
}
