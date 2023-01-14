package date;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFutureOrPastApp {

    public static final String PAST_DATE = "past date";
    public static final String TODAY_DATE = "today's date";
    public static final String FUTURE_DATE = "future date";
    public static final String MESSAGE_DATE = "The input date is ";
    public static final String Pattern = "dd-MM-yyyy";

    public static void main(String[] args) {
        String datePast = "23-12-2020";
        String dateToday = "14-01-2023";
        String dateFuture = "15-01-2023";
        if (DateFutureOrPastApp.checkDate(datePast, Pattern).equals(PAST_DATE)) {
            System.out.println(MESSAGE_DATE + PAST_DATE);
        }
        if (DateFutureOrPastApp.checkDate(dateToday, Pattern).equals(TODAY_DATE)) {
            System.out.println(MESSAGE_DATE + TODAY_DATE);
        }
        if (DateFutureOrPastApp.checkDate(dateFuture, Pattern).equals(FUTURE_DATE)) {
            System.out.println(MESSAGE_DATE + FUTURE_DATE);
        }
    }

    // Kiểm tra xem đối tượng thời gian là hiện tại hay quá khứ (so sánh với thời gian hiện tại)
    public static String checkDate(final String date, final String datePattern) throws DateTimeParseException {
        String dateFormat = date.replaceAll("/", "-");
        LocalDate localDate = LocalDate.now(ZoneId.systemDefault());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(datePattern);
        LocalDate inputDate = LocalDate.parse(dateFormat, dtf);
        if (inputDate.isBefore(localDate)) {
            return PAST_DATE;
        }
        if (inputDate.isEqual(localDate)) {
            return TODAY_DATE;
        }
        if (inputDate.isAfter(localDate)) {
            return FUTURE_DATE;
        }
        return "";
    }
}
