import java.util.Collections;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        BiConsumer<Integer, Double> biConsumer = (a, b) -> 22.5d;

        Predicate<String> predicate = (String str) -> str.contains("abc");

        Supplier<Long> supplier = () -> {};

        Function<String, Integer> function = (String s) -> s.length();

        BinaryOperator<String> binaryOperator = s1, s2 -> s1.concat(s2);

        UnaryOperator<Integer> unaryOperator = (String i) -> i;

        // 2
        BiFunction<String, String, Integer> biFunction = String::indexOf;

        BiPredicate<String, String> biPredicate = String::contains;

        Supplier<String> supplier1 = Object::new;

        Function<String, Integer> function1 = Integer::valueOf;

        Consumer<List<Double>> consumer = Collections::sort;

        // 3
        test(new Function<Integer, Double>() {
            @Override
            public Double apply(Integer integer) {
                return integer.doubleValue();
            }
        },new Supplier<LocalDate>() {
            @Override
            public LocalDate get() {
                return LocalDate.now();
            }
        });

        test(integer -> integer.doubleValue(), () -> LocalDate.now());

        test(Integer::doubleValue, LocalDate::now);
    }
}