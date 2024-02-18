import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.OptionalLong;
import java.util.stream.LongStream;

public class M14_TEST {
    public static void main(String[] args) {
        LongStream ls = LongStream.of(1, 2, 3);
        OptionalLong opt = ls.map(n -> n * 10).filter(n -> n < 5).findFirst();
        opt.ifPresent(System.out::println);

        // > /user/home
        Path path = Paths.get("/zoo/animals/bear/koala/food.txt");
        System.out.println(path.subpath(1, 3).getName(1).toAbsolutePath()); // /user/home/bear
    }
}