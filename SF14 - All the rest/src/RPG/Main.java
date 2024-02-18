package RPG;

import RPG.life.Entity;
import RPG.life.Goblin;
import RPG.life.Player;
import RPG.life.Skeleton;
import RPG.world.DarkWood;
import RPG.world.Enterable;
import RPG.world.Merchant;

public class Main {
    public static void main(String[] args) {
        Entity player = new Player();

        Enterable darkWood = new DarkWood(),
            merchant = new Merchant();
    }
}
