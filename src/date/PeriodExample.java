package date;

import java.time.*;
import java.util.Calendar;
import java.util.Date;

public class PeriodExample {

    public static void oldDateToLocalTime() {
        Date now = Calendar.getInstance().getTime();
        Instant instant = Instant.ofEpochMilli(now.getTime());
        LocalTime localTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalTime();
        System.out.println(now);
        System.out.println(localTime);
    }

    public static void oldDateToLocalTimeSecondOption() {
        Date now = Calendar.getInstance().getTime();
        Instant instant = now.toInstant();
        LocalTime localTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalTime();
        System.out.println(now);
        System.out.println(localTime);
    }

    public static void main(String[] args) {
        PeriodExample.oldDateToLocalTime();
        PeriodExample.oldDateToLocalTimeSecondOption();
    }
}

