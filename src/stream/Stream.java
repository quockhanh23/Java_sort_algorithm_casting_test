package stream;

import java.util.Arrays;
import java.util.List;

public class Stream {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("args", "", "code", "learn", "...");
        List<String> filter = strings.stream().toList();
        System.out.println(filter);

    }
}
