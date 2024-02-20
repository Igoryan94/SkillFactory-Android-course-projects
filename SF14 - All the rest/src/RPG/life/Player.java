package RPG.life;

import RPG.life.Entity;

public class Player extends Entity {
    public Player(String name, int healthPoints, int strength, int dexterity, int xp, int gold) {
        super(name, healthPoints, strength, dexterity, xp, gold);
    }
}