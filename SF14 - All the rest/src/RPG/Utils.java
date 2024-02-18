package RPG;

import java.util.Random;

public class Utils {
    public static int getRandomIntInclusive(int minBound, int maxBound) {
        return getRandomInt(minBound, maxBound + 1);
    }
    public static int getRandomInt(int minBound, int maxBound) {
        return new Random(System.currentTimeMillis()).nextInt(minBound, maxBound);
    }
}
