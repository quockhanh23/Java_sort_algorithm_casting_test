package Test_Date;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateDifference {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(date1.getTime() + TimeUnit.DAYS.toMillis(2));

        long diffInMillis = date2.getTime() - date1.getTime();
        long diffInDays = TimeUnit.DAYS.convert(diffInMillis, TimeUnit.MILLISECONDS);

        System.out.println("Khoảng cách giữa hai ngày là: " + diffInDays + " ngày.");
    }
}