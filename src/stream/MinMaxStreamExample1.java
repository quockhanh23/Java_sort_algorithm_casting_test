package stream;

import java.util.Arrays;
import java.util.List;

public class MinMaxStreamExample1 {
    public static void main(String[] args) {
        Integer []numbers = {1, 8, 3, 4, 5, 7, 9, 6};


        // Find max, min with Collection ====================
        List<Integer> listOfIntegers = Arrays.asList(numbers);
        System.out.println(listOfIntegers);

        // Max = 9
        Integer max = listOfIntegers.stream()
                .mapToInt(v -> v)
                .max()
                .getAsInt();

        // Min = 1
        Integer min = listOfIntegers.stream()
                .mapToInt(v -> v)
                .min()
                .getAsInt();
        System.out.println(min);
        System.out.println(max);
    }
}
