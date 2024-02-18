package RPG.life;

import RPG.life.Entity;
import RPG.world.StartLocation;

public class Player extends Entity {
    final String name = "Hero";
    String location;
    int level = 1;
    int experience = 0;
    int experienceLvlupNeeded = 1000;
    int damage;
    int health;
    int dexterity;
    int gold = 0;

    public Player() {
        super("hero", 6, 4, 2, 0);
        new StartLocation().enter(this);
    }

    public void startBattleWith(Entity entity) {
        // TODO
    }

    @Override
    void attack(Entity entity) {
        super.attack(entity);

        if (!entity.isAlive())
            gold += entity.getGoldForKill();
    }

    void checkLvlUp() {
        if (experience < experienceLvlupNeeded) return;

        experience = 0;
        experienceLvlupNeeded = 2000 * level + (int) (level * 0.1);
        damage = level * 5;
        health = level * 10;
        dexterity = (int)(level * 0.5) + 2;

        System.out.println("The " + name + " has levelled up! Level is " + level + " now.\n" +
            String.format("Parameters:\n\tdamage: %d\n\thealth: %d\n\tdexterity: %d",
                    damage, health, dexterity));
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
