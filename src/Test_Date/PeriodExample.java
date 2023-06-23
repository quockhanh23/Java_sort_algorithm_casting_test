package Test_Date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class PeriodExample {

    public static boolean check18YearsOld(String dateOfBirth, String issuedDate) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate formatterDateOfBirth = LocalDate.parse(issuedDate, formatter);
            LocalDate formatterIssuedDate = LocalDate.parse(dateOfBirth, formatter);

            int dayDateOfBirth = formatterDateOfBirth.getDayOfMonth();
            int monthDateOfBirth = formatterDateOfBirth.getMonthValue();
            int yearDateOfBirth = formatterDateOfBirth.getYear();

            int dayIssuedDate = formatterIssuedDate.getDayOfMonth();
            int monthIssuedDate = formatterIssuedDate.getMonthValue();
            int yearIssuedDate = formatterIssuedDate.getYear();

            LocalDate startDate = LocalDate.of(yearDateOfBirth, monthDateOfBirth, dayDateOfBirth);
            LocalDate endDate = LocalDate.of(yearIssuedDate, monthIssuedDate, dayIssuedDate);

            Period period = Period.between(startDate, endDate);
            int years = period.getYears();
            return years >= 18;
        } catch (Exception e) {
            return false;
        }
    }

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

