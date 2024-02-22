package RPG;

import RPG.life.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class World {
    private static BufferedReader br;
    private static Player player = null;
    private static BattleScene battleScene = null;

    public static void main(String[] args) {
        br = new BufferedReader(new InputStreamReader(System.in));
        //Инициализируем класс для боя
        battleScene = new BattleScene();
        //Первое, что нужно сделать при запуске игры, это создать персонажа, поэтому мы предлагаем ввести его имя
        System.out.println("Введите имя персонажа:");
        //Далее ждем ввод от пользователя
        try {
            command(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("InfiniteRecursion")
    private static void command(String string) throws IOException {
        //Если это первый запуск, то мы должны создать игрока, именем будет служить первая введенная строка из консоли
        if (player == null) {
            player = new Player(string, 100, 20, 20,
                    0, 0);
            System.out.printf("Спасти наш мир от драконов вызвался %s! Да будет его броня крепка и бицепс кругл!%n", player.getName());
            //Метод для вывода меню
            printNavigation();
        }
        //Варианты для команд
        switch (string) {
            case "1": {
                System.out.println("Торговец ещё не приехал");
                command(br.readLine());
            }
            break;
            case "2": {
                commitFight();
            }
            break;
            case "3":
                System.exit(1);
                break;
            case "да":
                command("2");
                break;
            case "нет": {
                printNavigation();
                command(br.readLine());
            }
        }
        //Снова ждем команды от пользователя
        command(br.readLine());
    }

    private static void printNavigation() {
        System.out.println("Куда вы хотите пойти?");
        System.out.println("1. К Торговцу");
        System.out.println("2. В темный лес");
        System.out.println("3. Выход");
    }

    private static void commitFight() {
        battleScene.fight(player, createMonster(), new FightCallback() {
            @Override
            public void fightWin() {
                System.out.printf("%s победил! Теперь у вас %d опыта и %d золота," +
                        " а также осталось %d единиц здоровья.%n", player.getName(),
                        player.getXp(), player.getGold(), player.getHealthPoints());
                player.checkLevelUp();
                System.out.println("Желаете продолжить поход или вернуться в город?" +
                        " (да/нет)");
                try {
                    command(br.readLine());
                } catch (IOException e) {
                    System.out.println("Ошибка в логике чтения команд! Текст: " + e);
                }
            }

            @Override
            public void fightLost() {

            }
        });
    }

    interface FightCallback {
        void fightWin();
        void fightLost();
    }

    private static Creature createMonster() {
        //Рандомайзер
        int random = (int) (Math.random() * 10);
        //С вероятностью 50% создается или скелет, или гоблин
        if (random % 2 == 0) return new Goblin(
                "Гоблин",
                50,
                10,
                10,
                100,
                20
        );
        else return new Skeleton(
                "Скелет",
                25,
                20,
                20,
                100,
                10
        );
    }
}
