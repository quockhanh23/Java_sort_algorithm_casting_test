package Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("args", "", "code", "learn", "...");
        List<String> filter = strings.stream().collect(Collectors.toList());
        System.out.println(filter);
    }
}
