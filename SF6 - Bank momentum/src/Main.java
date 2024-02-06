public class Main extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank();
        while (true) {
            System.out.println(bank.getMoney());
            sleep(1000);
        }
    }
}
