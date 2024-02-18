package RPG.world;

import RPG.life.Entity;
import RPG.life.Goblin;
import RPG.life.Player;
import RPG.life.Skeleton;

import java.util.ArrayList;
import java.util.Locale;

public class StartLocation implements Enterable {
    @Override
    public void enter(Player player) {
        player.setLocation("Start location");
        System.out.println("The hero is at " + player.getLocation()
                .toLowerCase(Locale.ROOT) + " now.");
    }

    @Override
    public ArrayList<Entity> getEncounters() {
        return new ArrayList<>();
    }
}
