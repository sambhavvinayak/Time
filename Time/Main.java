import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter time = DateTimeFormatter.ofPattern("dd/mm/yy HH/mm/ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(time.format(now));
    }
}
