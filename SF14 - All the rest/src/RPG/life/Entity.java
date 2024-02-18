package RPG.life;

import RPG.world.StartLocation;

public class Entity {
    String type = "Monster";
    int health;
    int damage;
    int dexterity;
    int goldForKill;
    boolean isAlive = true;

    public Entity(String type, int health, int damage, int dexterity, int goldForKill) {
        this.type = type;
        this.health = health;
        this.damage = damage;
        this.dexterity = dexterity;
        this.goldForKill = goldForKill;

        if (!type.equals("hero"))
            System.out.println(type + " spawned nearby...");
    }

    void attack(Entity entity) {
        final int entityDex = entity.getDexterity();
        final double attackChance = (double) dexterity / entityDex;
//        final double critChance = ; // todo

        entity.takeDamage(damage);
    }

    public void takeDamage(int damage) {
        if (!isAlive) return;

        this.health -= damage;
        if (health < 0) {
            health = 0;
            isAlive = false;

            System.out.println(type + " is killed!");
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getGoldForKill() {
        return goldForKill;
    }

    public void setGoldForKill(int goldForKill) {
        this.goldForKill = goldForKill;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
