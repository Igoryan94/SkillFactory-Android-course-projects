public class Main implements Flyable {
    private void fly() {
        System.out.println("Bird flying");
    }
    public static void main(String[] args) {
        Flyable bird = new Main();
        bird.fly(); // строка 2
    }
}

// Ошибка компиляции на строке 2
// Static method may be invoked on containing interface class only
// Мы можем к ним обращаться только используя тип (т.е класс, интерфейс),
// в котором данный метод определен