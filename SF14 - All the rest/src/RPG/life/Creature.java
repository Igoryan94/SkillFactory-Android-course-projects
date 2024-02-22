package RPG.life;

public class Creature implements Fighter {
    private String name;

    private int healthPoints;
    private int strength;
    private int dexterity;

    private int xp;
    private int gold;
    private int level = 1;

    public Creature(String name, int healthPoints, int strength, int dexterity, int xp, int gold) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.strength = strength;
        this.dexterity = dexterity;
        this.xp = xp;
        this.gold = gold;
    }

    @Override
    public int attack() {
        // Логика критических попаданий
        if (dexterity > getRandomValue() * 3/2) {
            System.out.println("Критический удар!");
            return strength * 2;
        }

        if (dexterity * 3 > getRandomValue()) return strength;
        else return 0;
    }

    // Повышение уровня, если достаточно опыта
    public void checkLevelUp() {
        if (xp / level < 400) {
            return;
        }

        int curHP = getMaxHP();

        level += 1;

        int addedHP = getMaxHP() - curHP;
        healthPoints = curHP + addedHP;

        int addedStr = calculateStrength() - strength;
        strength += addedStr;

        int addedDex = calculateDexterity() - dexterity;
        dexterity += addedDex;

        System.out.printf("%s достиг уровня %d! Изменения:" +
                        " здоровье: +%d очков (всего %d)," +
                        " сила: +%d очков," +
                        " ловкость: +%d очков.\n",
                name, level, addedHP, healthPoints, addedStr, addedDex);
    }

    // Расчёт максимума очков здоровья
    public int getMaxHP() {
        return 80 + (level * 20);
    }
    // и остального...
    public int calculateDexterity() {
        return 18 + (level * 2);
    }

    public int calculateStrength() {
        return 17 + (level * 3);
    }

    // Геттеры/сеттеры
    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
    public int getXp() {
        return xp;
    }
    public void setXp(int xp) {
        this.xp = xp;
    }
    public int getGold() {
        return gold;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }


    private int getRandomValue() {
        return (int) (Math.random() * 100);
    }

    @Override
    public String toString() {
        return String.format("%s: здоровье %d hp", name, healthPoints);
    }
}