import java.util.ArrayList;
import java.util.List;

public class TestSubList {
    public static void main(String[] args) {
        String a = "1234";
        String b = "1234-1";
        String c = "1234-2";
        String d = "1234-3";
        String e = "1234-4";
        List<String> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        int maxIndex = 0;
        if (list.size() >= 13) {
            maxIndex = 12;
        } else {
            maxIndex = list.size();
        }
        List<String> newList = list.subList(0, maxIndex);
        System.out.println(newList);
    }
}
