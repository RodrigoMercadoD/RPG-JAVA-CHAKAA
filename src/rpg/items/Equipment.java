package rpg.items;

import rpg.entities.Player;
import rpg.enums.Stats;
import rpg.enums.WearType;

import java.io.Serializable;
import java.util.HashMap;

/**
 * The type Equipment.
 */
public abstract class Equipment extends Item implements Serializable {

    /**
     * The Stats.
     */
    protected HashMap<Stats, Integer> stats;

    protected WearType wearType;

    public HashMap<Stats, Integer> getStats() {
        return stats;
    }
}
