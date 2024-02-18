package RPG.world;

import RPG.life.Entity;
import RPG.life.Player;

import java.util.ArrayList;

public interface Enterable {
    abstract void enter(Player player);
    abstract ArrayList<Entity> getEncounters();
}
