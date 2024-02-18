package RPG.world;

import RPG.life.Entity;
import RPG.life.Goblin;
import RPG.life.Player;
import RPG.life.Skeleton;

import java.util.ArrayList;
import java.util.Locale;

public class DarkWood implements Enterable {
    public ArrayList<Entity> encounters;

    public DarkWood() {
        encounters = new ArrayList<>();
        encounters.add(new Skeleton("Bones"));
        encounters.add(new Skeleton("Skulls"));
        encounters.add(new Goblin("Boblin"));
        encounters.add(new Goblin("Doblin"));
    }

    @Override
    public void enter(Player player) {
        player.setLocation("Dark wood");
        System.out.println("The hero is at " + player.getLocation()
                .toLowerCase(Locale.ROOT) + " now.");
    }

    @Override
    public ArrayList<Entity> getEncounters() {
        return encounters;
    }
}
