public class Main {
    public static void main(String[] args) {
        System.out.println(doubleFromString(5,
                val -> Float.valueOf("12")));
    }

    public static double doubleFromString(int value, Worker worker) {
        return worker.rework(value);
    }
}