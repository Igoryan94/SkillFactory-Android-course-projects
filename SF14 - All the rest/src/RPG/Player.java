package RPG;

public class Player extends Entity {
    int level = 1;
    int experience = 0;
    int experienceLvlupNeeded = 1000;
    int damage;
    int health;

    public Player(int health, int damage, int dexterity) {
        super(health, damage, dexterity);
    }

    void checkLvlUp() {
        if (experience < experienceLvlupNeeded) return;
        experience = 0;
        experienceLvlupNeeded = 1000 * level + (int) (level * 0.1);
        damage = level * 5;
        health = level * 10;
    }
}
