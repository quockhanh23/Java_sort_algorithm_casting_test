package Test_Date;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.stream.Stream;

public class Time {

    public void test() throws ParseException {
        String test = "";
        Date now = new Date();
        Timestamp timestamp = new Timestamp(now.getTime());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(timestamp.toString());
        String patch = simpleDateFormat.format(date).replaceAll("-", "");
        System.out.println(patch);
        String aa = Stream.of(test.split("/")).map(String::trim).findFirst().orElse(null);
    }

    // so sánh giữa 2 đối tượng thời gian xem khoảng cách là bao nhiêu ngày
    public static void main(String[] args) throws ParseException {
        Instant start = Instant.now();
        Instant end = Instant.now();
        System.out.println(start);
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken: " + timeElapsed.toMillis() + " milliseconds");
    }
}
