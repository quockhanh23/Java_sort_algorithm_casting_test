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

        // Tạo hai đối tượng Date
        Date date112 = new Date(); // Ngày hiện tại
        Date date212 = new Date(System.currentTimeMillis() + 1000000000); // Ngày sau 1 tỷ mili giây (khoảng 11.57 ngày)

        // So sánh
        if (date112.compareTo(date212) > 0) {
            System.out.println("date1 lớn hơn date2");
        } else if (date112.compareTo(date212) < 0) {
            System.out.println("date1 nhỏ hơn date2");
        } else {
            System.out.println("date1 bằng date2");
        }
    }
}