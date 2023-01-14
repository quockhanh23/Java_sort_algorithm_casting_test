package date;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;

public class Time {

    public static void main(String[] args) throws ParseException {
        Instant start = Instant.now();
        Instant end = Instant.now();
        System.out.println(start);
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken: " + timeElapsed.toMillis() + " milliseconds");
    }
}
