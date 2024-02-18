package RPG.world;

import RPG.life.Entity;
import RPG.life.Player;

import java.util.ArrayList;
import java.util.Locale;

public class Merchant implements Enterable {
    @Override
    public void enter(Player player) {
//        player.setLocation("Merchant"); // TODO
        System.out.println("Merchant is not working yet...");
//        System.out.println("The hero is at " + player.getLocation()
//                .toLowerCase(Locale.ROOT) + " now.");
    }

    @Override
    public ArrayList<Entity> getEncounters() {
        return new ArrayList<>();
    }
}
