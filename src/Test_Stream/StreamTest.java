package Test_Stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> usernameList = Arrays.asList("Hòa", "Lâm", "Hòa", "Vân");
        String username = usernameList.stream()
                .parallel().filter(item -> item.equals("Hòa")).findFirst().orElse(null);
    }
}
