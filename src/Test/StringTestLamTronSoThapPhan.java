package Test;

import java.text.DecimalFormat;

public class StringTestLamTronSoThapPhan {
    public static void doubleCheck() {
        //Lớp DecimalFormat có các tùy chọn định dạng khác nhau
        // để làm tròn số thập phân dựa trên định dạng đã khởi tạo
        // Giới hạn 2 số thập phân "#.##"
        DecimalFormat df = new DecimalFormat("#.##");
        Double d = 12345.783214;
        System.out.println("");
        // Hạn chế số đằng sau dấu phẩy dùng định dạng format
        System.out.println("Original value: " + d);
        System.out.println("2 decimal format: ");
        System.out.format("%.2f", d);
        System.out.println("");
        System.out.println("Original input value: " + d);
        System.out.println("Using DecimalForamt: " + df.format(d));

        Double n = 123.4567;
        System.out.println("Original value: " + n);
        Double g = (Math.round(n * 10.0) / 10.0);
        System.out.println(g);
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("alo ");
        stringBuilder.append("blo");
        String alo = stringBuilder.toString();
        System.out.println(alo);
        StringBuilder ok = new StringBuilder();
        ok.append("khánh");
        ok.append(" 123");
        System.out.println(ok);
        String s = "JavaRunSystem";
        StringBuffer sb = new StringBuffer("JavaRunSystem");
        System.out.print(sb.equals(s) + "," + s.equals(sb));
        StringTestLamTronSoThapPhan.doubleCheck();
    }
}
