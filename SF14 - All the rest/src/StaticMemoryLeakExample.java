import java.util.*;

public class StaticMemoryLeakExample {

    static class MemoryLeak {
        static List<byte[]> DATA = new LinkedList<>();

        MemoryLeak() {
            for (int i = 0; i < 100; i++) {
                DATA.add(new byte[1024 * 1024]);
            }
        }

        void printDataSize() {
            System.out.println(DATA.size());
        }
    }

    public static void main(String[] args) {
        createMemoryLeak();
    }

    static void createMemoryLeak() {
        MemoryLeak memoryLeak = new MemoryLeak();
        memoryLeak.printDataSize();
    }
}