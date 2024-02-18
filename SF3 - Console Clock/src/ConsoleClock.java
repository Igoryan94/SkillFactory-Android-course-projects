import java.time.LocalTime;

public class ConsoleClock extends Thread {
    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                LocalTime currentTime = LocalTime.now();
                String timeString = String.format("%02d:%02d:%02d",
                        currentTime.getHour(),
                        currentTime.getMinute(),
                        currentTime.getSecond());
                System.out.println(timeString);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("The clock was stopped");
        }
    }
}
