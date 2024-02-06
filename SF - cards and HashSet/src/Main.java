import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Card> list = new ArrayList<>();

        list.add(new Card("червы", "6"));
        list.add(new Card("червы", "6"));
        list.add(new Card("червы", "7"));
        list.add(new Card("червы", "7"));
        list.add(new Card("червы", "8"));
        list.add(new Card("червы", "9"));
        list.add(new Card("червы", "10"));
        list.add(new Card("червы", "в"));
        list.add(new Card("червы", "д"));
        list.add(new Card("червы", "к"));
        list.add(new Card("червы", "т"));

        list.add(new Card("бубны", "6"));
        list.add(new Card("бубны", "6"));
        list.add(new Card("бубны", "7"));
        list.add(new Card("бубны", "7"));
        list.add(new Card("бубны", "8"));
        list.add(new Card("бубны", "9"));
        list.add(new Card("бубны", "10"));
        list.add(new Card("бубны", "в"));
        list.add(new Card("бубны", "д"));
        list.add(new Card("бубны", "к"));
        list.add(new Card("бубны", "т"));

        list.add(new Card("крести", "6"));
        list.add(new Card("крести", "6"));
        list.add(new Card("крести", "7"));
        list.add(new Card("крести", "7"));
        list.add(new Card("крести", "8"));
        list.add(new Card("крести", "9"));
        list.add(new Card("крести", "10"));
        list.add(new Card("крести", "в"));
        list.add(new Card("крести", "д"));
        list.add(new Card("крести", "к"));
        list.add(new Card("крести", "т"));

        list.add(new Card("пики", "6"));
        list.add(new Card("пики", "6"));
        list.add(new Card("пики", "7"));
        list.add(new Card("пики", "7"));
        list.add(new Card("пики", "8"));
        list.add(new Card("пики", "9"));
        list.add(new Card("пики", "10"));
        list.add(new Card("пики", "в"));
        list.add(new Card("пики", "д"));
        list.add(new Card("пики", "к"));
        list.add(new Card("пики", "т"));

        Set<Card> hashSet = new HashSet<>(list);

        System.out.println(hashSet.size());
    }
}