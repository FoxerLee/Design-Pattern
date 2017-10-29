package src.Item.FarmLandFlyweight;

import src.Item.Farmland;

/**
 * (Flyweight)
 * @author YGH
 * @version 2017-10-29 11:30
 */
public class BigFarmLand {
    private Farmland[] farmlands;

    /**
     * Build a farmland with specified size and attributes (Constructor).
     * @param landSize
     * Farmland size.
     * @param name
     * An array included each farmland's name.
     * @param capacity
     * An array included each farmland's capacity.
     */
    public BigFarmLand(int landSize, String[] name, int[] capacity) {
        farmlands = new Farmland[landSize];
        FarmLandFactory farmLandFactory = FarmLandFactory.getInstance();

        for (int i = 0; i < farmlands.length; ++i) {
            farmlands[i] = farmLandFactory.getFarmLand(name[i], capacity[i]);
        }
    }
}
