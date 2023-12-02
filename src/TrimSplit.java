import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TrimSplit {

    // Split các phần tử và trim
    public static List<String> split(String str) {
        return Stream.of(str.split(","))
                .map(String::trim)
                .collect(Collectors.toList());
    }

    // Sắp xếp các phần từ của list thứ 2 giống với list thứ 1 với điều kiện các phần tử của 2 list phải giống nhau
    public static void alo() {
        List<String> a = Arrays.asList("test", "ao", "gg", "zlore");
        List<String> b = Arrays.asList("ao", "gg", "test");
        a.replaceAll(String::trim);
        b.replaceAll(String::trim);
        b.retainAll(a); // Giữ lại các phần tử chung giữa hai danh sách
        b.sort(Comparator.comparingInt(a::indexOf));
        System.out.println(a);
        System.out.println(b);
    }

    public static void list() {
        String test = "1212,4343,fsfd,sdfd, , , ,";
        List<String> list = Arrays.asList(test.split(","));
        List<String> list1 = list.stream().filter(item -> !item.isBlank()).toList();
        String test2 = list1.toString();
        System.out.println(test2);
    }

    public static void main(String[] args) {
        TrimSplit.split("1, 2,3,,,,");
    }
}
