import java.util.*;

public class Main implements Comparable<Main>, Comparator<Main> {
    private int num;
    private String text;

    public Main(int num, String text) {
        this.num = num;
        this.text = text;
    }

    @Override
    public String toString() {
        return "" + num;
    }

    @Override
    public int compareTo(Main o) {
        return text.compareTo(o.text);
    }

    @Override
    public int compare(Main o1, Main o2) {
        return o1.num - o2.num;
    }

    public static void main(String[] args) {
        Main firstElement = new Main(88, "a");
        Main secondElement = new Main(55, "b");

        TreeSet<Main> treeSet1 = new TreeSet<>();
        treeSet1.add(firstElement);
        treeSet1.add(secondElement);

        TreeSet<Main> treeSet2 = new TreeSet<>(firstElement);
        treeSet2.add(firstElement);
        treeSet2.add(secondElement);

        System.out.println(treeSet1 + " " + treeSet2);
    }
}
