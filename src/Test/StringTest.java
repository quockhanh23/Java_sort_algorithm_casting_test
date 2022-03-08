package Test;

public class StringTest {
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
    }
}
