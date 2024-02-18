import java.util.Optional;
import java.util.Random;

//public class Main {
//    public static void main(String[] args) {
//        String text = "Hello";
//
//        Optional<String> opt = Optional.of(refactorText(text)); // строка 1.1
//        System.out.println(opt.isPresent());
//
//        Optional<String> opt1 = Optional.ofNullable(refactorText(text)); // строка 2.1
//        System.out.println(opt1.orElse(new IllegalStateException())); // строка 2.2
//    }
//
//    private static String refactorText(String text) {
//        if (text.length() >= 5) {
//            return null;
//        } else {
//            return text + " refactored";
//        }
//    }
//}

/// Ошибка при запуске на строке 1.1

/// Код не компилируется на строке 2.2

public class Main {
    public static void main(String[] args) {
        Optional<String> guessResult = guess(5);
        guessResult.ifPresent(System.out::println);
        System.out.println(guessResult.orElse("Не угадал"));
    }

    static Optional<String> guess(int guess) {
        if (guess < 1 || guess > 5)
            throw new IllegalStateException();
        else {
            Random random = new Random();
            int val = random.nextInt(5);

            if (val == guess)
                return Optional.of("Поздравляем! Вы угадали значение!");
            else return Optional.empty();
        }
    }
}