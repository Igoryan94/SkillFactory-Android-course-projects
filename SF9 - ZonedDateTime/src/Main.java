import java.time.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2026, Month.AUGUST, 13); // строка 1
        LocalTime time = LocalTime.of(16, 15); // строка 2
        LocalDateTime dateTime = LocalDateTime.of(date, time); // строка 3
    }

    public static boolean isGreaterTime(LocalTime time, Duration dur) {
        return time.plus(dur).isAfter(LocalTime.now());
    }

    public static LocalTime getLocalDate(Date date) {
//        return LocalTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
    }
}